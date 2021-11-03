# Simple Calculator

num_1 = float(input("Number 1: "))
num_2 = float(input("Number 2: "))
operator = input("Operator (+, -, *, /): ")
result = None

if (operator == "+"):
  result = num_1 + num_2
elif (operator == "-"):
  result = num_1 - num_2
elif (operator == "*"):
  result = num_1 * num_2
elif (operator == "/"):
  result = num_1/num_2
else:
  result = "Operator not found!"

print(f"Result:\n{num_1} {operator} {num_2} = {result}")