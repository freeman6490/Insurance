import java.io.*;
import java.util.*;
@SuppressWarnings("unused")
public class Customer implements Serializable {
	private String firstName, lastName, cancer, diabetes, alzheimers;
	private int age, height, weight, sysBP, diaBP;
	private ArrayList<Customer> result;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName (String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCancer() {
		return cancer;
	}
	public void setCancer(String cancer) {
		this.cancer = cancer;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getAlzheimers() {
		return alzheimers;
	}
	public void setAlzheimers(String alzheimers) {
		this.alzheimers = alzheimers;
	}
	public String getDiabetes() {
		return diabetes;
	}
	public void setDiabetes(String diabetes) {
		this.diabetes = diabetes;
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
	public int getDiaBP() {
		return diaBP;
	}
	public void setDiaBP(int diaBP) {
		this.diaBP = diaBP;
	}
	@SuppressWarnings("null")
	public Customer() {
		firstName = "";
		lastName = "";
		age = (Integer) null;
		height = (Integer) null;
		weight = (Integer) null;
		sysBP = (Integer) null;
		diaBP = (Integer) null;
		cancer = "";
		diabetes = "";
		alzheimers = "";
	}
	/**
	 * Constructor for a "customer" or "member"
	 * @param firstName
	 * @param lastName
	 * @param age
	 * @param height
	 * @param weight
	 * @param sysBP
	 * @param diaBP
	 * @param cancer
	 * @param diabetes
	 * @param alzheimers
	 * @author luke freeman
	 */
	public Customer (String firstName, String lastName, int age, int height,
			int weight, int sysBP, int diaBP, String cancer, String diabetes, String alzheimers) {
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
		setHeight(height);
		setWeight(weight);
		setSysBP(sysBP);
		setDiaBP(diaBP);
		setCancer(cancer);
		setDiabetes(diabetes);
		setAlzheimers(alzheimers);
	}
	/**
	 * toString which just helps to format and print things to the screen correctly
	 * @author luke freeman
	 */
	@Override
	public String toString() {
		return String.format("%s %s %s %s %s %s %s %s %s %s\n", firstName, lastName, age, height, weight, sysBP, diaBP, cancer, diabetes, alzheimers);
	}
}
