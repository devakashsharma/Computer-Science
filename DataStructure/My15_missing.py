# Find the missing number in a sequence from 1 to n.
def missing_number(arr):
    n = len(arr) + 1
    total = n * (n + 1) / 2
    sum = 0
    for i in arr:
        sum += i
    
    return int(total - sum)

arr = [1, 3, 4, 5]
print(missing_number(arr))