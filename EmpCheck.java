import java.util.Random;

public class EmpCheck {
	static int fullday = 8;
	static int wageperhour = 20;

	public static void main(String[] args) {
		int EmpIsPresent = 1;
		Random check1 = new Random();
		int presentorabsent1 = check1.nextInt(0, 2);
		System.out.println(presentorabsent1);
		if (presentorabsent1 == EmpIsPresent) {
			System.out.println("Employee is present");
			int DailyEmpWage=fullday*wageperhour;
			System.out.println("Daily Wage of the Employee is: "+DailyEmpWage);

		} else {
			System.out.println("Employee is absent");
			System.out.println("Zero Daily Wage because Emp is absent");

		}
	}
}