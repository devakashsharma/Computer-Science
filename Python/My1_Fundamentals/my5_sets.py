# it is a little bit difference from the tuples and list
# set are the collection which is unordered and unindexed and there is no duplicate allow

# create a set
name_set = {'star wars', 'mission impossible', 'avengers'}
print(name_set)

# check if it is in set or not
print('star wars' in name_set) # it will return the boolean

# add to set
name_set.add('fast')
print(name_set)

# remove
name_set.remove('fast')
print(name_set)

# clear set
# name_set.clear()
# print(name_set) # but it will show that the set is made but it will delete the all the values inside of it

# but in order to delete a set then we need to do
del name_set
print(name_set)