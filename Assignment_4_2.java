/*1.Write a program which accept number from user 
and display its factors in decreasing order.

Input  : 12
Output : 6 4 3 2 1 

Input  : 13
Output : 1   

Input  : 10
Output : 5 2 1
*/

import java.util.*;

class Demo{
    public void FactRev(int iNo)
    {
        int iCnt = 0;
        for(iCnt = iNo/2 ; iCnt >=1 ; iCnt--)
        {
            if(iNo % iCnt == 0)
            {
                System.out.print(" "+iCnt);
            }
        }
    }
}

class Assignment_4_2
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue =0;

        System.out.println("Enter number :");
        iValue = sobj.nextInt();

        Demo obj = new Demo();
        obj.FactRev(iValue);

    }
}