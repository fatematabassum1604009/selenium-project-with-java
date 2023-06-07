package utilities;

import org.testng.annotations.DataProvider;

public class InvalidEmail {
	@DataProvider(name = "invalidEmails")
	public static Object loginDataset() {
		Object[][] objects = {
				{"", " ......7", "can't be blank"},
				{"qwerty", " ......7", "is not a valid email"},
				{"     ", " ......7", "is not a valid email"},
				{"qwerty@gmail.", " ......7", "is not a valid email"},
				{"qwerty@gma", " ......7", "is not a valid email"},
				{"qwerty@", "123456789", "is not a valid email"}, 
				{"qwerty@gmail"," abc@c.com", "is not a valid email"}};
		
		return objects;
	}
}
