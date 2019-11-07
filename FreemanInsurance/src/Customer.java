import java.io.*;
import java.util.*;
public class Customer {
	private String firstName, lastName, cancer, diabetes, alzheimers;
	private int age, heightInInches, weightInPounds, sysBP, diaBP;
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
	public int getHeightInInches() {
		return heightInInches;
	}
	public void setHeightInInches(int heightInInches) {
		this.heightInInches = heightInInches;
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
	public int getWeightInPounds() {
		return weightInPounds;
	}
	public void setWeightInPounds(int weightInPounds) {
		this.weightInPounds = weightInPounds;
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
	public Customer (String firstName, String lastName, int age, int heightInInches,
			int weightInPounds, int sysBP, int diaBP, String cancer, String diabetes, String alzheimers) {
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
		setHeightInInches(heightInInches);
		setWeightInPounds(weightInPounds);
		setSysBP(sysBP);
		setDiaBP(diaBP);
		setCancer(cancer);
		setDiabetes(diabetes);
		setAlzheimers(alzheimers);
	}
}
