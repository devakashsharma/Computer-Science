# Find the peak element in an array.
def peak(arr):
    left, right = 0, len(arr) - 1
    while left < right:
        mid = (left + right) // 2
        if arr[mid] > arr[mid + 1]:
            right = mid
        else:
            left = mid + 1
    return arr[left]


arr = [2, 4, 6, 7, 8]
print(f"Peak: {peak(arr)}")
