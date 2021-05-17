	
import pandas
data = {
  "Usernames": ["admin", "root", "Deku"],
  "Passwords": ["password", "123Abc.", "AllMight"]
}
 
dataframe = pandas.DataFrame(data)
 
print(dataframe)
dataframe.to_csv("sample.csv", index=False)