//4. Accept one number from user and check whether it is divisible by 5 or not.

import java.util.*;

class Demo
{
	
	public boolean Check(int iNo)
	{
		if(iNo % 5 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}


class Assignment_1_4
{
	public static void main(String args[]) 
	{
		Scanner sobj = new Scanner(System.in);
		int iValue = 0;
		boolean bRet = false;
		
		System.out.println("Enter number");
		
		iValue = sobj.nextInt();
		
		Demo obj = new Demo();
		
		bRet = obj.Check(iValue);
		
		if(bRet == true)
		{
			System.out.println("Divisible by 5");
		}
		else
		{
			System.out.println("Not Divisible by 5");
		}
	}
}