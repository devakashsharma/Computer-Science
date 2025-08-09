# Find the index of first occurrence of a number using binary search.
def first_occurance(arr, target):
    first_index = -1
    start, end = 0, len(arr) - 1
    while start <= end:
        mid = (start + end) // 2
        if arr[mid] == target:
            first_index = mid
            end = mid - 1  # Continue searching in the left half
        elif arr[mid] < target:
            start = mid + 1
        else:
            end = mid - 1
    return first_index

arr = [2, 4, 6, 2, 3, 5, 6]
target = 2
print(first_occurance(arr, target))