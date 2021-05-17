def fibonacci(num):
    if num <= 1:
        return num
    else:
        return(fibonacci(num-1) + fibonacci(num-2))

n = int(input("Enter a number - "))

if n <= 0:
    print("Enter a number greater than zero")
else:
    print("Fibonacci sequence: ")
    for i in range(n):
        print(fibonacci(i))