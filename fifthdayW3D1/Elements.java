package assignment.fifthdayW3D1;

public class Elements extends Button {
	public static void main(String[] args) {
		Button bt = new Button();
		bt.click();
		bt.setText("raj");
		bt.submit();
		System.out.println();

		TextField tf = new TextField();
		tf.click();
		tf.setText("kumar");
		tf.getText();
		System.out.println();
		
		WebElement we = new WebElement();
		we.click();
		we.setText("subbu");
		System.out.println();
		
		CheckBoxButton cb=new CheckBoxButton();
		cb.click();
		cb.setText("girija");
		cb.submit();
		cb.clickCheckButton();
		System.out.println();
		
		RadioButton rb=new RadioButton();
		rb.click();
		rb.setText("suressh");
		rb.submit();
		rb.selectRadioButton();
		System.out.println();
		}
}
