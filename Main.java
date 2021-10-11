package com.lab3.problem1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		BalanceCheck bc = new BalanceCheck();
		System.out.println("Enter the expression to check its balancing");
		String expr = sc.next();
		flag = bc.balanceChecking(expr);
		if (flag == false)
			System.out.println("Given expression is not balanced");
		else
			System.out.println("Given expression is balanced");
		sc.close();

	}

}
