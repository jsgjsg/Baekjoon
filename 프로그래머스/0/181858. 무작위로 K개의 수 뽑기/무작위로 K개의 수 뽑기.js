function solution(arr, k) {
    let answer = [];
    
    let set = new Set(arr);
    
    set.forEach((item) => {
        if(answer.length < k) answer.push(item);
    });
    
    for(let i = answer.length; i < k; i++) answer[i] = -1;
    
    return answer;
}