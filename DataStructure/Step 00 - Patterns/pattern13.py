def pattern13(x):
    num = 1

    for i in range(1, x + 1):
        for _ in range(i):
            print(num, end=" ")
            num += 1
        print()


pattern13(5)
