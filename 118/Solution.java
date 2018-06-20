import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if(numRows <= 0) return list;
        for(int i = 1; i <= numRows; i++){
            List<Integer> tmpList = new ArrayList<>();
            tmpList.set(0, 1);
            tmpList.set(i-1, 1);
            for(int j = 1; j < i; j++){
                tmpList.add(j, list.get(i-1).get(j-1)+list.get(i-1).get(j));
            }
            list.add(tmpList);
        }
        return list;
    }
}