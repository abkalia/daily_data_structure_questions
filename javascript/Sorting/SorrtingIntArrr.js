/*
Sorting Integer Array
*/
var sortByBits = function(arr) {
    return arr.sort(function(a,b){
        return a-b;
    });
};


var arr = [1024,512,256,128,64,32,16,8,4,2,1];
console.log(sortByBits(arr));