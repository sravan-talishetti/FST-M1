listOne = [1,2,3,5,6,8,11]
listTwo = [10,20,31,39,41,82]
print("Listone - ",listOne,"ListTwo - ",listTwo)
listThree = []
for num in listOne:
    if num % 2 != 0:
        listThree.append(num)

for num in listTwo:
    if num % 2 == 0:
        listThree.append(num)
print("combined list of odd and even - ", listThree)