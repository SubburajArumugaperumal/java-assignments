package assignment.fifthdayW3D1;

public class LoginTestData extends TestData{
	public void enterUsername() {
		System.out.println("user name is"+"Subburaj");
	}
public void enterPassWord() {
	System.out.println("password is"+"8344421727");
}
public static void main(String[] args) {
	LoginTestData ld=new LoginTestData();
	ld.enteraCredentials();
	ld.navigateHomePage();
	ld.enterUsername();
	ld.enterPassWord();
}
}
