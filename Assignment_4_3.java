/*3. Write a program which accept number from user
and display all its non factors.

Input  : 12
Output : 5 7 8 9 10 11

Input  : 13
Output : 2 3 4 5 6 7 8 9 10 11 12  

Input  : 10
Output : 3 4 6 7 8 9
 */

import java.util.*;

class Demo{
    public void NonFact(int iNo)
    {
        int iCnt = 0;
        for(iCnt =1; iCnt<iNo; iCnt++)
        {
            if(iNo % iCnt != 0)
            {
                System.out.print(" "+iCnt);
            }
        }
    }
}

class Assignment_4_3
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter number :");
        iValue = sobj.nextInt();

        Demo obj = new Demo();
        obj.NonFact(iValue);
    }
}