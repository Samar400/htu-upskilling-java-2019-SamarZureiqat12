package WierTransfer;

public class Person {
	String name;
	int idNum;
	int phoneNum;
	Address address;
	
	
	public boolean equals(Object o) {
		if (o instanceof Person) {
			Person per=(Person)o;
			if(per.name.equals(this.name))
				return true;
			
			
		}
		return false;
	}
public String toString() {
	return name;
}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdNum() {
		return idNum;
	}
	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}
	public int getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	

}
