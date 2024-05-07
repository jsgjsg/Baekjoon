function solution(spell, dic) {
    let answer = 2;
    
    dic.forEach((item) => {
        let exist = true;
        spell.forEach((c) => {
            if(!item.includes(c)) exist = false;
        });
        if(exist) {
            answer = 1;
            return;
        }
    });
    
    return answer;
}