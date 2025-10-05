val = 1
for i in range(1, 6):
    # wtf? we can define like this in py? I really love this one
    val = 1 if i % 2 != 0 else 0

    for j in range (i):
        print(val, end=" ")
        val = 1 - val
    print()