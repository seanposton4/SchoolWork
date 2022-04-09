import pandas as pd

df = pd.read_csv("BL-Flickr-Images-Book.csv")
nf = pd.read_csv("newfile2.csv")
nf["Author"] = df.Author.str.split("-").str[0].str.split("|").str[0]
nf.to_csv("newfile2.csv")
nf["Contribututors"] = df.Contributors.str.split("-").str[0].str.split("|").str[0]
nf.to_csv("newfile2.csv")
