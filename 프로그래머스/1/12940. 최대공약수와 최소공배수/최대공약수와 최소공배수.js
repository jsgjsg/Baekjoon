function solution(n, m) {
    let answer = [];
    
    answer.push(getG(n, m));
    answer.push(n * m / answer[0]);
    
    return answer;
}

const getG = function(a, b) {
    let c = a % b;
    
    if(c == 0) return b;
    else return getG(b, c);
}