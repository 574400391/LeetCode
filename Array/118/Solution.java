import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if(numRows <= 0) return list;

        List<Integer> tmpList1 = new ArrayList<>();
        tmpList1.add(1);
        list.add(tmpList1);
        for(int i = 1; i < numRows; i++){
            //上一行的数据
            List<Integer> last = list.get(i - 1);
            List<Integer> tmpList2 = new ArrayList<>();
            tmpList2.add(1);
            for(int j = 1; j < i; j++){
                tmpList2.add(last.get(j-1)+last.get(j));
            }
            tmpList2.add(1);
            list.add(tmpList2);
        }
        return list;
    }
}