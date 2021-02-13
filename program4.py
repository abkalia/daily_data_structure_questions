'''
LCM for three given numbers
'''
def lcm(a,b,c):
    if a>b and a>c:
        max = a
    elif b>a and b>c:
        max = b
    else:
        max = c 
    count = 1
    flag = 0
    while flag==0:
        if (max*count)%a==0 and (max*count)%b==0 and (max*count)%c==0:
            flag = 1
        else:
            count +=1
    print(max*count)   
def hcf(a,b,c):
    
a = int(input())
b = int(input())
c = int(input())
lcm(a,b,c)
