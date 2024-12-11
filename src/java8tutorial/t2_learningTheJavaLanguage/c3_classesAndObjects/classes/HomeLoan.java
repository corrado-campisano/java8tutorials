package java8tutorial.t2_learningTheJavaLanguage.c3_classesAndObjects.classes;

public class HomeLoan {

	
	/*
	 * Note: Parameters refers to the list of variables in a method declaration. 
	 * Arguments are the actual values that are passed in when the method is invoked. 
	 * When you invoke a method, the arguments used must match the declaration's parameters in type and order. 
	 */
	public double computePayment(double loanAmt, double rate, double futureValue, int numPeriods) {
		
		double interest = rate / 100.0;
		double partial1 = Math.pow((1 + interest), -numPeriods);
		double denominator = (1 - partial1) / interest;
		double answer = (-loanAmt / denominator) - ((futureValue * partial1) / denominator);
		
		return answer;
	}

}
