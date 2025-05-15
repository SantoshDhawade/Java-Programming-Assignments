/*1.Write a program which accept nnnumber from user 
and display its digits in reverse order.
Input  : 2395

OUTPUT : 5 9 3 2 

Input  : 1018

OUTPUT : 8 1 0 1

Input  : -1018

OUTPUT : 8 1 0 1

Input  : 9000

OUTPUT : 0 0 0 9
*/

import java.util.*;

class Demo{
    public void DisplayDigit(int iNo)
    {
        int iDigit = 0;
        if(iNo <0 )
        {
            iNo = -iNo;
        }
        while(iNo > 0)
        {
            iDigit = iNo % 10;
            System.out.print(iDigit);

            iNo = iNo / 10;
        }
    }
}

class Assignment_5_1
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter number :");
        iValue = sobj.nextInt();

        Demo obj = new Demo();
        obj.DisplayDigit(iValue);
    }
}