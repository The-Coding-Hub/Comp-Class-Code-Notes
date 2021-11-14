l1 = [1, 2, 3, 4, 5, 6]

print(id(l1)) # ID: 2413093352256

l1.append(7)

print(id(l1)) # ID: 2413093352256

# Integer is immutable!

# List Inside List
l2 = [1, 2, 3, [1, 2, 3]]

# Empty List
l3 = []

# Accessing Items using Index
l4 = ['Aniket', 'Prameya', 'Satwik', 'Debesh']

# | 0 <- 'Aniket' -> -4 | 1 <- 'Prameya' -> -3 | 2 <- 'Satwik' -> -2 | 3 <- 'Debesh' -> -1 |

print(l4[0], l4[1]) # OP: Aniket Prameya

print(l4[-1], l4[-2]) # OP: Debesh Satwik