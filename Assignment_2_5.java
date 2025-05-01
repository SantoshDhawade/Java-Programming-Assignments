/*5. Accept number from user and check whether number 
is even or odd*/


import java.util.*;

class Demo{

    public boolean chkEven(int iNo)
    {
        if(iNo %2 ==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Assignment_2_5
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter the number");
        iValue = sobj.nextInt();

        Demo obj = new Demo();
        bRet = obj.chkEven(iValue);

        if(bRet ==  true)
        {
            System.out.println("Number is Even");
        }
        else 
        {
            System.out.println("Number is Odd");
        }

    }
}