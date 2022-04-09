--Display matrixA 
print("Matrix A")
print("========")
io.write("Enter the rows of A matrix: ")
rowA=io.read()
io.write("Enter the columns of A marix: ")
colA=io.read()
mA={}
print("Enter the elements of A marix: ")
for i=1, rowA do
  mA[i]={}
  for j=1, colA do
      mA[i][j]=io.read()
  end
end
print("The marix A is:")
for i=1, rowA do
  for j=1, colA do
      io.write(mA[i][j], ' ')
  end
  print('\n')
end

--display matrixB
print("Matrix B")
print("========")
io.write("Enter the rows of B matrix: ")
rowB=io.read()
io.write("Enter the columns of B marix: ")
colB=io.read()
mB={}
print("Enter the elements of B marix: ")
for i=1, rowB do
  mB[i]={}
  for j=1, colB do
      mB[i][j]=io.read()
  end
end
print("The marix B is:")
for i=1, rowB do
  for j=1, colB do
      io.write(mB[i][j], ' ')
  end
  print('\n')
end

--Matrix A * Matrix B get the Matrix C
if rowA ~= colB and rowB ~= colA then
   print("Incompatible Dimensions")
else
  mC={}
  for i=1, rowA do
    mC[i]={}
    for j=1, colB do
        mC[i][j]=0
    end
  end
  for i=1, rowA do
    for j=1, colB do
      for k=1, rowB do
        mC[i][j]=mC[i][j]+mA[i][k]*mB[k][j]
      end
    end
  end
  print("A x B = \n")
  for i=1, rowA do
     for j=1, colB do
       io.write(mC[i][j],' ')
     end
   print('\n')
  end  
end
 