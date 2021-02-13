'''
Given a string consisting of only 0, 1, A, B, C where
A = AND
B = OR
C = XOR
Calculate the value of the string assuming no order of precedence and evaluation is done from left to right.

Constraints – The length of string will be odd. It will always be a valid string.
Example, 1AA0 will not be given as an input.

Examples:

Input : 1A0B1
Output : 1
1 AND 0 OR 1 = 1
'''
str_input = input()
result = int(str_input[0])
for i in range(1,len(str_input)):
    if str_input[i]=='A':
        result = int(result) & int(str_input[i+1])
    elif str_input[i]=='B':
        result = int(result) | int(str_input[i+1])
    elif str_input[i]=='C':
        result = int(result) ^ int(str_input[i+1])
    i += 1
print(result)
    