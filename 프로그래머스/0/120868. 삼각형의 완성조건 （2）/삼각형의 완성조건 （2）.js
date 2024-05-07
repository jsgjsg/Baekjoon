function solution(sides) {
    let answer = 0;
    
    sides.sort((a, b) => a - b);
    
    // sides[1] - sides[0] < k < sides[0] + sides[1]
    answer = sides[0] * 2 - 1;
    
    return answer;
}