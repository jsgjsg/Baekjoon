function solution(ineq, eq, n, m) {
    
    // n != m일 경우
    if(ineq == '>' && n > m) return 1;
    else if(ineq == '<' && n < m) return 1;
    
    // n == m 일 경우
    if(eq == '=' && n == m) return 1;
    
    return 0;
}