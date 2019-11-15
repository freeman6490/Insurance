
public class InsuranceScore {
	private int score, age, height, weight, sysBP, diaBP;
	private String verdict, firstName, lastName, cancer, diabetes, alzheimers;
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFirstName() {
		return firstName;
	}
	public int getDiaBP() {
		return diaBP;
	}
	public void setDiaBP(int diaBP) {
		this.diaBP = diaBP;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getSysBP() {
		return sysBP;
	}
	public void setSysBP(int sysBP) {
		this.sysBP = sysBP;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCancer() {
		return cancer;
	}
	public void setCancer(String cancer) {
		this.cancer = cancer;
	}
	public String getDiabetes() {
		return diabetes;
	}
	public void setDiabetes(String diabetes) {
		this.diabetes = diabetes;
	}
	public String getAlzheimers() {
		return alzheimers;
	}
	public void setAlzheimers(String alzheimers) {
		this.alzheimers = alzheimers;
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