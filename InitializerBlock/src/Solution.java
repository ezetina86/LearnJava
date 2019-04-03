import java.util.Scanner;

public class Solution {



	/*
	 * Variable declarations
	 */
	static boolean flag = true;
	static int B;
	static int H;
	
	
public static void main(String[] args){
	
	/*
	 * Getting input for user
	 */
	Scanner scan = new Scanner(System.in);
	
	B=scan.nextInt();
	scan.nextLine();
	H=scan.nextInt();
	scan.close();
	

	if((B<=0&&H<=0)||(B>=0&&H>=0)){
		flag = true;
	}else if((B<=0&&H>=0)||(B>=0&&H<=0)){
		flag = false;
		System.out.println("java.lang.Exception: Breadth and height must be positive");
	}
	
	
			if (flag) {
				int area = B * H;
				System.out.print(area);
			} 
	}// end of main
}// end of class
