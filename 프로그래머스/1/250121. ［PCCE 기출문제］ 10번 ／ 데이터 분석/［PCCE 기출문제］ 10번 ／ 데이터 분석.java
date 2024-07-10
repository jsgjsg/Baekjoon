import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};
        
        int filterIdx = ext.equals("code") ? 0 : ext.equals("date") ? 1 : ext.equals("maximum") ? 2 : 3;
        int sortIdx = sort_by.equals("code") ? 0
                    : sort_by.equals("date") ? 1
                    : sort_by.equals("maximum") ? 2 : 3;
        
        answer = Arrays.stream(data).filter((item) -> item[filterIdx] < val_ext)
                                    .sorted(Comparator.comparingInt(a -> a[sortIdx]))
                                    .toArray(size -> new int[size][]);
        
        return answer;
    }
}