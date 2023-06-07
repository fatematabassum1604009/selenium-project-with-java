package utilities;

import org.testng.annotations.DataProvider;

public class LoginDataset {
	@DataProvider(name = "invalidCredentials")
	public static Object loginDataset() {
		Object[][] objects = {
				{"taufiqrahaman@gmail.com", "         ", "Invalid credentials provided."},
				{"taufi@gmail.com", "123456taufiq", "Invalid credentials provided."}, 
				{"taufiqrahaman@gmail.com", "qwertye", "Invalid credentials provided."}, 
				{"taufiqrahman@gmail.com","qwertye", "Invalid credentials provided."}};
		
		return objects;
	}
	@DataProvider(name = "invalidCredentialPassword")
	public static Object loginDatasetPassword() {
		Object[][] objects = {
				{"qwerty@gmail.com", "", "can't be blank"},
				{"qwerty@gmail.com", "q", "Must be at least 6 characters"}
				};
		
		return objects;
	}
	@DataProvider(name = "invalidCredentialEmail")
	public static Object loginDatasetEmail() {
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
