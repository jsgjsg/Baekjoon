function solution(id_pw, db) {
    let answer = "fail";
    
    db.forEach((item) => {
        if(item[0] == id_pw[0]) {
            if(item[1] == id_pw[1]) answer = "login";
            else answer = "wrong pw";
        }
    })
    
    return answer;
}