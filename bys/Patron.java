public class Patron {
	private String name;
	private String mobileNumber;

	public Patron(String name,String mobileNumber) {
		this.name = name;
		this.mobileNumber = mobileNumber;
	}

	public String toString() {
		return name +","+ mobileNumber;
	}
}