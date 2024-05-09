function solution(order) {
    let answer = 0;
    
    answer = order.reduce((ans, cur) => {
        if(cur.includes("cafelatte")) return ans += 5000;
        else return ans += 4500;
    }, 0);
    
    return answer;
}