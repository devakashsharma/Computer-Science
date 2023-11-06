# A Dictionary is a collection which is unorder and, changeable and indexed and also no duplicate is allow

person = {
    'first_name': 'Akash',
    'last_name': 'Sharma',
    'age': 21
}
print(person, type(person))

# we can also use the constructor to create a dictionary
# person2 = dict(first_name="Akash", last_name="Sharma", age=21)
# print(person, type(person2))

# get a value
print(person['first_name'])
print(person.get('last_name'))

# Add keys
person['roll_no'] = 15303

print(person)

# get dictionary keys
print(person.keys())

# get dict items
print(person.items())

# copy
clone_person = person.copy()
clone_person['course'] = 'BCA'
print("The clone of person is: ", clone_person)

# remove from a dictionary
# del(person['roll_no'])
person.pop('roll_no')
print(person)

# print(len(person))

# list of dictionary
new_person = [
    {'name': 'Avenger', 'type': 'superhero'},
    {'name': 'spiderman', 'age': 43}
]
print(new_person)

print(new_person[0]['name'])