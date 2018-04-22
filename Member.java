package nga.oop2;

public class Member {
	private String name;
	private int age;
	private int YOB;
	private String job;
	public Member() {
		super();
	}
	public Member(String name, int age, int yOB, String job) {
		super();
		this.name = name;
		this.age = age;
		YOB = yOB;
		this.job = job;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getYOB() {
		return YOB;
	}
	public void setYOB(int yOB) {
		YOB = yOB;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "Member[ Name: " + name + ", age: " + age + ", YearOfBirth: " + YOB + ", job: " + job + "]";
	}
	
}
