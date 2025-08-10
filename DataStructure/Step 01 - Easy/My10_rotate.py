# Function Start
def swap(arr, start, end):
    while start < end:
        temp = arr[start]
        arr[start] = arr[end]
        arr[end] = temp
        start += 1
        end -= 1
    
    return arr
# Function end

# Function Start
def rotate(arr, k):
    n = len(arr)
    k = k % n
    
    # reverse the whole array
    swap(arr, 0, n - 1)

    # reverse the fist 2 element
    swap(arr, 0, k - 1)

    # reverse the remaining element
    swap(arr, k, n - 1)

    return arr
# Function End

arr = [1, 2, 3, 4, 5]
k = 9

rotate_arr = rotate(arr, k)
print(rotate_arr)