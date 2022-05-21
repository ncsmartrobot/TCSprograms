package flipkart.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long CustomerID;
	private String FirstName;
	private String LastName;
	private String MailID;
	private double PhoneNumber;
	private String Address;
	private double PinCode;
	
	public long getCustomerID() {
		return CustomerID;
	}
	public void setCustomerID(long customerID) {
		CustomerID = customerID;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getMailID() {
		return MailID;
	}
	public void setMailID(String mailID) {
		MailID = mailID;
	}
	public double getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(double phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public double getPinCode() {
		return PinCode;
	}
	public void setPinCode(double pinCode) {
		PinCode = pinCode;
	}
	
}
