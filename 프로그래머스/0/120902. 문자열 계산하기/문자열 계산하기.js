function solution(my_string) {
    let answer = 0;
    
    let arr = my_string.split(' ');
    let op = '+';
    arr.forEach((item) => {
        if(item == '+' || item == '-') op = item;
        else {
            if(op == '+') answer += Number(item);
            else answer -= Number(item);
        }
    });
    
    return answer;
}