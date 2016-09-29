package cn.com.github2;

public class Student {

	private int age;
	private String passwrod;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPasswrod() {
		return passwrod;
	}
	public void setPasswrod(String passwrod) {
		this.passwrod = passwrod;
	}
	public Student(int age, String passwrod) {
		super();
		this.age = age;
		this.passwrod = passwrod;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", passwrod=" + passwrod + "]";
	}
	
	
	
}
