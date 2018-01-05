package ken.week18_02;

public class Student {
	int age;
	String name;
	String number;
	String sex;
	public Student(int age, String name, String number, String sex) {
		//super();
		this.age = age;
		this.name = name;
		this.number = number;
		this.sex = sex;
	}
	public Student() {
		//super();
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String show() {
		return "Student [age=" + age + ", name=" + name + ", number=" + number
				+ ", sex=" + sex + "]";
	}
	
	
	

}
