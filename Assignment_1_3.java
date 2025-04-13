// 3. Program to print 5 to 1 numbers on screen.

import java.util.*;

class Demo
{
	public void Display()
	{
		int i = 0;
		for(i=5; i>=1; i--)
		{
			System.out.print(i+"\t");
		}
	}
}

class Assignment_1_3
{
	public static void main(String args[])
	{
		Demo obj = new Demo();
		obj.Display();
	}
	
}