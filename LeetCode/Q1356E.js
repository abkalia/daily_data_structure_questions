/*
You are given an integer array arr. Sort the integers in the array in ascending order by the number of 1's in their binary representation and in case of two or more integers have the same number of 1's you have to sort them in ascending order.

Return the array after sorting it.
*/
var sortByBits = function(arr) {
    var sortedArr = arr.sort(function(a,b){
        return a-b;
    });
    return sortedArr.sort(function(a,b){
        return bitsOf(a)-bitsOf(b);
    });;
};

function bitsOf(num){
    var counter = 0;
    while(num>0){
        var remainder = num%2;
        if(remainder == 1){
            counter++;
        }
        num = parseInt(num/2);
    };
    return counter;
};



var arr = [1024,512,256,128,64,32,16,8,4,2,1];
console.log(sortByBits(arr));