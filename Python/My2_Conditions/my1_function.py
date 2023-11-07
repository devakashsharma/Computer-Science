# A function is a block of code, which is only perform when it is called

# create a function
def welcome(name='user'):
    print(f"Hello, {name}")

# name = input("Enter Your Name: ")
# welcome(name)

# return values
def add_two(num1, num2):
    total = num1 + num2
    return total

total = add_two(23, 43)
print(total)

# A lambda is a small anonymous funtion.
# A lambda function can take any number of arguments, but can only have one expression.

getSum = lambda num1, num2 : num1 + num2

print(getSum(23, 34))