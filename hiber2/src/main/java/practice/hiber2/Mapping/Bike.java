package practice.hiber2.Mapping;

import jakarta.persistence.*;

@Entity
public class Bike {
	@Id
	int modelNum;
	String brand;
	int price;
	@ManyToOne
	Person1 p;
	
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bike(int modelNum, String brand, int price, Person1 p) {
		super();
		this.modelNum = modelNum;
		this.brand = brand;
		this.price = price;
		this.p = p;
	}

	public int getModelNum() {
		return modelNum;
	}

	public void setModelNum(int modelNum) {
		this.modelNum = modelNum;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Person1 getP() {
		return p;
	}

	public void setP(Person1 p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "Bike [modelNum=" + modelNum + ", brand=" + brand + ", price=" + price + ", p=" + p + "]";
	}

	
}
