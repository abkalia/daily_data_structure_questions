/*
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
*/
var firstUniqChar = function(s) {
    let ans = Number.MAX_SAFE_INTEGER;

    // Iterate from a to z which is 26 which makes it constant
    for (let c = 'a'; c <= 'z'; c++) {
        // indexOf will return first index of alphabet and lastIndexOf will return last index
        // if both are equal then it has occurred only once.
        // through this, we will get all indexes which are occurred once
        // but our answer is the lowest index
        let index = s.indexOf(c);
        if (index !== -1 && index === s.lastIndexOf(c)) {
            ans = Math.min(ans, index);
        }
    }
    return ans === Number.MAX_SAFE_INTEGER ? -1 : ans;
};

var s = "loveleetcode";
console.log(firstUniqChar(s));