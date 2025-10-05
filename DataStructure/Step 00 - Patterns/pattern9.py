def pyramid(n):
    for i in range(1, n + 1, 2):
        spaces = (n - i) // 2
        print("  " * spaces + " *" * i)


def pyramidInverted(n):
    for i in range(n - 2, 0, -2):
        spaces = (n - i) // 2
        print("  " * spaces + " *" * i)


def pattern9(n):
    if n % 2 == 0:
        n -= 1
    pyramid(n)
    pyramidInverted(n)


pattern9(9)
