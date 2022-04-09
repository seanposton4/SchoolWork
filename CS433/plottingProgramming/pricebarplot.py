"""Create a grid of bar plots with each one representing a single zipcode and in that zipcode the price distribution is grouped by the category of condo, residential and multi-family, please also include ticks, labels and legend in your plot"""
import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns

df = pd.read_csv('realestatetransactions.csv')

g = sns.FacetGrid(df, col='zip', col_wrap=2, hue='type', 
                  aspect=3, size=2)
g.map(sns.barplot, 'price')
plt.show()