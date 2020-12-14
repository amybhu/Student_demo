package com.wipro.student;

public class Student {
	private String name;
	private String roll;
    private String cla;
	public String getCla() {
		return cla;
	}

	public void setCla(String cla) {
		this.cla = cla;
	}

	private String grade;
	private String stream;
	
	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void displayInfo(){
		System.out.println("Hello: "+name+"\nYour Roll no. is:"+roll+"\nYour stream is:"+stream+"\nYour class is:"+cla+"\nGarde got:"+grade);
	}
	

}
