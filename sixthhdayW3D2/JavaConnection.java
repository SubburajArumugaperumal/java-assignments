package assignment.sixthhdayW3D2;

public class JavaConnection implements DatabaseConnection {
	
	@Override
	public void connect() {
		System.out.println("It is Connected");	
	}
	
	@Override
	public void disconnect() {
		System.out.println("It is disConnected");	
	}
	@Override
	public void executeupdate() {
		System.out.println("It is executed successfully");
	}
	public static void main(String[] args) {
	JavaConnection java=new JavaConnection();
	java.connect();
	java.disconnect();
	java.executeupdate();
	}
		

	

}
