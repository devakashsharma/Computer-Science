def pattern12(x):
    x = x + 1
    for i in range(1, x + 1):

        for j in range(1, i):
            print(j, end="")

        for _ in range(2 * (x - i)):
            print(end=" ")

        for l in range(i - 1, 0, -1):
            print(l, end="")

        print()


pattern12(4)
