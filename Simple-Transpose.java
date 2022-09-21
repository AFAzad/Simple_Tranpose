import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
	//	int column = sc.nextInt();
		int [][] original = new int[row][row];
		for(int i =0; i<row;i++ ){
			for(int j=0;j<row;j++){
				original[i][j]=sc.nextInt();

			}
		}
	//	int row1= column;
		//int column1= row;
		int [][] transpose = new int[row][row];
		for(int i=0;i<row;i++){
			for(int j=0;j<row;j++){
				transpose[i][j] = original[j][i]; 
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println("");
		}
		/*for(int i=0;i<row1;i++){
				for(int j=0;j<column1;j++){
					System.out.print(transpose[i][j]+" ");
				}
				System.out.println("");
		}*/
			
		
	}
}