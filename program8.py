'''
Write a function which accepts a string str, implement the function to find and 
return the minimum characters required to append at the end of str to make it a palindrome

Input –
abcdc
Output –
ba
'''

def palindrome(strr):
    ln = len(strr)
    rev_strr = strr[::-1]
    if strr == rev_strr:
        print('NULL')
    else:
        for i in range(0,len(strr)):
            rev_strr = ''.join(reversed(strr[i:]))
            if strr[i:] == rev_strr:
                result = ''.join(reversed(strr[:i]))
                return result

strr = input()
res = palindrome(strr)
print(res)

