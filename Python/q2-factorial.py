n = int(input("Number: "))
factorial = 1
i = 1

while i <= n:
  factorial = factorial * i
  i += 1

print(f"Factorial of {n} is {factorial}") 