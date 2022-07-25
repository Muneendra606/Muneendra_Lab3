package com.muneendra.balancebracket.main;

import com.muneendra.balancebracket.service.BalancingBrackets;

public class Driver {

	public static void main(String[] args) {
		

			BalancingBrackets balancingbrackets= new BalancingBrackets();
			String bracketExpression= "([[{}]])";
			
			boolean result;
			result= balancingbrackets.checkingBracketsBalanced(bracketExpression);
			if (result)
			System.out.println("The entered String has Balanced Brackets");
			else
			System.out.println(" The entered String do not contain Balanced Brackets");
	}

}
