"""
Maximum difference between two elements such that larger element appears after the smaller number
If array is [2, 3, 10, 6, 4, 8, 1] then returned value should be 8 (Diff between 10 and 2). 
""" 
arr_input = input()
arr = arr_input.strip().split(" ")
max = 0
for i in range(0,len(arr)):
    for j in range(i+1,len(arr)):
        if int(arr[j])-int(arr[i]) > max:
            max = int(arr[j])-int(arr[i])
print(max)
