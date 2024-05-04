function solution(str_list) {
    let answer = [];
    
    let idxOfL = str_list.indexOf('l');
    let idxOfR = str_list.indexOf('r');
    
    if(idxOfL + idxOfR == -2) return answer;
    
    if(idxOfL == -1) {
        for(let i = idxOfR + 1; i < str_list.length; i++) {
            answer.push(str_list[i]);
        }
        return answer;
    }
    if(idxOfR == -1) {
        for(let i = 0; i < idxOfL; i++) {
            answer.push(str_list[i]);
        }
        return answer;
    }
    if(idxOfL < idxOfR) {
        for(let i = 0; i < idxOfL; i++) {
            answer.push(str_list[i]);
        }
        return answer;
    }
    if(idxOfR < idxOfL) {
        for(let i = idxOfR + 1; i < str_list.length; i++) {
            answer.push(str_list[i]);
        }
        return answer;
    }
    
    return answer;
}