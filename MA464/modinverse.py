import math
mod = 8

invertibleAndInverses = {'Invertible': [], 'Inverse': []}
for i in range(mod):
    if math.gcd(i, mod) == 1:
        invertibleAndInverses['Invertible'].append(i)
        for j in range(mod):
            if (i * j) % mod == 1:
                invertibleAndInverses['Inverse'].append(j)

print(f'Invertibles: {invertibleAndInverses["Invertible"]}')
print(f'Inverses:    {invertibleAndInverses["Inverse"]}')

#Uncomment to write to a file if output is too long.
# fileout = open('output.txt', 'w')
# fileout.write(f'Modulo: {mod}\n\n')
# fileout.write(f'Invertibles: {str(invertibleAndInverses["Invertible"])}')
# fileout.write(f'\nInverses:    {str(invertibleAndInverses["Inverse"])}')