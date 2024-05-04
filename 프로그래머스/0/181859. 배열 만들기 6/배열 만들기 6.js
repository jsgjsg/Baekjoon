function solution(arr) {
    let answer = [];
    
    let i = -1;
    
    for(let j = 0; j < arr.length; j++) {
        if(answer[i] == arr[j]) {
            answer.pop();
            i--;
        }
        else {
            answer.push(arr[j]);
            i++;
        }
    }
    
    return answer.length > 0 ? answer : [-1];
}