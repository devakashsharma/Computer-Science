# Count even and odd numbers in an array.
def even_odd(arr):
    count = []
    even, odd = 0, 0

    for i in arr:
        if i % 2 == 0:
            even += 1
        else:
            odd += 1
    
    count.append(even)
    count.append(odd)

    return count

arr = [2, 53, 2, 4, 3, 5, 7, 3]
evenOdd = even_odd(arr)
print(f"Even: {evenOdd[0]}\nOdd: {evenOdd[1]}")
