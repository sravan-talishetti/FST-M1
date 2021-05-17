def calculateAdd(num):
    sum = 0
    for n in num:
        sum += n
    return sum

numList = [10,3,27,17]
print("Numbers in the list - ", numList)

res = calculateAdd(numList)

print(res)