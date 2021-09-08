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
# fileout = open('output.txt', 'w')
# fileout.write(f'Modulo: {mod}\n\n')
# fileout.write(f'Invertibles: {str(invertibleAndInverses["Invertible"])}')
# fileout.write(f'\nInverses:    {str(invertibleAndInverses["Inverse"])}')