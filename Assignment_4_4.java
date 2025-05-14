/*4.Accept one character from user and convert case of that character.

Input : a   Output : A

Input : D   Output : d
*/


import java.util.*;

class Demo{

    public void DisplayConvert(char cValue)
    {
        if(cValue >= 'A' && cValue <= 'Z')
        {
            System.out.println((char)(cValue+32));
        }
        else if(cValue >= 'a' && cValue <= 'z')
        {
        System.out.println((char)(cValue-32));
        }
    }
}

class Assignment_4_4
{
public static void main(String args[])
{
    Scanner sobj = new Scanner(System.in);
    char cValue = '\0';

    System.out.println("Enter character :");
    cValue = sobj.next().charAt(0);

    Demo obj = new Demo();
    obj.DisplayConvert(cValue);
}
}

