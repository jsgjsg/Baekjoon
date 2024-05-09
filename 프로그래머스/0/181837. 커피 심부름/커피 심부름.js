function solution(order) {
    let answer = 0;
    
    order.forEach((item) => {
        if(item.includes("cafelatte")) answer += 5000;
        else answer += 4500;
    })
    
    return answer;
}