// 1.Program to divide two numbers.

import java.util.*;

class Div
{
	public int Divide(int iNo1, int iNo2)
	{
		int iAns =0 ;
		if (iNo2<0)
	{
	return -1;
	}
		iAns = iNo1 / iNo2;
		return iAns;
	}
}

class Assignment_1_1

{
	public static void main(String args[])
	{
		int iValue1 = 15 , iValue2 = 5;
		int iRet = 0;
		
		Div obj = new Div();
		
		iRet = obj.Divide(iValue1, iValue2);
		
		System.out.println("Division is:"+iRet);
		
	}
}