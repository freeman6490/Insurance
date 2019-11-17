public class InsuranceScore {
	private int score;
	private String verdict, firstName, lastName;
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getVerdict() {
		return verdict;
	}
	public void setVerdict(String verdict) {
		this.verdict = verdict;
	}
	public InsuranceScore(String firstName, String lastName, int score, String verdict) {
		setFirstName(firstName);
		setLastName(lastName);
		setScore(score);
		setVerdict(verdict);
	}
	@Override
	public String toString() {
		return String.format("%s %s has a score of %d, thus making them %s", firstName, lastName, score, verdict);
	}
}