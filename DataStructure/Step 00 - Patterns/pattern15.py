def pattern15(x):
    char = 65

    for i in range(x + char, char - 1, -1):
        for k in range(char, i):
            print(chr(k), end=" ")
        print()


pattern15(5)

def pattern15_corrected(x):
    # 'A' has ASCII/Unicode code 65
    START_CHAR_CODE = 65 
    
    # Outer loop controls the number of rows, iterating from x (e.g., 5) down to 1
    for row in range(x, 0, -1):
        
        # Inner loop prints characters starting from 'A'
        # The length of the row is determined by the current 'row' number.
        # It goes from 0 up to (row - 1).
        for col in range(row):
            
            # The character code is START_CHAR_CODE (65) + the column index (0, 1, 2, ...)
            char_code = START_CHAR_CODE + col
            print(chr(char_code), end=" ")
            
        print() # Move to the next line

pattern15_corrected(5)