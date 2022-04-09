"""Create a grid of bar plots with each one representing a single zipcode and in that zipcode the sq_ft distributionis grouped bythe category of condo, residential and multi-family, please also include ticks, labels and legend in your plot"""
import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns

df = pd.read_csv('realestatetransactions.csv')

g = sns.FacetGrid(df, col='zip', col_wrap=2, hue='type', legend_out=True, 
                  aspect=3, size=2)
g.map(sns.barplot, 'sq__ft')
plt.show()