import java.io.*;
public class library        
{
public void retbk()throws IOException
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Welcome to this Library");
System.out.println("After how many days are you returning the Book");
int days =Integer.parseInt(buf.readLine());
double fine = 0.0;
if(days<=10)
{
fine=days*1;
}
else if(days>=11 && days<=20)
{
fine=10*1+(days-10)*1.50;
}
else if(days>=21)
{
fine=10*1+10*1.50+(days-20)*2.00;
}
System.out.println("You have to pay  a fine of Rs"+fine);
}//method ends
}//class ends




