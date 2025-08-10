# Reverse an array.
arr = [1, 2, 3, 4, 5]
rev_arr = []

for i in range(len(arr) - 1, -1, -1):
    rev_arr.append(arr[i])

print(rev_arr)

newArr = rev_arr[::-1]
print(newArr)