"""
Given a string of character, find the length of longest proper prefix which is also a proper suffix.
Example:
S = abab
lps is 2 because, ab.. is prefix and ..ab is also a suffix.
abhishekabh
"""
str_input = input()
perf_wrd = 'empty'
for i in range(1,len(str_input)//2 +1):
    if str_input[0:i] == str_input[len(str_input)-i:]:
        perf_wrd = str_input[0:i]
print(perf_wrd)
