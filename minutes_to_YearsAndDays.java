import java.util.*;
class minutes_to_YearsAndDays
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input the number of minutes: ");
        double m = sc.nextInt();
        
        double d = (m/60)/24;
        
        int years = (int)d/365;
        int days = (int)d%365;
        
        System.out.print(years+" years and "+days+" days");
    }
}