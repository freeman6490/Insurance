import java.util.ArrayList;

/**
 * Member assessor which is used to decide whether a person can be insured
 * or not, and also determines their risk level
 * @author luke freeman
 */
public class MemberAssessor {
	private static int total = 0;
	private static int finalTotal = 0;
	public static int findTotalAge(Customer member) {
		int age = member.getAge();
		if (age <= 29) {
			total = 0;
		} else if (age <=45) {
			total = 10;
		} else if (age <=60) {
			total = 20;
		} else {
			total = 30;
		}
		return total;
	}
	public static int findTotalDia(Customer member) {
		String dia = member.getDiabetes();
		if (dia.equals("n")) {
			total = 0;
		} else {
			total = 10;
		}
		return total;
	}
	public static int findTotalCan(Customer member) {
		String can = member.getCancer();
		if (can.equals("n")) {
			total = 0;
		} else {
			total = 10;
		}
		return total;
	}
	public static int findTotalAlz(Customer member) {
		String alz = member.getAlzheimers();
		if (alz.equals("n")) {
			total = 0;
		} else {
			total = 10;
		}
		return total;
	}
	public static int findTotalForBP(Customer member) {
		int sysBP = member.getSysBP();
		int diaBP = member.getDiaBP();
		if (sysBP < 120 && diaBP < 80) {
			total = 0;
		} else if (sysBP <= 129 && diaBP < 80) {
			total = 15;
		} else if (sysBP <= 139 || diaBP < 89) {
			total = 30;
		} else if (sysBP >= 140 || diaBP >= 90) {
			total = 75;
		} else {
			total = 100;
		}
		return total;
	}
	public static int findTotalBmi(Customer member) {
		int height = member.getHeight();
		int weight = member.getWeight();
		int bmi = (weight /(height * height)) * 703;
		if (bmi >= 18.5 && bmi <= 24.9) {
			total = 0;
		} else if (bmi >= 25 && bmi <= 29.9) {
			total = 30;
		} else {
			total = 75;
		}
		return total;
	}
	/*
	public static int findTotalScore(int age, int height, int weight, int sysBP, int diaBP, String cancer, String diabetes, String alzheimers) {
		total = 0;
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
		if (calcBmi(height, weight) < 25) {
			total = total;
		}
		else if (calcBmi(height,weight) < 30) {
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
		if (cancer.equals("n")) {
			total = total;
		} else {
			total = total + 10;
		}
		if (diabetes.equals("n")) {
			total = total;
		}
		else {
			total = total + 10;
		}	
		if (alzheimers.equals("n")) {
			total = total;
		}
		else {
			total = total + 10;
		}
		return total;
	}
	*/
	public static void findVerdict(Customer member) {
		String verdict, stance;
		int ageTotal = 0, diaTotal = 0, canTotal = 0, BPTotal = 0, alzTotal = 0, bmiTotal = 0;
		ageTotal = findTotalAge(member);
		diaTotal = findTotalDia(member);
		canTotal = findTotalCan(member);
		BPTotal = findTotalForBP(member);
		alzTotal = findTotalAlz(member);
		bmiTotal = findTotalBmi(member);
		finalTotal = ageTotal + diaTotal + canTotal + BPTotal + alzTotal + bmiTotal;
		if (finalTotal <= 20) {
			stance = "low risk";
			verdict = stance;
		} else if (finalTotal <= 50) {
			stance = "moderate risk";
			verdict = stance;
		} else if (finalTotal <= 75) {
			stance = "high risk";
			verdict = stance;
		} else {
			stance = "uninsurable";
			verdict = stance;
		}
		String firstName = member.getFirstName();
		String lastName = member.getLastName();
		System.out.printf("for %s %s\n", firstName, lastName);
		System.out.printf("They had a score of %d\n", finalTotal);
		System.out.printf("Which makes them %s", verdict);
	}
}