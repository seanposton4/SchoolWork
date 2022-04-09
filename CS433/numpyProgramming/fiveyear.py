# Question 5
# Sean Poston
import numpy as np
np.set_printoptions(formatter={'float': lambda x: "{0:13.2f}".format(x)})
"""
Array Postitions
0 - Date
1 - Open
2 - High
3 - Low
4 - Close
5 - Adj Close
6 - Volume
"""

def generator(file):
    file.readline()
    for row in file:
        ret = row.split(',')
        ret[-1] = ret[-1].rstrip('\n')
        yield np.asarray(ret)


if __name__ == '__main__':
    file = open('SP500.csv', 'r')
    gen = generator(file)
    
    
    segYear = 0
    averages = []
    """
    [year][0] - open
    [year][1] - close
    [year][2] - vol
    [year][3] - gain/loss
    """

    count = 0
    curOpen = 0.0
    curClose = 0.0
    fluct = 0.0 # gain/loss
    curVol = 0


    for row in gen:
        currentYear = int(row[0][0:4])
        if segYear == 0:
            segYear = currentYear
        if currentYear > segYear + 4 or row[0] == '2018-04-27':
            #averages
            averages.append([curOpen / count, curClose / count, 
                curVol / count, fluct / count]) 
            #reset numbers
            count = 0
            curOpen = float(row[1])
            curClose = float(row[4])
            curVol = int(row[6])
            fluct = 0
            segYear += 5
        else:
            count += 1
            curOpen += float(row[1])
            curClose += float(row[4])
            curVol += int(row[6])
            fluct += float(row[4]) - float(row[1])

    for i in range(len(averages)):
        averages[i].insert(0, 1950 + i * 5)
    averages = np.array(averages)
    print(f'{"Year":>15}{"Open":>14}{"Close":>14}{"Volume":>14}{"Gain/Loss":>14}')
    print(averages) #print out averages of each column for each year

    maxAvgProfit = averages[0][4]
    mostProfitYear = averages[0][0]

    for row in averages:
        if row[4] > maxAvgProfit:
            maxAvgProfit = row[4]
            mostProfitYear = row[0]

    print(f'Most profitable year: {mostProfitYear}')