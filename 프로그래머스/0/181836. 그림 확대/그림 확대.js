function solution(picture, k) {
    let answer = [];
    
    picture.forEach((item) => {
        let line = item.split('');
        let answerLine = "";
        line.forEach((c) => {
            answerLine += c.repeat(k);
        })
        
        for(let i = 0; i < k; i++) answer.push(answerLine);
    });
    
    return answer;
}