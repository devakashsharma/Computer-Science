arr = [10, 20, 30, 40, 40]
first = 1
for i in range(1, len(arr)):
    if arr[i] != arr[i - 1]:
        arr[first] = arr[i]
        first += 1

print(arr)