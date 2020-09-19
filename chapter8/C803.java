package chapter8;

public class C803 {
	public static void main(String[] args) {
		char[][] answers = { { 'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D' },
				{ 'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D' },
				{ 'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D' },
				{ 'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' } };
		
		char[] keys = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };
		int[] students = new int[8];
		for (int i = 0; i < answers.length; i++) {
			int correctCount = 0;
			for (int j = 0; j < answers[i].length; j++) {
				if (answers[i][j] == keys[j])
					correctCount++;
			}
			students[i] = correctCount;
			//System.out.println("Student " + i + "'s correct count is " + correctCount);
		}
		for (int j = 0; j < students.length; j++) {
			for (int k = 1; k < students.length; k++) {
				if (students[k - 1] > students[k]) {
					int temp = students[k];
					students[k] = students[k - 1];
					students[k - 1] = temp;
				}
			}
		}
		for (int j = 0; j < students.length; j++) {
		
			System.out.println("Student " + j + "'s correct count is " + students[j]);
		}
	}

}
