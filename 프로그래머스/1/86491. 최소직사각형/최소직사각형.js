function solution(sizes) {
    let w = 1, h = 1;
    
    sizes.forEach((item) => {
        item.sort((a, b) => a - b);
        
        w = Math.max(item[0], w);
        h = Math.max(item[1], h);
    })
    
    return w * h;
}