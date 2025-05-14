/*1.Write a program which accept number from user 
and display its multiplication of factors.

Input  : 12
Output : 144  (1*2*3*4*6) 

Input  : 13
Output : 1  (1) 

Input  : 10
Output : 10  (1*2*5) 
*/

import java.util.*;

class Demo{
    public int MultFact(int iNo)
    {
        int iCnt =0, iFactMul =1;
        for(iCnt = 1 ; iCnt <= iNo/2 ; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iFactMul = iFactMul * iCnt;
            }
        }
        return iFactMul;
    }
}

class Assignment_4_1
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter number :");
        iValue = sobj.nextInt();

        Demo obj = new Demo();
        iRet = obj.MultFact(iValue);

        System.out.println(" "+iRet);
    }
}