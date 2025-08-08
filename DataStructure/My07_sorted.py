is_sorted = True
arr = [1, 2, 3, 4, 2, 6]

for i in range(len(arr) - 1):
    if arr[i] > arr[i + 1]:
        is_sorted = False
        break
        
print(is_sorted)