n = input("Number: ")
i = 0
sum = 0
while i < len(n):
  sum = sum + (int((n[i]))*int(n[i])*int(n[i]))
  i += 1

if int(n) == sum:
  print(f"{n} is an armstrong number!")
else:
  print(f"{n} is not an armstrong number!")