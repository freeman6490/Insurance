import java.io.*;
import java.util.*;
public class MemberAssessor {
	private static int total = 0;
	private static int bmi = 0;
	public static int calcBmi(int height, int weight) {
		//weight in pounds divided by height squared multiplied by 703
		bmi = (weight / (height * height)) * 703;
		return bmi;
	}
	public static int memberAssessor(int age, int weight, int height, int sysBP, int diaBP, String cancer, String diabetes, String alzheimers) {
		if (age < 30) {
			total = total;
		}
		else if (age < 45) {
			total = total + 10;
		} else if (age < 60) {
			total = total + 20;
		}
		else {
			total = total + 30;
		}
		if (bmi < 25) {
			total = total;
		}
		else if (bmi < 30) {
			total = total + 30;
		}
		else {
			total = total + 75;
		}
		if (sysBP < 120 && diaBP < 80) {
			total = total;
		} else if (sysBP < 139 && diaBP < 80) {
			total = total + 15;
		} else if (sysBP < 139 || diaBP < 89) {
			total = total + 30;
		} else if (sysBP > 140 || diaBP > 90) {
			total = total + 75;
		} else {
			total = total + 100;
		}
		if (cancer == "n") {
			total = total;
		} else {
			total = total + 10;
		}
		if (diabetes == "n") {
			total = total;
		}
		else {
			total = total + 10;
		}
		if (alzheimers == "n") {
			total = total;
		}
		else {
			total = total + 10;
		}
		return total;
		
	} 
	
}
