# Enter 3 number and print the greatest one.

n1 = int(input("Number 1: "))
n2 = int(input("Number 2: "))
n3 = int(input("Number 3: "))

if n1 > n2 and n1 > n3:
    print(f"{n1} is largest")
if n2 > n1 and n2 > n3:
    print(f"{n2} is largest")
if n3 > n2 and n3 > n1:
    print(f"{n3} is largest")

# OR

if n1 > n2 and n1 > n3:
    print(f"{n1} is largest")
elif n2 > n1 and n2 > n3:
    print(f"{n2} is largest")
else:
    print(f"{n3} is largest")