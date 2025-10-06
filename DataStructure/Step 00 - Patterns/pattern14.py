def pattern14(x):
    char = 65

    for i in range(char, char + x + 1):
        for k in range(char, i):
            print(chr(k), end=" ")
        print()


pattern14(5)