/*1.write a program which accept one number from
 user and print that number of even numbers on screen.
 
 Input  : 7
 Output : 2 4  6 8 10 12 14
 */

import java.util.*;

class Demo{
    public void Display(int iNo)
    {
        int iCnt =0;
        for(iCnt =1 ; iCnt <=iNo ; iCnt++)
        {
            System.out.print(" "+(iCnt*2));
        }
    }
}

class Assignment_3_1
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