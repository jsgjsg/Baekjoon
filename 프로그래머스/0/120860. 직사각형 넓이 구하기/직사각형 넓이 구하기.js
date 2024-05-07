function solution(dots) {
    let answer = 0;
    
    let minX = 256;
    let maxX = -256;
    let minY = 256;
    let maxY = -256;
    
    dots.forEach((item) => {
        minX = Math.min(minX, item[0]);
        maxX = Math.max(maxX, item[0]);
        minY = Math.min(minY, item[1]);
        maxY = Math.max(maxY, item[1]);
    });
    answer = (maxX - minX) * (maxY - minY);
    
    return answer;
}