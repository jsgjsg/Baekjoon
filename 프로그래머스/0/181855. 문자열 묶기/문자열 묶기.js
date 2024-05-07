function solution(strArr) {    
    let count = new Array(31).fill(0);
    
    strArr.forEach((item) => {
        count[item.length]++;
    });
    count.sort();
    
    return count[30];
}