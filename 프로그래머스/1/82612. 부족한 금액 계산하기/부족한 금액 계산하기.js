function solution(price, money, count) {
    let answer;
    
    let charge = count * (count + 1) / 2 * price;

    answer = charge - money;
    return answer > 0 ? answer : 0;
}