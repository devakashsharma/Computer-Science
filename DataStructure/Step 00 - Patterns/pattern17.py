# alpha hill pattern

def pattern17(x):
    for i in range(1, x + 1):
        print("  " * (x - i), end="")

        for j in range(i):
            char = 65 + j
            print(chr(char), end=" ")

        for j in range(65 + i - 2, 64, -1):
            print(chr(j), end=" ")

        print()


pattern17(5)
