import java.util.Random;

public class EmpCheck {
	static int fullday = 8;
	static int wageperhour = 20;
	static int parttimehour = 4;
	static int NumberOfWorkingDays = 20;
	static int totalemppwage;
	static int maxhours = 100;
	static int presentorabsent1, totalHrs = 0;

	public static int checkEmp() {
		Random check1 = new Random();
		presentorabsent1 = check1.nextInt(0, 3);
		return presentorabsent1;
	}

	public static void checkingifpresentorabsent() {
		switch (presentorabsent1) {
		case 1:
			totalemppwage = totalemppwage + parttimehour * wageperhour;
			totalHrs = totalHrs + parttimehour;
			break;
		case 2:
			totalemppwage = totalemppwage + fullday * wageperhour;
			totalHrs = totalHrs + parttimehour;
			break;
		case 3:
			System.out.println("Employee is absent");
			break;

		}

	}

	public static void main(String[] args) {

		for (int i = 0; totalHrs < maxhours && i < NumberOfWorkingDays; i++) {
			checkEmp();
			checkingifpresentorabsent();

		}
		System.out.println("total Emp wage is: " + totalemppwage + " for total hours:" + totalHrs);
	}
}
