x = 5
y = 51

# if else
# if x > y:
#     print(f"x: {x} is greater than y: {y}")
# else:
#     print(f"y: {y} is greater than x: {x}")

# else if
# if x > y:
#     print(f"x: {x} is greater than y: {y}")
# elif x == y:
#     print(f"x: {x} is equal to y: {y}")
# else:
#     print(f"y: {y} is greater than x: {x}")

# nested if
# if x > 2:
#     if x <= 10:
#         print(f"{x} is greater than 2 as well smaller than and equal to 10")

# we can also avoid it by using the logical operator, nested if is good untill it is required

# and
if x > 2 and x <= 10:
    print(f"{x} is greater than 2 but it is also smaller than 10")

# or
a = 5
b = 4
if a > b or a >= b:
    print(f"{a} is greater than {b}")

# not
if not(a > b):
    print(f"{b} is greater than {a}")

# check if it is available or not by using, in and not in operator
# name_list = ['akash', 'sharma', 'light', 'yagami']
# name = 'akash'
# if name in name_list:
#     print(f"{name} is availabel in the name list", name in name_list) # it return the true or false
# else:
#     print(name not in name_list)

# is identity operator
num1 = 3
num2 = 3
if num1 is num2:
    print(f"the value of {num1}, and the value of ohters are {num2}", num1 is num2)

# we can also use it by using 'is' and 'is not', 'in', 'not in'