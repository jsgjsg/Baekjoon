function solution(a, b) {
    
    let mom = b;
    let c;
    for(a; c = a % b; a = b, b = c) {} // G 구하기
    
    mom /= b;
    for(mom; mom % 2 == 0; mom /= 2);
    for(mom; mom % 5 == 0; mom /= 5);
    
    return mom == 1 ? 1 : 2;
}