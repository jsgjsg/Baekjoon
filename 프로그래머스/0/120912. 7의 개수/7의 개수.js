function solution(array) {
    let answer = 0;
    
    array.forEach((item) => {
        while(item > 0) {
            if(item % 10 == 7) answer++;
            item = ~~(item / 10);
        }
    })
    
    return answer;
}