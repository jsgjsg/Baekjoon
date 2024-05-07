function solution(a, b) {
    let answer = [];
    a = a.split('');
    b = b.split('');
    let up = 0;
    while(a.length > 0 && b.length > 0) {
        let plus = Number(a[a.length - 1]) + Number(b[b.length - 1]);
        let input = plus + up;
        answer.push(input % 10);
        up = ~~(input / 10);
        a.pop();
        b.pop();
    }
    
    while(a.length > 0) {
        let plus = Number(a[a.length - 1]) + up;
        answer.push(plus % 10);
        up = ~~(plus / 10);
        a.pop();
    }
    
    while(b.length > 0) {
        let plus = Number(b[b.length - 1]) + up;
        answer.push(plus % 10);
        up = ~~(plus / 10);
        b.pop();
    }
    
    if(up != 0) answer.push(up);
    
    return answer.reverse().join('');
}