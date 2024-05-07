function solution(arr, queries) {
    let answer = [];
    
    queries.forEach((query) => {
        let s = query[0];
        let e = query[1];
        let k = query[2];

        let ans = -1;
        for(let i = s; i <= e; i++) {
            if(arr[i] > k && (arr[i] < ans || ans == -1)) ans = arr[i];
        }
        answer.push(ans);
    })
    return answer;
}