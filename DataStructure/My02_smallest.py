# Find the smallest element in an array.
arr = [20, 22, 44, 11, 3, 5, 2]

if not arr:
    print("Empty")
else:
    smallest = arr[0]

    # check the element
    for small in arr:
        if small < smallest:
            smallest = small
    
    print(f"Smallest element: {smallest}")