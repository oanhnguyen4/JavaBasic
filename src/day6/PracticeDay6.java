package day6;

public class PracticeDay6 {
	public void doEx1() {
		String[][] employee = {
				{"First Name", "Last Name", "Age", "Email", "Salary", "Department"},
				{"Cierra", "Vega","39","Cierra@example.com.vn", "10000", "Insurance" },
				{"Cierra", "Vega","39","Cierra@example.com.vn", "10000", "Insurance" },
				{"Cierra", "Vega","39","Cierra@example.com.vn", "10000", "Insurance" },
		};
		for (int i = 0; i < employee.length; i++) {  
		    for (int j = 0; j < employee[i].length; j++) {  
		        System.out.printf("%-25s",employee[i][j]);  
		    }  
		    System.out.println(); // Xuống dòng sau mỗi hàng  
		}
	    
    
	}  
	
	public void doEx7() {
		String[][] squareBoard = new String[5][5];
		
		for (int i = 0; i < squareBoard.length; i++) {  
		    for (int j = 0; j < squareBoard[0].length; j++) {  
//		        System.out.printf(squareBoard[i][j]," "); 
		    	squareBoard[i][j]= "# ";
		    	System.out.print(squareBoard[i][j]);
		    }  
		    System.out.println(); // Xuống dòng sau mỗi hàng  
		}
		
	}
	public void doEx8() {
		int n = 7;
		String[][] squareBoard = new String[n][n];
				
		for (int i = 0; i < squareBoard.length; i++) { 
			boolean isOddRow = (i % 2 == 1);
			for (int j = 0; j < squareBoard[0].length; j++) {  
		    	if (isOddRow) {
		    		squareBoard[i][j]= " #";
		    	}
		    	else {
		    		squareBoard[i][j]= "# ";
		    	}

	    		System.out.print(squareBoard[i][j]);
			}  
			System.out.println(); // Xuống dòng sau mỗi hàng  
		}
	}
}
