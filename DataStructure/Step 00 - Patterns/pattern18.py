# alpha triangle pattern


def pattern18(x):
    for i in range(x):
        char = chr(ord("A") + x - i - 1)
        for j in range(i + 1):
            print(chr(ord(char) + j), end=" ")
        print()


pattern18(5)
