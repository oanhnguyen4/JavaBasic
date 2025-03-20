package day4;

public class DecisionMaking {
	public void sum(){
		int x = 565;
		int tong = 0;
		if(x > 0 && x < 1000) {
		  if(x < 10) {
			  tong = x;
		  }else if(x >= 10 && x < 100) {
			  tong = (x%10)+(x/10);
		  }else {
			  tong = (x/100) + (x%100)/10 + (x%10);
		  }
		}
		System.out.println("Input an integer between 0 and 1000:" + x);
		System.out.println("The sum of all digits in " + x + " is " + tong);
	}
	public void convertMinutes(){
		int minutes = 3456789;
		long year = minutes/(60*24*365);
		long day = ((minutes)% (60*24*365))/(60*24);
		System.out.println( minutes + " minutes is approximately " +  year +  " year" + " and " + day + " days");
	}

}
