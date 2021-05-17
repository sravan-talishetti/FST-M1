import pandas
from pandas import ExcelWriter

	
data = {
	'FirstName':["Sravan", "Sunny", "Sai"],
	'LastName':["Talishetti", "Thumma", "Rath"],
	'Email':["sratali@example.com", "sunmma@example.com", "sairath@example.com"],
	'PhoneNumber':["4537829158", "4892184058", "4528727830"]
}

dataframe = pandas.DataFrame(data)
print(dataframe)

writer = ExcelWriter("sample.xlsx")
dataframe.to_excel(writer, "Sheet1", index = False)
writer.save()