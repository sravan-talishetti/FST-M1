shop = {
    "Apple" : 18,
    "Banana" : 3,
    "Custard-Apple" : 8,
    "Dragon-Fruit" : 13
}

userChoice = input("Enter your choice of fruit - ")
if userChoice in shop:
    print("It is available!")
else:
    print("Sorry, Not available!")
