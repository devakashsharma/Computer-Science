# print("Hello  World")

# x = 34
# y = 34.98
# z = 'zek'
# is_correct = True

x, y, z, is_correct = (23, 34.34, 'name', True) # Multiple assignment
print("Akash Sharma")
print(x, y, z, is_correct)

# type casting
num = 34
print(type(num))

num = str(num)
print(type(num))

num = int(num)
print(type(num))

line1 = "********************"
line2 = "*                  *"
line3 = "*     Welcome!     *"

print('')
print(line1)
print(line2)
print(line3)
print(line2)
print(line1)



# CS50 - Intro to PY - 1

# csName = input("Enter name: ")
# print("Hello, ")
# print(csName)

#But if i want to print the name at the same line as hello have, then i can do this
# print("hello, ", end='')
# # print(csName)
# so here the end='' is showing that there will no automatic next line, in the behind of the code it is in the form of end='\n' 


# print("hello,", csName, sep='')
# so now there will not be any space because of sep=''

print("Hello, \"World\"")

n = "Neo"
# print(f"Hello, {n}")

newName = input("Enter name: ").strip().title()

# remove whitespace
# newName = newName.strip()

# capital the first letter of the sentence
# newName = newName.capitalize()

# capital al the first letter of any word
# newName = newName.title()

# newName = newName.strip().title()

print(f"hello, {newName}")