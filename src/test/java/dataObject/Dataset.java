package dataObject;

import org.testng.annotations.DataProvider;

public class Dataset {
	/*************
	 * This part belongs to registation
	 * ************/
	@DataProvider(name = "registrationdata")
	public static Object[][] registrationFunc() {
		Object[][] data = {
				{ "mahmudurraahman00@gmail.com", "mahmudur", "rahman", "jawad@123444", "12", "5", "1996", "jawad",
						"ahmed", "Sebpo", "front panasulia road", "back janasulia road", "Dhaka", "7", "42510", "21",
						"bla bla bla", "125-365-9984", "253-212-2000", "BigBloom" },{ "mahmudurraahman000@gmail.com", "mahmudur", "rahman", "jawad@123444", "12", "5", "1996", "jawad",
				"ahmed", "ServicEngineltd.", "aback panalia road", "front jasulia road", "Dhaka", "7", "42510", "21",
				"bla bla bla", "125-365-9984", "253-212-2000", "BigBloom" }};
		return data;

	}
	/*************
	 * This part belongs to Login
	 * ************/
	@DataProvider(name = "signingdata")
	public static Object[][] signingFunc() {
		Object[][] data = { { "mahmudurraahman00@gmail.com", "jawad@123444" },{ "mahmudurraahman000@gmail.com", "jawad@123444" }
				 };
		return data;
	}

}
