import pandas

dataframe = pandas.read_csv("employees.csv")
print(dataframe)
print(dataframe["Name"][2])