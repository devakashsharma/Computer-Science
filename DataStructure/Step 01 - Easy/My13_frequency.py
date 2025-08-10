# Find the frequency of each element in an array.

def frequency(arr):
    frequency_map = {}
    for i in arr:
        if i in frequency_map:
            frequency_map[i] += 1
        else:
            frequency_map[i] = 1
    
    return frequency_map


arr = [1, 3, 5, 2, 1, 3, 4, 2, 1]
print(frequency(arr))