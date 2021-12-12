class Solution {
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex == 0) return new ArrayList<Integer>(Arrays.asList(1));
        if(rowIndex == 1) return new ArrayList<Integer>(Arrays.asList(1,1));
        
        List<Integer> beforeList = getRow(rowIndex - 1);
        List<Integer> afterList = new ArrayList<Integer>();
        for(int i = 0  ; i <= rowIndex ; i++) {
                if(i==0) {
                    afterList.add(1);
                }else if (i == rowIndex) {
                    afterList.add(1);
                }else {
                    int value = beforeList.get(i-1) + beforeList.get(i);
                    afterList.add(value);
                }
        }
        
        return afterList;
    }
}