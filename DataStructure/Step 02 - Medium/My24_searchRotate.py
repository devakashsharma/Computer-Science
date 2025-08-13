def search(nums, target):
    low = 0
    high = len(nums) - 1

    while low <= high:
        mid = (low + high) // 2

        if nums[mid] == target:
            return mid

        # Check if the left half is sorted
        if nums[low] <= nums[mid]:
            # Check if the target is in the sorted left half
            if nums[low] <= target < nums[mid]:
                high = mid - 1
            else:
                low = mid + 1
        # Otherwise, the right half must be sorted
        else:
            # Check if the target is in the sorted right half
            if nums[mid] < target <= nums[high]:
                low = mid + 1
            else:
                high = mid - 1

    return -1

# Example usage:
rotated_array = [4, 5, 6, 7, 0, 1, 2]
target_val = 0
result = search(rotated_array, target_val)
print(f"The index of {target_val} is: {result}")  # Output: The index of 0 is: 4

target_val = 3
result = search(rotated_array, target_val)
print(f"The index of {target_val} is: {result}")  # Output: The index of 3 is: -1