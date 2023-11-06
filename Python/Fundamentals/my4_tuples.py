# Tuples is the same as the list but the only thing in is this, tuple are immutable, means we cannot change it's value

# create way
names = ('naruto', 'naruto shippuden', 'erased', 'death note')

# use a constructor
names2 = tuple(('one piece', 're-zero', 'spyxfamily'))

name3 = ('Light')
name4 = ('Naruto',)

print(names, names2)
print(name3, name4) # the only difference is that, if we have only one value in our tuple then it consider it as a string but if we use ',' after the value then it is consider them as a tuple

print(names2[2])

# del name3 # it will delete the name3 variable
# print(names3)
print(len(names))