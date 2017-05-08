
 public abstract class person {
private String fname;
private String lname;
private String address;
public person(String fname, String lname, String address) {
	super();
	this.fname = fname;
	this.lname = lname;
	this.address = address;
}

@Override
public String toString() {
	return "person [fname=" + fname + ", lname=" + lname + ", address="
			+ address + "]";
}

public abstract void showDetails();

public String getFname() {
	return fname;
}

public String getLname() {
	return lname;
}

public String getAddress() {
	return address;
}

}
