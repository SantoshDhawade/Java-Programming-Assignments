/*3. write a program which accept number from user and
print even factors of that number.

Input  : 36
Output : 2 4 6 8 12 18 */

import java.util.*;

class Demo{
    public void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1 ; iCnt <= iNo/2 ; iCnt++)
        {
            if(iNo % iCnt == 0 && iCnt % 2 == 0)
            {
                System.out.print(" "+iCnt);
            }
        }
    }
}

class Assignment_3_3
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter the number");
        iValue = sobj.nextInt();

        Demo obj = new Demo();

        obj.Display(iValue);
    }
}
