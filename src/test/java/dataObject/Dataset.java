package dataObject;

import org.testng.annotations.DataProvider;

public class Dataset {

	@DataProvider(name = "registrationdata")
	public static Object[][] registrationFunc() {
		Object[][] data = {
				{ "mahmudurraahman8900@gmail.com", "mahmudur", "rahman", "jawad@123444", "12", "5", "1996", "jawad",
						"ahmed", "Sebpo", "front panasulia road", "back janasulia road", "Dhaka", "7", "42510", "21",
						"bla bla bla", "125-365-9984", "253-212-2000", "BigBloom" },
				{ "mahmudurrahman1111@gmail.com", "Jawad", "Ahmed", "mahmudur@123444", "12", "5", "1996", "jawad",
						"ahmed", "Sebpo", "front panasulia road", "back janasulia road", "Dhaka", "7", "42510", "21",
						"bla bla bla", "125-365-9984", "253-212-2000", "BigBloom" }};
		return data;

	}

	@DataProvider(name = "signingdata")
	public static Object[][] signingFunc() {
		Object[][] data = { { "mahmudurrahman.sqa@gmail.com", "jawad@123444" },
				{ "mahmudurrahman@gmail.com", "jawad@123444" } };
		return data;
	}

}
