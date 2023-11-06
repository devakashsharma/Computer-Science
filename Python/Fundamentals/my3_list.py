# list in pythons are like an array, but it is the collection of different data types and mutable, it also allow to duplicate the values
# there are 3 ways to create a list

# 1st - create a list
numbers = [1, 2, 3, 4, 5]

# 2nd - use a constructor
numbers2 = list((1, 2, 3, 4, 5))

# printing the value
print(numbers, numbers2)

names = ['naruto', 'sasuke', 'sikhamaru', 'lee', 'neji']
print(names)

# get a value of list
print(names[0])

# get length of a list
print(len(names))

# append
names.append('madara')
print(names)

# remove
names.remove('neji')
print(names)

# insert
names.insert(1, 'light')
print(names)

# remove
names.pop(3)
print(names)

# reverse
names.reverse()
print(names)

# sort
names.sort()
print(names)

# reverse sort
names.sort(reverse=True)
print(names)

# Change the value
names[4] = 'pain'
print(names)