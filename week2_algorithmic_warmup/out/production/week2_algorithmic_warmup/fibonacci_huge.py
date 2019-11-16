def pisanoPeriod(m):
    previous, current = 0, 1
    for i in range(0, m * m):
        previous, current \
            = current, (previous + current) % m

        # A Pisano Period starts with 01 
        if (previous == 0 and current == 1):
            print(i+1)
            return i + 1


# Calculate Fn mod m
def fibonacciModulo(n, m):
    # Getting the period
    print(pisano_period)
    # Taking mod of N with  
    # period length 
    n = n % pisano_period

    previous, current = 0, 1

    for i in range(n - 1):
        previous, current \
            = current, previous + current

    return (current % m)

    # Driver Code


n = 239
m = 1000
print(fibonacciModulo(n, m))
