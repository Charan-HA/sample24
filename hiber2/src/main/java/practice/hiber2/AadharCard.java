package practice.hiber2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class AadharCard {
	@Id
	int aadNum;
	String name;
	String address;
	String gender;
	@OneToOne
	Person p;
	
	public AadharCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AadharCard(int aadNum, String name, String address, String gender, Person p) {
		super();
		this.aadNum = aadNum;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.p = p;
	}

	public int getAadNum() {
		return aadNum;
	}

	public void setAadNum(int aadNum) {
		this.aadNum = aadNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Person getP() {
		return p;
	}

	public void setP(Person p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "AadharCard [aadNum=" + aadNum + ", name=" + name + ", address=" + address + ", gender=" + gender
				+ ", p=" + p + "]";
	}
	
	
}
