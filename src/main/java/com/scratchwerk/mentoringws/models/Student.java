package com.scratchwerk.mentoringws.models;

public class Student {
	
	private long id;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String email;
	
	private String gender;
	private int age;
	
	
	private Parent parent;
	private School school;
	private Mentor mentor;
	private int grade;
	//private GradeReport gradeReport;
	
	//Contructors
	public Student(){
		super();
	}
	
	
	public Student(long id, String firstName, String lastName, String phoneNum,
			String email, String gender, int age, Parent parent, School school,
			int grade) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
		this.email = email;
		this.gender = gender;
		this.age = age;
		this.parent = parent;
		this.school = school;
		this.grade = grade;
	}



	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Parent getParent() {
		return parent;
	}
	public void setParent(Parent parent) {
		this.parent = parent;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}


	public Mentor getMentor() {
		return mentor;
	}


	public void setMentor(Mentor mentor) {
		this.mentor = mentor;
	}
	
	
	
	

}
