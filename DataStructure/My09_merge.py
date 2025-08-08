arr1 = [1, 2, 3, 4, 5]
arr2 = [6, 7, 8, 9, 10]
new_arr = []
p1 = 0
p2 = 0

while p1 < len(arr1) and p2 < len(arr2):
    if arr1[p1] < arr2[p2]:
        new_arr.append(arr1[p1])
        p1 += 1
    else:
        new_arr.append(arr2[p2])
        p2 += 1

while p1 < len(arr1):
    new_arr.append(arr1[p1])
    p1 += 1

while p2 < len(arr2):
    new_arr.append(arr2[p2])
    p2 += 1

print(new_arr)