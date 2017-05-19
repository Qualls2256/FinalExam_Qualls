import javax.swing.JOptionPane;

public class Converter {

	public String changeToHex(int intBase10) {
		String answer = "";
		// code for you to complete
		if (intBase10 < 0 || intBase10 > 255) {
			JOptionPane.showMessageDialog(null, "Error, range outside of 0-255, please try again");
			return null;
		}
		answer = Integer.toHexString(intBase10).toUpperCase();

		return answer;
	}

}
