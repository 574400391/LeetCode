class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList();
        if(rowIndex <= 0){
            return list;
        }
        list.add(1);
        List<List<Integer>> data = new ArrayList();
        data.add(list);
        for(int i = 1; i < rowIndex; i++){
            List<Integer> last = data.get(i - 1);
            List<Integer> tmpList = new ArrayList();
            tmpList.add(1);
            for(int j = 1; j<i;j++){
                tmpList.add(last.get(j - 1) + last.get(j));
            }
            tmpList.add(1);
            data.add(tmpList);
        }
        return data.get(rowIndex - 1);
    }
}