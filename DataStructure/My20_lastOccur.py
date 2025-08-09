# Find the index of last occurrence of a number using binary search.
def last_occurance(arr, target):
    arr.sort()
    last_index = -1
    start, end = 0, len(arr) - 1

    while start <= end:
        mid = (start + end) // 2
        
        if arr[mid] == target:
            last_index = mid
            start = mid + 1
        elif arr[mid] < target:
            start = mid + 1
        else:
            end = mid - 1
    return last_index

arr = [2, 4, 6, 2, 3, 5, 6, 2]
target = 2
print(last_occurance(arr, target))