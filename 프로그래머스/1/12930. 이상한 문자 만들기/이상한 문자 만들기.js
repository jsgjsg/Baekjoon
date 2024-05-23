function solution(s) {
    let answer = '';
    
    answer = s.split(' ').map((item) => {
        return item.split('').map((c, idx) => {
            return idx % 2 == 0 ? c.toUpperCase() : c.toLowerCase();
        }).join('');
    }).join(' ');
    
    return answer;
}