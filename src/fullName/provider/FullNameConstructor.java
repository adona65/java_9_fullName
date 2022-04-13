package fullName.provider;

import firstName.provider.FirstName;
import lastName.provider.LastName;

public class FullNameConstructor {
	public String getFullName() {
		FirstName first = new FirstName();
		MiddleName middle = new MiddleName();
		LastName last = new LastName();
		return "Construction of full name into java_9_fullName module : " 
				+ first.getFirstName() 
				+ " " + middle.getMiddleName()
				+ " " + last.getLastName();
	}
}
