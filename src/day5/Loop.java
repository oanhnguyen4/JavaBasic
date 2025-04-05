package day5;

public class Loop {
      public void sum() {
    	  int tong = 0;
    	  for (int i = 1; i <= 100; i++ ) {
    		  tong = tong + i;
    	  }
    	  System.out.println("tong = " + tong);
      }
      public void sumAndAverage() {
    	  int sum = 0;
    	  int count = 0;
    	  for(int i = 111 ;i<= 8899; i++) {
    		  sum = sum +i;
    		  count ++;
    	  }
    	  System.out.println("The sum is " + sum);
    	  double average = ((double)sum/(double)count);
    	  System.out.println("The average " + Math.round(average*100.0)/100.0);
      }
      public void sumAndAverageEx3() {
    	  int sumEx3 = 0;
    	  int countEx3 = 0;
    	  for(int i = 1; i <= 100 ; i++) {
    		  if(i%2 == 1) {
    			  sumEx3 = sumEx3 +i;
    			  countEx3 ++;
    		  }
    	  }
    	  System.out.println("The sum is "+ sumEx3);
    	  double average = ((double)sumEx3/(double)countEx3);
    	  System.out.println("The average " + Math.round(average * 100.0)/100.0);
      }
      
      public void sumAndAverageEx4() {
    	  int sumEx4 = 0;
    	  int countEx4 = 0;
    	  for(int i = 1; i <= 100 ; i++) {
    		  if(i%7 == 0) {
    			  sumEx4 = sumEx4 +i;
    			  countEx4 ++;
    		  }
    	  }
    	  System.out.println("The sum is "+ sumEx4);
    	  double average = ((double)sumEx4/(double)countEx4);
    	  System.out.println("The average " + Math.round(average * 100.0)/100.0);
	}
}
