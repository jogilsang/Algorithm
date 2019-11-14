class Solution {
	public int func_a(int[] current_grade, int[] last_grade, int[] rank, int max_diff_grade) {
		int arr_length = current_grade.length;
		int count = 0;
	    for (int i = 0; i < arr_length; i++) {
            if (current_grade[i] >= 80 && rank[i] <= arr_length / 10)
                count++;
            else if (current_grade[i] >= 80 && rank[i] == 1)
                count++;
	        else if (max_diff_grade == current_grade[i] - last_grade[i])
	            count++;
	    }
	    return count;
	}

	public int[] func_b(int[] current_grade) {
		int arr_length = current_grade.length;
		int[] rank = new int[arr_length];
        for (int i = 0; i < arr_length; i++)
            rank[i] = 1;
		for (int i = 0; i < arr_length; i++)	
	        for (int j = 0; j < arr_length; j++)
	            if (current_grade[i] < current_grade[j])
	                rank[i]++;
		return rank;
	}

    public int func_c(int[] current_grade, int[] last_grade) {
	    int max_diff_grade = 1;
	    for (int i = 0; i < current_grade.length; i++) {
	        if (max_diff_grade < current_grade[i] - last_grade[i])
	            max_diff_grade = current_grade[i] - last_grade[i];
	    }
	    return max_diff_grade;
	}
	public int solution(int[] current_grade, int[] last_grade) {
		int[] rank = func_b(current_grade);
	    int max_diff_grade = func_c(current_grade, last_grade);
	    int answer = func_a(current_grade, last_grade, rank, max_diff_grade);
	    return answer;
	}
}
