function solution(my_string, queries) {
    let answer = my_string.split('');
    
    queries.forEach((item) => {
        let tmp = answer.slice(item[0], item[1] + 1).reverse();
        answer.splice(item[0], item[1] - item[0] + 1, ...tmp);
    });
    
    return answer.join('');
}