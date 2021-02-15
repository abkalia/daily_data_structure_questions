/*
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
*/
#include<iostream>
#include <typeinfo>
using namespace std;
char solution(char arr[])
{
    char result = arr[0];
    for(int i=1;arr[i]!='\0';i+=2)
    {
        if(arr[i]=='A')
        {
            if(result =='1' && arr[i+1]=='1')
                result = '1';
            else    
                result = '0';
        }
        else if(arr[i]=='B')
        {
            if(result =='1' || arr[i+1]=='1')
                result = '1';
            else    
                result = '0';
        }
        else if(arr[i]=='C')
        {
            if(result == arr[i+1])
                result = '0';
            else
                result = '1';
        }
    }
    return(result);
}
int main()
{
    char str[100];
    cin>>str;
    char result = solution(str);
    cout<<"\n";
    cout<<result;
    return(0);
}