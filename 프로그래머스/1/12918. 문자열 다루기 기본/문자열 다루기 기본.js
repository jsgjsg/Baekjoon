function solution(s) {
    let answer = true;
    
    if(s.length == 4 || s.length == 6);
    else return false;
    
    s.split('').forEach((item) => {
        if(Number.isNaN(Number(item))) answer = false;
    });
    
    return answer;
}