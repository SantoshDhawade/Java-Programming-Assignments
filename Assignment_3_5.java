/*5. Accept a character from user and check whether 
that character is vowel()a,e,i,o,u) or not.

Input : E   Output :TRUE 

Input : d   Output :FALSE
*/

import java.util.*;

class Demo{
    public boolean ChkVowel(char cVal)
    {
      if(cVal == 'a' || cVal == 'e' || cVal == 'i' || cVal == 'o' || cVal == 'u' || cVal == 'A' || cVal == 'E' || cVal == 'I' || cVal == 'O' || cVal == 'U')
	{  
        return true;
    }
    else 
    {
        return false;
    }
    }
}

class Assignment_3_5
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        char cValue = '\0';
        boolean bRet = false;


        System.out.println("Enter character :");
        cValue = sobj.next().charAt(0);

        Demo obj = new Demo();
        bRet = obj.ChkVowel(cValue);

        if(bRet == true)
        {
            System.out.println(" It is Vowel");
        }
        else{
            System.out.println(" It is not Vowel");
        }


    }
}