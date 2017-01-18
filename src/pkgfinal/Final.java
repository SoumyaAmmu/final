
package pkgfinal;

import java.util.Scanner;

public class Final {

    
    public static void main(String[] args) {
        String str1="";
        String str2="";
        Scanner s = new Scanner(System.in);
        int j;
        System.out.println("Enter the size 1st necklace");
        int size1= s.nextInt();
        String[] pattern1=new String[size1];
        System.out.println("Enter the elements");
        for(int i=0;i<size1;i++)
        {
            pattern1[i] = s.next();
            
        }
    System.out.println("Enter the size 2nd necklace");
        int size2= s.nextInt();
        String[] pattern2=new String[size2];
        System.out.println("Enter the elements");
        for(int i=0;i<size2;i++)
        {
            pattern2[i] = s.next();
            //System.out.println("Elements:"+pattern[i]);
        }
     
        for(int i=0;i<size1;i++)
        {
            if(i%2!=0)
            {
                j=Integer.parseInt(pattern1[i]);
                while(j!=0)
                {
                    str1 =str1+pattern1[i-1];
                    j--;
                }
            }
        }
        for(int i=0;i<size2;i++)
        {
            if(i%2!=0)
            {
                j=Integer.parseInt(pattern2[i]);
                while(j!=0)
                {
                    str2 =str2+pattern2[i-1];
                    j--;
                }
            }
        }
    
    if(str1.length()==str2.length())
    {
        if((str1.substring(str1.length()-3,str1.length())).equals(str2.substring(0,3)))
        {
            System.out.println("True");
        }
    }
    else
    {
        System.out.println("False");
        
    }
    }
    
}
