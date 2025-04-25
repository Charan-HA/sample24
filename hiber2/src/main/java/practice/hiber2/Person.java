package practice.hiber2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person {
	@Id
	int id;
	String nickName;
	@OneToOne
	AadharCard ac;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int id, String nickName, AadharCard ac) {
		super();
		this.id = id;
		this.nickName = nickName;
		this.ac = ac;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public AadharCard getAc() {
		return ac;
	}

	public void setAc(AadharCard ac) {
		this.ac = ac;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", nickName=" + nickName + ", ac=" + ac + "]";
	}
	
	
}
