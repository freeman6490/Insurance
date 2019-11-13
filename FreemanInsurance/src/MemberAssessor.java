import java.io.*;
import java.util.*;
/**
 * Member assessor which is used to decide whether a person can be insured
 * or not, and also determines their risk level
 * @author luke freeman
 */
public class MemberAssessor {
	private static int total = 0;
	private static int bmi = 0;
	public static int calcBmi(int height, int weight) {
		//weight in pounds divided by height squared multiplied by 703
		bmi = (weight / (height * height)) * 703;
		return bmi;
	}
	public static int calcTotalForAge(int age) {
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
		return total;
	}
	public static int findTotalForBmi(int bmi, int height, int weight) {
		if (calcBmi(height, weight) < 25) {
			total = total;
		}
		else if (calcBmi(height,weight) < 30) {
			total = total + 30;
		}
		else {
			total = total + 75;
		}
		return total;
	}
	public static int findTotalForSysBPAndDiaBP(int sysBP, int diaBP) {
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
		return total;
	}
	public static int findTotalForCancer(String cancer) {
		if (cancer == "n") {
			total = total;
		} else {
			total = total + 10;
		}
		return total;
	}
	public static int findTotalForDiabetes(String diabetes) {
		if (diabetes == "n") {
			total = total;
		}
		else {
			total = total + 10;
		}
		return total;
	}
	public static int findTotalForAlzheimers(String alzheimers) {	
		if (alzheimers == "n") {
			total = total;
		}
		else {
			total = total + 10;
		}
		return total;
	}
	public static int memberAssessor(ArrayList<Customer> result) {
		int finalTotal = 0;
		calcTotalForAge(age);
		
	} 
}
