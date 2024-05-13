function solution(coupon) {
    let answer = 0;
    
    while(coupon >= 10) {
        answer += ~~(coupon / 10);
        
        coupon = ~~(coupon / 10) + coupon % 10;
    }
    // x마리 -> 쿠폰 x장
    // x/10마리 -> 쿠폰 x/10장 + x % 10장(남은거)
    // (x/10 + x%10) / 10마리 -> 쿠폰 (x/10 + x%10)장 + (x/10 + x%10) % 10장
    
    
    return answer;
}