# Find the first non-repeating element.
from collections import Counter

def non_repeat(arr):
    seen = set()
    for i in arr:
        if i not in seen:
            return i
        seen.add(i)
    return None

def non_repeat_using_frequency(arr):
    frequency = Counter(arr)

    for num in arr:
        if frequency[num] == 1:
            return num
    return None

arr = [10, 5, 3, 4, 3, 5, 6]
# non_repeatNum = non_repeat(arr)
nonRepeat = non_repeat_using_frequency(arr)
print(nonRepeat)