function areThereDuplicates() {
    let collection = {}
    for(let val in arguments){
        collection[arguments[val]] = (collection[arguments[val]] || 0 )
    }
    
}