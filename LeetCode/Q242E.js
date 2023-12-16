/*
242. Valid Anagram
Easy
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
*/
var isAnagram = function(s, t) {
    var arr = [];
    for(i=0;i<s.length;i++){
        if(arr[s[i]] >= 1){
            arr[s[i]]++;
        } else {
            arr[s[i]] = 1;
        }
    }
    for(i=0;i<t.length;i++){
        arr[t[i]]--;
    }
    for(i in arr){
        console.log(i);
        console.log(arr[i]);
        if(arr[i] !=0){
            return false;
        }
    }
    return true;
};

console.log(isAnagram(s = "anagram", t = "nagaram"));
console.log(isAnagram(s = "ratcf", t = "ctar"));