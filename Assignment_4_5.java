/*4. Write a program which accept number from user
and return difference between summation of all its
factors and  non factors.

Input  : 12
Output : -34  (16 -50)

Input  : 10
Output : -29   (8 -37)
*/

import java.util.*;

class Demo{

    public int FactDiff(int iNo)
    {
        int iCnt = 0, iSumFact = 0, iSumNonFact = 0;
        for(iCnt = 1; iCnt<iNo; iCnt++)
        {
            if(iNo %iCnt ==0)
            {
                iSumFact = iSumFact + iCnt;
            }
            else
            {
               iSumNonFact = iSumNonFact + iCnt; 
            }
        }
        return iSumFact - iSumNonFact;
    }
}

class Assignment_4_5
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0, iRet = 0;

        System.out.println("Enter number :");
        iValue = sobj.nextInt();

        Demo obj = new Demo();
        iRet = obj.FactDiff(iValue);
        System.out.println(" "+iRet);
    }
}