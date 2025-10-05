def right_tri(n):
    for i in range(n):
        print("* " * i)
        

def invert_tri(n):
    for i in range(n, 0, -1):
        print("* " * i)


def half_diamond(n):
    right_tri(n)
    invert_tri(n)


half_diamond(5)