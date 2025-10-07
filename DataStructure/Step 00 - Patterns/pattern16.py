# alpha ramp pattern

def pattern16(x):
    for i in range(1, x + 1):
        char = 65 + i - 1
        current_char = chr(char)
        for _ in range(i):
            print(current_char, end="")
        print()


pattern16(5)
