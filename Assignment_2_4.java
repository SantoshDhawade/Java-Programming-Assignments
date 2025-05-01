/*4. Accept two numbers from user and display first 
number in second number of times

Input  : 12 5
Output : 12 12 12 12 12 12

Input  : -2 3
Output : -2 -2 -2

Input  : 21 -3
Output : 21 21 21

*/

import java.util.*;

class Demo{

    public void Display(int iNo, int iFrequency)
    {
        if(iFrequency < 0)
        {
            iFrequency = - iFrequency;
        }
        int iCnt = 0;

        for(iCnt = 0 ; iCnt < iFrequency ; iCnt++)
        {
            System.out.print(" "+iNo);
        }
    }
}

class Assignment_2_4
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0, iCount = 0;

        System.out.println("Enter number");
        iValue = sobj.nextInt();

        System.out.println("Enter frequency");
        iCount = sobj.nextInt();

        Demo obj = new Demo();
        obj.Display(iValue , iCount);
    }
}