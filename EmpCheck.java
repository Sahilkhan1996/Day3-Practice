import java.util.Random;

public class EmpCheck {
	static int fullday = 8;
	static int wageperhour = 20;
	static int parttimehour = 4;
	static int NumberOfWorkingDays=20;
    static int totalempwage;
    
	public static void main(String[] args) {

		Random check1 = new Random();
		int presentorabsent1 = check1.nextInt(0, 3);
		System.out.println(presentorabsent1);
		switch (presentorabsent1) {
		case 0:

			System.out.println("Employee is present");
			int DailyEmpWage = fullday * wageperhour;
			totalempwage=NumberOfWorkingDays*DailyEmpWage;
			System.out.println("Total wage for Full day working of Daily Wage of the Employee is: " +totalempwage);
			break;
		case 1:
			System.out.println("Employee is present");
			int PartTimeDailyEmpWage = parttimehour * wageperhour;
			totalempwage=NumberOfWorkingDays*PartTimeDailyEmpWage;
			System.out.println("Total wage for Part time working Daily Wage of the Employee is: " +totalempwage);

			break;
		case 2:
			System.out.println("Employee is absent");
			System.out.println("Total wage is zero because Emp is absent");

			break;

		}
	}
}