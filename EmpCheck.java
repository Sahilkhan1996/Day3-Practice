import java.util.Random;

public class EmpCheck {
	static int fullday=8;
    static int wageperhour = 20;
    static int parttimehour = 4;
    static int NumberOfWorkingDays=20;
    static int totalemppwage;
    static int maxhours = 100;
    
    public static void main(String[] args)
    {
        int totalHrs = 0;
        for (int i = 0; totalHrs<maxhours &&  i < NumberOfWorkingDays; i++)
        {
            Random check1 = new Random();
            int presentorabsent1 = check1.nextInt(0, 3);
           

            switch (presentorabsent1)
            {
                case 1:
                    totalemppwage = totalemppwage + parttimehour * wageperhour;
                    totalHrs = totalHrs+parttimehour;
                    break;
                case 2:
                    totalemppwage = totalemppwage + fullday * wageperhour;
                    totalHrs =totalHrs+ parttimehour;
                    break;
                case 3: System.out.println("Employee is absent"); break;

            }
        }
        System.out.println("total Emp wage is: " +totalemppwage+" for total hours:"+totalHrs );
    }
}
