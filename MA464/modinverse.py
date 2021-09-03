import math
mod = 8

invertibleAndInverses = {'Invertible Elems': [], 'Inverses': []}
for i in range(mod):
    if math.gcd(i, mod) == 1:
        invertibleAndInverses['Invertible Elems'].append(i)
        for j in range(mod):
            if (i * j) % mod == 1:
                invertibleAndInverses['Inverses'].append(j)

print(f'Invertibles: {invertibleAndInverses["Invertible Elems"]}')
print(f'Inverses:    {invertibleAndInverses["Inverses"]}')

# #Uncomment to write to a file if output is too long.
# fileout = open('output.txt', 'w')
# fileout.write(f'Modulo: {mod}\n\n')
# fileout.write(f'Invertibles: {str(invertibleAndInverses["Invertible Elems"])}')
# fileout.write(f'\nInverses:    {str(invertibleAndInverses["Inverses"])}')