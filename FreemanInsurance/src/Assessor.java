import java.util.*;
import java.io.*;
public class Assessor {
	public String getTotalScore(int score) {
		if (score <= 20) {
			return "low risk";
		} else if (score <= 50) {
			return "moderate risk";
		} else if (score <= 75) {
			return "high risk";
		} else {
			return "uninsurable";
		}
	}
}