function solution(my_string, queries) {
    let answer = my_string.split('');
    
    queries.forEach((item) => {
        let tmp = answer.slice(item[0], item[1] + 1).reverse();
        let spl = answer.splice(item[0], item[1] - item[0] + 1);
        
        tmp.forEach((add, idx) => {
            answer.splice(item[0] + idx, 0, add);
        });
    });
    
    answer = answer.join('');
    
    return answer;
}