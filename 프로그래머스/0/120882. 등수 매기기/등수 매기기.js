function solution(score) {
    let answer = [];
    let sort = [];
    
    score.forEach((item) => {
        answer.push((item[0] + item[1]) / 2);
        sort.push((item[0] + item[1]) / 2);
    })
    
    sort.sort((a, b) => b - a);
    
    answer = answer.map((item) => {
        for(let i = 0; i < sort.length; i++) {
            if(item == sort[i]) return i + 1;
        }
    })
    
    return answer;
}