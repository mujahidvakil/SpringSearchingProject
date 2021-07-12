package springSearch.search.entity;

import java.util.Date;
import java.util.List;

public class Student {

	private String name;
	private String email;
	private Date dob;
	private String courses;
	
	private Adress adress;
	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", dob=" + dob + ", courses=" + courses + ", adress="
				+ adress.getCity()+":"+adress.getStreet() + ", section=" + section + ", gender=" + gender + "]";
	}
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	private List<Integer> section;
	private String gender;
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getCourses() {
		return courses;
	}
	public void setCourses(String courses) {
		this.courses = courses;
	}
	public List<Integer> getSection() {
		return section;
	}
	public void setSection(List<Integer> section) {
		this.section = section;
	}
	
	
}
