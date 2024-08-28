package assignment.sixthhdayW3D2;

public class JavaConnectionConcrete extends MySqlConnection {
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
		JavaConnectionConcrete javaconcrete=new JavaConnectionConcrete();
		javaconcrete.connect();
		javaconcrete.disconnect();
		javaconcrete.executeupdate();
		javaconcrete.executeQuery();
	}
}
