def largestElement(arr):
    largest = arr[0]
    for max in arr:
        if largest < max:
            largest = max
    
    return largest

def secondLargestElementInArray(arr):
    largest = largestElement(arr)
    arr.remove(largest)
    return largestElement(arr)

arr = [10, 20, 30, 40, 50, 60]
secondMax = secondLargestElementInArray(arr)
print(secondMax)