import java.util.Random;

public class EmpCheck {
	public static void main(String[] args) {
		int EmpIsPresent = 1;
		Random check1 = new Random();
		int presentorabsent1 = check1.nextInt(0, 2);
		System.out.println(presentorabsent1);
		if (presentorabsent1 == EmpIsPresent) {
			System.out.println("Employee is present");
		} else {
			System.out.println("Employee is absent");

		}
	}
}