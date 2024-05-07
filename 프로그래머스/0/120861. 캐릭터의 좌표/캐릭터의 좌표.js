function solution(keyinput, board) {
    let answer = [0, 0];
    let upRange = ~~(board[1] / 2);
    let downRange = -Math.abs(upRange);
    let rightRange = ~~(board[0] / 2);
    let leftRange = -Math.abs(rightRange);
    
    keyinput.forEach((item) => {
        switch(item) {
            case "up": 
                answer[1] = Math.min(upRange, answer[1] + 1);
                break;
            case "down":
                answer[1] = Math.max(downRange, answer[1] - 1);
                break;
            case "left":
                answer[0] = Math.max(leftRange, answer[0] - 1);
                break;
            case "right":
                answer[0] = Math.min(rightRange, answer[0] + 1);
                break;
        }
    });
    
    return answer;
}