 
import java.io.*;
public class member
{
public void memb()throws IOException
{
int c=0;
int code[]={2000,2001,2002,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,2015,2016,2017,2018,2019};
BufferedReader buf=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Kindly enter your Library Code");
int coe=Integer.parseInt(buf.readLine());
        for(int i=0;i<code.length;i++)
      {
   if(coe==code[i])
    {
     c++;
    }//coe
     
}
      if(c==0)
   {
    System.out.println("Sorry you are not a Member!!! Do you desire to be a Member?");
   System.out.println("If Yes-y in lower case");
    System.out.println(" If No-n in lower case");
    
    BufferedReader buf1=new BufferedReader (new InputStreamReader(System.in));
    char ch=(char)buf1.read();
    if(ch=='y')
      {
          System.out.println("Kindly enter your Name");
          String name=buf.readLine();
          System.out.println("Your Library Code is 2020 ");
      }//y
      
   if(ch=='n')
      {
          System.out.println("You cannot take a Book");
      }// n
  }//if c
      }//meth member ends
         }// class ends

 











