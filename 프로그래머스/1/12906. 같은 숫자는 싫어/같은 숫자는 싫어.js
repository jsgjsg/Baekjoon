function solution(arr) {
    let answer = [];
    
    let pre = arr[0];
    answer.push(pre);
    
    for(let i = 1; i < arr.length; i++) {
        if(arr[i] != pre) {
            pre = arr[i];
            answer.push(pre);
        }
    }
    
    return answer;
}