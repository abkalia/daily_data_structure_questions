/*
217. Contains Duplicate
Easy
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
*/
var containsDuplicate = function(nums) {
    var arr = [];
    for(i=0;i<nums.length;i++){
        if(arr[nums[i]] == 1){
            return true;
        } else {
            arr[nums[i]] = 1;
        }
    }
    return false;
};

var nums1 = [1,2,3,4];
console.log(containsDuplicate(nums1));