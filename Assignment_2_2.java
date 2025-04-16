//2. Accept one number from user and print that number of * on Screen using while loop

import java.util.*;

class Demo{

    public void Display(int iNo)
    {
        while(iNo>0)
        {
            System.out.print(" * ");
            iNo --;
        }
    }
}

class Assignment_2_2
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

