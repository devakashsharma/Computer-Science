# Count the number of occurrences of a number in a sorted array.

# First Occurance
def first_occurance(arr, target):
    arr.sort()
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

# Last Occurance
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

# Count Occurance
def count_occurance(arr, target):
    first = first_occurance(arr, target)
    if first == -1:
        return -1
    
    last = last_occurance(arr, target)
    
    return last - first + 1

arr = [2, 4, 4, 4, 4, 4, 4, 5, 6, 7, 7, 8, 9]            
target = 7
print(count_occurance(arr, target))