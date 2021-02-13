'''
Find the number closest to n and divisible by m
'''
n = int(input())
m = int(input())
mod_value = n%m
if mod_value == 0:
    print( n )
elif mod_value > m-mod_value:
    print( n+ m - mod_value)
else:
    print( n- mod_value)


