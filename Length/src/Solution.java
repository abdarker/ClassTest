import java.util.Scanner;

public class Solution
{
	public static void main(String [] args)
	{
		Length length1 = new Length();
		Length length2 = new Length();
		Scanner in = new Scanner(System.in);
		
		System.out.print("1. Yard, Feet, Inches : ");
		
		length1.yard = in.nextInt();
		length1.feet = in.nextInt();
		length1.inch = in.nextInt();
		
		System.out.print("2. Yard, Feet, Inches : ");
		
		length2.yard = in.nextInt();
		length2.feet = in.nextInt();
		length2.inch = in.nextInt();
		
		Length temp = calculateSum(length1, length2);
		System.out.print("Sum: " + temp.yard + " " + temp.feet + " " + temp.inch);
	}
	
	public static Length calculateSum(Length length1, Length length2)
	{
		Length length3 = new Length();
		
		length3.yard = 0;
		length3.feet = 0;
		length3.inch = 0;
		
		if(length1.inch + length2.inch >= 12)
		{
			length3.feet += (length1.inch + length2.inch) / 12;
			length3.inch = (length1.inch + length2.inch) % 12;
		}
		else
		{
			length3.inch = (length1.inch + length2.inch);
		}
		
		///////////////////////////////////////////////////////
		
		if(length1.feet + length2.feet + length3.feet>= 3)
		{
			length3.yard += (length1.feet + length2.feet + length3.feet) / 3;
			length3.feet = (length1.feet + length2.feet + length3.feet) % 3;
		}
		else
		{
			length3.feet = (length1.feet + length2.feet + length3.feet);
		}
		
		///////////////////////////////////////////////////////
		
		length3.yard = (length1.yard + length2.yard + length3.yard);
		
		return length3;
	}
}