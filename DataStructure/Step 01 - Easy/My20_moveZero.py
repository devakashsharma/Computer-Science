def move_zero(arr):
    zero = 0
    
    # move all non zero to front
    for i in range(len(arr)):
        if arr[i] != 0:
            arr[zero] = arr[i]
            zero += 1
            
    # make the remaining element zero
    for i in range(zero, len(arr)):
        arr[i] = 0
        
    return arr
    
arr = [0, 1, 0, 3, 12]
print(move_zero(arr))  # Output: [1, 3, 12, 0, 0]