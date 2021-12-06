# Find all invertible elements and their inverses
# given a modulo.

import math
mod = 1687545040

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

# print(f'Invertibles: {invertibleAndInverses["Invertible"]}')
# print(f'Inverses:    {invertibleAndInverses["Inverse"]}')
# print(f'Number n:    {len(invertibleAndInverses["Invertible"])}')

#Uncomment to write to a file if output is too long.
fileout = open('./output.txt', 'w')
fileout.write(f'Modulo: {mod}\n\n')
fileout.write('%10s' % 'Invertibles')
fileout.write('%10s\n' % 'Inverses')
for i in range(len(invertibleAndInverses['Invertible'])):
    fileout.write('%10d' % invertibleAndInverses['Invertible'][i])
    fileout.write('%10d\n' % invertibleAndInverses['Inverse'][i])