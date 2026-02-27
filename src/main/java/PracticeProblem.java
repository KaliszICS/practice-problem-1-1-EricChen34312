public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void q1() {
		//Write question 1 code here
	}

	public static void q2() {
		//Write question 2 code here
	}

	public static void q3() {
		//Write question 3 code here
	}

	public static void q4() {
		//Write question 4 code here
	}

	public static void q5() {
		//Write question 5 code here
	}

	//the real start of the answers

	public static int sum2D(int[][] arr){
		//initiate counter
		int out = 0;

		//iterate through rows 
		for(int i = 0; i < arr.length; i++){

			//add every value in row i to counter
			for(int j = 0; j < arr[i].length; j++){
				out += arr[i][j];
			}
		}
		return out;
	}

	public static int sumRow(int[][] arr, int row){
		int out = 0;

		//add every value in arr[row] to a counter and return counter
		for(int i = 0; i < arr[row].length; i++){
			out += arr[row][i];
		}

		return out;
	}

	public static int sumColumn(int[][] arr, int col){
		int out = 0;

		//add every value in arr[][col] to counter, return counter
		for(int i = 0; i < arr.length; i++){
			out += arr[i][col];
		}

		return out;
	}

}
