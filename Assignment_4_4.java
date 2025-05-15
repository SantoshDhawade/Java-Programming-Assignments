/*4. Write a program which accept number from user
and return summation of all its non factors.

Input  : 12
Output :50

Input  : 10
Output : 37
*/

import java.util.*;

class Demo{

    public void SumNonFact(int iNo)
    {
        int iCnt = 0, iSum = 0;
        for(iCnt = 1; iCnt<iNo; iCnt++)
        {
            if(iNo %iCnt !=0)
            {
                iSum = iSum + iCnt;
            }

        }
        System.out.println(" "+iSum);
    }
}

class Assignment_4_4
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter number :");
        iValue = sobj.nextInt();

        Demo obj = new Demo();
        obj.SumNonFact(iValue);

    }
}