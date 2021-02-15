testCases = int(input())
while testCases>0:
    FirstInput = input().strip().split()
    n = int(FirstInput[0])
    k = int(FirstInput[1])
    array = input().strip().split()
    if k>n:
        k = k%n
    arr = array[n-k:]+array[:n-k]
    for i in arr:
        print(i + " ")
    print()
    testCases -= 1



