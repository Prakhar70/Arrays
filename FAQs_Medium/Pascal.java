package FAQs_Medium;

import java.util.ArrayList;
import java.util.List;

public class Pascal {
    public List<List<Integer>> pascalTriangle(int numRows) {
        List<List<Integer>> arr2d = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            arr2d.add(pascalRow(i));
        }
        return arr2d;
    }

    private List<Integer> pascalRow(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        int ncr=1;
        for(int i=0;i<=n-1;i++){
            int ncr1 = ncr*(n-i)/(i+1);
            list.add(ncr1);
            ncr=ncr1;
        }
        return list;
    }
}
