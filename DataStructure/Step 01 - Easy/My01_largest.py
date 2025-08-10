# largest element
arr = [1, 30, 20, 50, 20, 33, 44]

if not arr:
    print("Array is empty")
else:
    largest = arr[0]

    # loop
    for max in arr:
        if max > largest:
            largest = max
    
    # print the array
    print(f"The maximum number is: {largest}")
        