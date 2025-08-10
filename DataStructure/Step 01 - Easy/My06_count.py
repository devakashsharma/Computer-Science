count = 0
element = 2
arr = [2, 4, 6, 8, 10, 4, 5, 2, 4]

for i in range(len(arr)):
    if element == arr[i]:
        count = count + 1

print(f"Total number repeat of {element} is: {count}")