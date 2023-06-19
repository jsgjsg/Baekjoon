class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        if(a == b && b == c && c == d) answer = 1111 * a;
        else if(a == b && b == c) answer = (int)Math.pow(a * 10 + d, 2);
        else if(a == b && b == d) answer = (int)Math.pow(a * 10 + c, 2);
        else if(a == c && c == d) answer = (int)Math.pow(a * 10 + b, 2);
        else if(b == c && c == d) answer = (int)Math.pow(b * 10 + a, 2);
        else if(a == b && c == d) answer = (a + c) * Math.abs(a - c);
        else if(a == c && b == d) answer = (a + b) * Math.abs(a - b);
        else if(a == d && b == c) answer = (a + b) * Math.abs(a - b);
        else if(a == b) answer = c * d;
        else if(a == c) answer = b * d;
        else if(a == d) answer = b * c;
        else if(b == c) answer = a * d;
        else if(b == d) answer = a * c;
        else if(c == d) answer = a * b;
        else answer = Math.min(Math.min(a, b), Math.min(c, d));
        
        return answer;
    }
}