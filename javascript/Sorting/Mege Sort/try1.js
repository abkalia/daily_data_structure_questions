function merge(arg1,arg2){
    var len1 = arg1.length; //3
    var len2 = arg2.length; //4
    var arg3 = [];
    for(i=0,j=0;i<len1 && j<len2;) 
    {
        console.log(i+' '+ j);
        if(arg2[j]>arg1[i]){
            console.log(arg1[j],arg2[i]);
            arg3.push(arg1[i]);
            i++;
        } else {
            console.log(arg1[j],arg2[i]);
            arg3.push(arg1[j]);
            j++;
        }
            console.log("here3");
    }
    console.log("here" + i + " " + j);
    while(i<len1){
        arg3.push(arg1[i]);
        i++;
    }
    while(j<len2){
        arg3.push(arg2[j]);
        j++;
    }
    console.log(arg3);
}
merge([1,10,50],[2,14,99,100]);