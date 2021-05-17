def calculateAdd(num):
    if num:
        return num + calculateAdd(num-1)
    else:
        return 0
    
res = calculateAdd(10)

print(res)