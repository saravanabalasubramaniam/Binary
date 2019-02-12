import java.io.*;
import java.util.*;
class Binary
{
  public static void main(String args[])
  {
	Scanner input=new Scanner(System.in);
	String a=input.nextLine();
	int flag=0;
	for(int i=0;i<a.length();i++)
	{
		if(a.charAt(i)=='1'||a.charAt(i)=='0')
		{
		}
		else
		{
			flag=1;
		}
	}
	if(flag!=1)
	{
		System.out.println("yes");
	}
	else
	{
		System.out.println("no");
	}
   }
}
