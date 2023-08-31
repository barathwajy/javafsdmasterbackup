package demo_oops_pojo;

public class Student {
	int sno;
	String name;
	int phone;
	
	
	
	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}

	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	
}
