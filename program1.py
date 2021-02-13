'''
Write a program to print all the LEADERS in the array. An element is leader if it is greater than all the elements to its right side.

And the rightmost element is always a leader. For example int the array {16, 19, 4, 3, 8, 3}, leaders are 19, 8 and 3?
'''
arr_input = input()
arr = arr_input.strip().split(" ")
for i in range(0,len(arr)):
    for j in range(i+1,len(arr)):
        print('for i: ' + arr[i] + ' j is: ' + arr[j])
        if int(arr[i])< int(arr[j]):
            break
        if j == len(arr)-1:
            print(arr[i])
print(arr[len(arr)-1])