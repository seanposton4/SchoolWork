import pandas as pd

df  = pd.read_csv("BL-Flickr-Images-Book.csv")
nf = df.Title.str.split(".").str[0]
nf.to_csv("newfile.csv")