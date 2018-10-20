/**
 * Created by Kirito on 21/10/2018.
 */
import java.util.Scanner;
public class Solution {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        Time time1 = new Time();
        System.out.print("Unit 1:");
        time1.hour = scan.nextInt();
        time1.minute = scan.nextInt();
        time1.second = scan.nextInt();

        Time time2 = new Time();
        System.out.print("Unit 2:");
        time2.hour = scan.nextInt();
        time2.minute = scan.nextInt();
        time2.second = scan.nextInt();

        Time calc = calculateSum(time1, time2);

        System.out.print(+calc.hour +" " +calc.minute+" " +calc.second);

    }


    public static Time calculateSum(Time time1, Time time2) {

        Time time3 = new Time();
        time3.hour = 0;
        time3.minute = 0;
        time3.second = 0;

        if (time1.second + time2.second >= 60) {
            time3.minute += (time1.second + time2.second)/60;
            time3.second = (time1.second + time2.second)%60;
        } else {
            time3.second = (time1.second + time2.second);
        }
        if (time1.minute + time2.minute +time3.minute >= 60) {
            time3.hour = (time1.minute + time2.minute + time3.minute) / 60;
            time3.minute = (time1.minute + time2.minute + time3.minute) % 60;
        } else {
            time3.minute = time1.minute + time2.minute;
        }

        if(time1.hour+time2.hour+time3.hour ==24){
            time3.hour= (time1.hour+time2.hour+time3.hour)%24;
        }
        else if(time1.hour+time2.hour+time3.hour>24){
            time3.hour= (time1.hour+time2.hour+time3.hour)%24;
        }
        else{
            time3.hour += time1.hour + time2.hour;
        }


        return time3;

    }
}

