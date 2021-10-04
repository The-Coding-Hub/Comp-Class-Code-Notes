# Typecasting in Python

x = 100
y = 2.3
# print(x + y)  # Output: 102.3
# print(type(x + y))

# Example of Data Lose
a = 10.2
b = int(a)  # Here 10 is stored and .2 is lost!
# print(b)

# Example 1
p = 125.3
q = int(p)
# print(q)  # Output: 125 ( Float -> Integer )
# Example 2
c = 123
d = float(c)
# print(d)  # Output: 123.0 ( Integer -> Float )
