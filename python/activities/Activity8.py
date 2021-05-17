num = list(input("Enter numbers - "))
print(num)
firstNum = num[0]
lastNum = num[-1]
if firstNum == lastNum:
    print("first-number and last-number matches both!")
else:
    print("first-number and last-number doesn't match")