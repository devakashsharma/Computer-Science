name = 'Akash'
age = 21

# Concatinate
# print("Hey There, I'm " + name + " and my age is " + str(age))
# we cannot concatinate the strings with an integers, so in order to perform some operations we need to convert the int to str

# there is another way to do that

# string formatting

# arguments by positions
# print("Hello there, I'm {name} and my age is {age}".format(name=name, age=age))

# f-string 
# print(f"Hello there, I'm {name} and my age is {age}")

# String methods

# string capitalize
cap = 'akash sharma'
print(cap.capitalize()) # it will capital the first letter of a string
print(cap.upper())
print(cap.lower())
print(cap.swapcase()) # it will swap the string
print(len(cap)) # it will give the length of the string
print(cap.replace('akash', 'Akash'))
count = 'h'
print(cap.count(count)) # it will count the occurance of the given charater
print(cap.count('a'))
print(cap)
print(cap.startswith("akash")) # it should be start from the given the input and the output will be in truw/false
print(cap.endswith('a')) # same as the upper but it will be perform for the end
print(cap.split()) # it will split the string, if there is space between the string then it will split them, ex - "Akash Sharma" - ['Akash', 'Sharma']
print(cap.find('k')) # it will give the index of the first occurance
print(cap.isalnum()) # it should be between a-z or A-Z or 0-9 and also there shouldn't be white spaces
print(cap.isalpha()) # it should be a-z and A-Z no numerical number and also there shouldn't be white spaces
print(cap.isnumeric()) # it should be numeric