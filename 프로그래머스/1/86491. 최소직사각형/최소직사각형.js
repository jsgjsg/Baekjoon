function solution(sizes) {
    let answer = 0;
    
    let w = 1;
    let h = 1;
    
    sizes.forEach((item) => {
        item.sort();
        // 그대로
        let a = Math.max(w, item[0]) * Math.max(h, item[1]);
        // 바꿔서
        let b = Math.max(h, item[0]) * Math.max(w, item[1]);
        
        if(a < b) {
            w = Math.max(w, item[0]);
            h = Math.max(h, item[1]);
        } else {
            w = Math.max(w, item[1]);
            h = Math.max(h, item[0]);
        }
    })
    
    return answer = h * w;
}