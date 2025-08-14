def floorSqrt(target):
    low = 1
    high = target
    # Binary search on the answers:
    while low <= high:
        mid = (low + high) // 2
        val = mid * mid
        if val <= target:
            # Eliminate the left half:
            low = mid + 1
        else:
            # Eliminate the right half:
            high = mid - 1
    return high

target = 28
print(f"Sqrt is {floorSqrt(target)}")