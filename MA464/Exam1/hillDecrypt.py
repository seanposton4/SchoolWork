import math
import string
import numpy as np
#Needs key, keyinv, and ct from user.

ct = 'GBRGP UEOGG TQWKM QLMHX OEOVK OAPLA TFYXA YGYBY XVPMS GNAOWBHDGE WWUIU RSIYY EEPEY IPNFX EOTSQ KFHIO EGNJI HFKBW ILHGEMCYSY BCLEO IAZYE WAANW EVCGH YGLEP MSJYG XCKBO MGXJA ZEFTOACFBW IEGYL GUGIO UOOAR ETRAW ULAHW ADVTX KYZUH IVIIB GDTTRAFMCE FIHZT HVKXA EWIHG TMSMC IYTWQ AAQFO OJIMF UKHAZ XEMJTHCEFA TSFOI ZAEWB GKAHY UNZEW AANWE VCGHY GLEPM SJYGX CKBOMLZEEW GVPIL UKBEB NOTGN BENAN BUIUU FNWSD UFWST KCQHF TSFIYTZCYE NEARB HXORG GWKMF WDOOM HZTHF KIWNN IYIUU SKEJC YYHSKGYHCG CIYGE SNNAQ BDWYE LZEEE BFAKA CZECL NXWSU MAIJW KMSAUVKNEG VAHTA VYSKU ZEEOY VALWH VKGNB HHWEI TTNYE CZAPA NOTGNBNLWR CMSKE AFWPC EECQA PAGDT TFGHA YATOQ DAUML KYIVF AEARERXNFI ECNRF ERSLM KASPS UOOAJ KSXUL TUGQP WCDAR BQRWP HDEQQAERYY EOJSN REBMA QVNYD JECOG TQSXU GJXCY WNFXR COBMA QFKAPFBEEY XOFSQ YXOFY ARSLM GCHZE IAOSC SUSXE ANOSC CAFBM ATQQGDTADL QNKIG PVPIA TODPA AIJBT KLUKR SLIWH AFCNY MHKHB MCUFOEIVYO IEJCO QRVKM OGPOY SYJJS KIRVW APAIY LARBI XEHDY TUOMAMVKNN OTOOH NXMHQ NHNKB CMSUF YDJRW GYYEP MSVQW RCMIY TQHONNADLG BYACF TCEEG BEBIC RQWGC XHERH HACXS TIUZC YRWCO LAXUUGNBGC XHERJ OYGVO HWXEE UREJE EUEOJ YDJEO JYDJE OJYDJ RIGQZSBWIE SCGEF ZFWHR IYVYA RRKDB'
ct = ct.replace(' ', '')
key = [[14, 19, 22], [0, 12, 21], [13, 22, 2]]
keyinv = [[14, 14, 11], [13, 20, 24], [0, 1, 16]]
ctm = []
print(f'Cipher Text: \n{ct}')
#Change ciphertext to numbers
alpha = list(string.ascii_uppercase)
alphakey = {}
for i in range(26):
  alphakey[alpha[i]] = i
ctn = []
for ch in ct:
  ctn.append(alphakey[ch])

#Break ciphertext into matrix based on key length for multiplication
for i in range(len(ctn)):
  if i % len(key) == 0:
    ctm.append([])
  ctm[math.floor(i / len(key))].append(ctn[i])
#print(ctm)

#Pad String if necessary
if len(ctm[-1]) < 3:
  while len(ctm[-1]) < 3:
    ctm[-1].append('Q')

print(f'Cipher Text Matrix Numbers: \n{ctm}')

# for i in range(len(ctm)):
#   print(f'{i}: {ctm[i]}')

#Multiply ciphertext matrix by inverse key
ptmn = np.matmul(ctm, keyinv)
pt = ''

#Make multiplied matrix % 26
for i in range(len(ptmn)):
  for j in range(len(ptmn[i])):
    ptmn[i][j] = ptmn[i][j] % 26
print(f'Plain Text Matrix Numbers: \n{ptmn}')

#Convert plaintext matrix to plaintext
for i in range(len(ptmn)):
  for j in range(len(ptmn[i])):
    pt += list(alphakey.keys())[list(alphakey.values()).index(ptmn[i][j])]

print(f'Plain Text: \n{pt}')