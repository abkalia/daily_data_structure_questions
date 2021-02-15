'''
LCM for three given numbers
'''
def get_max(a,b,c):
    if a>b and a>c:
        return a
    elif b>a and b>c:
        return b
    else:
        return c 

def lcm(a,b,c):
    max = get_max(a,b,c)
    count = 1
    flag = 0
    while flag==0:
        if (max*count)%a==0 and (max*count)%b==0 and (max*count)%c==0:
            flag = 1
        else:
            count +=1
    print(max*count)   

def hcf(a,b,c):
    max = get_max(a,b,c)
    while max>=1:
        if a%max==0 and b%max==0 and c%max==0:
            return(max)
        max -= 1

a = int(input())
b = int(input())
c = int(input())
hcfs = hcf(a,b,c)
print(hcfs)