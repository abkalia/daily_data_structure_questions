'''
Make a function which accepts a string as an argument that may contain repetitive characters. Implement the function to modify and return the input string, such that each character once, along with the count of consecutive occurrence. Do not append count if the character occurs only once.
Input – aaaaabbbccccccccdaa

Output – a5b3c8da2
'''
def manp_string(strr):
    count = 1
    for i in range(0,len(strr)-1):
        if count == 1:
            print(strr[i],end="")
        if strr[i]==strr[i+1]:
            count +=1
        else:
            if count!=1:
                print(count,end="")
                count = 1

str_input = input()
print(manp_string(str_input))
