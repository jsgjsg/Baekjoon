function solution(rank, attendance) {
    let answer = 0;
    let a, b, c;
    
    for(let i = 0; i < rank.length; i++) {
        if(!attendance[i]) continue;
        if(a == undefined || rank[i] < rank[a]) { // 1등
            c = b;
            b = a;
            a = i;
        }
        else if(b == undefined || rank[i] < rank[b]) { // 2등
            c = b;
            b = i;
        }
        else if(c == undefined || rank[i] < rank[c]) { // 3등
            c = i;
        }
    }
    
    answer = a * 10000 + b * 100 + c;
    
    return answer;
}