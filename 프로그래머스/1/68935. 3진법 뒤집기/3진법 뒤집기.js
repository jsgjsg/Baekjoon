function solution(n) {
    let answer = 0;
    
    let rev = [];
    while(n > 0) {
        rev.push(n % 3);
        n = ~~(n / 3);
    }
    rev.reverse();
    rev.forEach((item, idx) => {
        answer += item * Math.pow(3, idx);
    })
    
    return answer;
}