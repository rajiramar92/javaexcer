package sample.org;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class B {
	

	public static void main(String arg[])
	{

		
		for(int i=0;i<14;i++)
		{
         int count=0;
		for(int j=2;i>j;j++)
		{

		if(i%j==0) 
		{
		 count++;
		   break;

		}

		}
		if(count==0)
		{

		System.out.println(i);

		}
		}
	}
}