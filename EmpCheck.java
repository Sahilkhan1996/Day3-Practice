import java.util.Random;

public class EmpCheck {
	static int fullday = 8;
	static int wageperhour = 20;
	static int parttimehour = 4;

	public static void main(String[] args) {

		Random check1 = new Random();
		int presentorabsent1 = check1.nextInt(0, 3);
		System.out.println(presentorabsent1);
		switch (presentorabsent1) {
		case 0:

			System.out.println("Employee is present");
			int DailyEmpWage = fullday * wageperhour;
			System.out.println("Full day working of Daily Wage of the Employee is: " + DailyEmpWage);
			break;
		case 1:
			System.out.println("Employee is present");
			int PartTimeDailyEmpWage = parttimehour * wageperhour;
			System.out.println("Part time working Daily Wage of the Employee is: " +PartTimeDailyEmpWage);

			break;
		case 2:
			System.out.println("Employee is absent");
			System.out.println("Zero Daily Wage because Emp is absent");

			break;

		}
	}
}