package com.hp.training.java;

import java.util.Scanner

public class studentresult{
	int rollno;
	int engmark, mathmark;
	double percentage=0.0;

	studentresult() {
		this.rollno = 50;
		this.engmark = 0;
		this.mathmark = 0;
		this.percentage=0.0;
	}

	
	void inputStudentDetails() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the English marks");
		engmark = input.nextInt();
		System.out.println("Enter the Maths marks");
		mathmark = input.nextInt();
		input.close();
	}

	double calPercentage() {
		percentage = (this.engmark + this.mathmark) / 2.0;
		return percentage;
	}

	Boolean calResult() {
		if (this.engmark >= 80 && this.mathmark >= 80) {
			return true;
		}
		return false;
	}

	void resultDisplay() {
		double avg;
		Boolean result = calResult();
		if (result) {
			avg = calPercentage();
			System.out.println("Success");
			System.out.println("Percentage is"+avg + "% ");
		} else {
			System.out.println("FAILED");
		}
	}

	public static void main(String[] args) {
	studentresult viewres= new studentresult();
	viewres.inputStudentDetails();
		viewres.resultDisplay();
		
	}

}
