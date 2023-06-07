package utilities;

import org.testng.annotations.DataProvider;

public class InvalidPassword {
	@DataProvider(name = "invalidPasswords")
	public static Object loginDataset() {
		Object[][] objects = {
				{"qwerty@gmail.com", "", "can't be blank"},
				{"qwerty@gmail.com", "q", "Must be at least 6 characters"}
				};
		
		return objects;
	}
}
