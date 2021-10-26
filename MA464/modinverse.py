# Find all invertible elements and their inverses
# given a modulo.

import math
mod = 26

invertibleAndInverses = {'Invertible': [], 'Inverse': []}
for i in range(mod):
    if math.gcd(i, mod) == 1: 
        #A number is invertible if the gcd of the number and the modulo is 1.
        invertibleAndInverses['Invertible'].append(i)
        for j in range(mod):
            if (i * j) % mod == 1:
                #A number's inverse occurs when the number is multiplied by a number
                #, % 26, and it equals 1.
                invertibleAndInverses['Inverse'].append(j)
                break

print(f'Invertibles: {invertibleAndInverses["Invertible"]}')
print(f'Inverses:    {invertibleAndInverses["Inverse"]}')
print(f'Number n:    {len(invertibleAndInverses["Invertible"])}')

#Uncomment to write to a file if output is too long.
fileout = open('./output.txt', 'w')
fileout.write(f'Modulo: {mod}\n\n')
for i in invertibleAndInverses['Invertible']:
    fileout.write('%5d' % i)
fileout.write('\n')
for i in invertibleAndInverses['Inverse']:
    fileout.write('%5d' % i)