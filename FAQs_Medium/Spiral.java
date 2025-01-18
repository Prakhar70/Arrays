package FAQs_Medium;

import java.util.ArrayList;
import java.util.List;

public class Spiral {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;
        List<Integer> list = new ArrayList<>();
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            if(top>bottom){
                break;
            }
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;
            if(left>right){
                break;
            }
            for (int i = right; i >= left; i--) {
                list.add(matrix[bottom][i]);
            }
            bottom--;
            if(top>bottom){
                break;
            }
            for (int i = bottom; i >= top; i--) {
                list.add(matrix[i][left]);
            }
            
            left++;
            if(left>right){
                break;
            }
        }
        return list;
    }
}
