function solution(arr) {
    var answer = [[]];
    
    arr.forEach((row, idx) => {
        answer[idx] = [];
        row.forEach((col) => {
            answer[idx].push(col);
        })
        if(arr.length > arr[0].length)
            for(let i = arr[0].length; i < arr.length; i++) answer[idx].push(0);
    });
    
    if(arr[0].length > arr.length) {
        for(let i = arr.length; i < arr[0].length; i++) {
            answer[i] = [];
            for(let j = 0; j < arr[0].length; j++) answer[i].push(0);
        }
    }
    
    return answer;
}