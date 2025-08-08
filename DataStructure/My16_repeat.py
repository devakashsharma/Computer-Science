# Find the first repeating element.
def repeating_number(arr):
    num = set()
    for i in arr:
        if i in num:
            return i
        num.add(i)
    return None

arr = [10, 5, 3, 4, 3, 5, 6]
repeat = repeating_number(arr)
print(f"First Repeat Number is: {repeat}")