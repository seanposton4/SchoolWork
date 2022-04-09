import pandas as pd
#read csv file
olympics_df = pd.read_csv('C:\\Users\\muzzl\\Downloads\\olympics.csv', header=1)

olympics_df.drop([len(olympics_df)-1],inplace=True)

#rename columns for easier navigation
new_names =  {'Unnamed: 0': 'Country',
            '? Summer': 'Summer Olympics',
            '01 !': 'Gold',
            '02 !': 'Silver',
            '03 !': 'Bronze',
            '? Winter': 'Winter Olympics',
            '01 !.1': 'Gold.1',
            '02 !.1': 'Silver.1',
            '03 !.1': 'Bronze.1',
            '? Games': '# Games',
            '01 !.2': 'Gold.2',
            '02 !.2': 'Silver.2',
            '03 !.2': 'Bronze.2'}

#confirm rename of the object
olympics_df.rename(columns=new_names, inplace=True)

#output the top 5 countries leading with gold medals
olympics_df.nlargest(5, ['Gold.2'])
