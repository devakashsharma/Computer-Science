# Implement basic binary search on a sorted array.
def binary_search(arr, target):
    left, right = 0, len(arr) - 1
    while left <= right:
        mid = (left + right) // 2

        if arr[mid] == target:
            return mid
        elif arr[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
        
    return -1

arr = [2, 5, 8, 12, 16, 23, 38, 56, 72, 91]
target = 91
print(binary_search(arr, target))