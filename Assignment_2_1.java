//1. Accept one number from user and print that number of * on Screen


import java.util.*;

class Demo 
{
	public void Display(int iNo)
	{
		int iCnt = 0;
		for(iCnt = 0; iCnt < iNo; iCnt++)
		{
			System.out.print(" * ");
		}
	}
	
}

class Assignment_2_1
{
public static void main(String args[])
{
	Scanner sobj = new Scanner(System.in);
	
	int iValue = 0;
	
	System.out.println("Enter number :");
	iValue = sobj.nextInt();
	
	Demo obj = new Demo();
	
	obj.Display(iValue);
	
}
}