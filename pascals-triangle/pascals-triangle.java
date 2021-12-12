class Solution {
    
    
    
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> answer = new ArrayList<>();
        
        // init
        List<Integer> list = new ArrayList<>(Arrays.asList(1));
        answer.add(list);
        if(numRows == 1) return answer;
        
        list = new ArrayList<>(Arrays.asList(1,1));
        answer.add(list);
        if(numRows == 2) return answer;

        // numRows >= 3
        for(int i = 2 ; i < numRows ; i++) {
            // n번쨰
            List<Integer> afterList = new ArrayList<>();
            // n번째 - 초항
            afterList.add(1);
            // n-1 번째
            List<Integer> beforeList = answer.get(i-1);
            for(int j = 0 ; j < beforeList.size()-1 ; j++) {
                int beforeValue = beforeList.get(j);
                int afterValue = beforeList.get(j+1);
                afterList.add(beforeValue + afterValue);
            }
            // n번째 - 마지막항
            afterList.add(1);
            answer.add(afterList);
        }

        return answer;
    }
}