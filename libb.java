    import java.io.*;
class libb
{
public static void main()throws IOException
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
String ans="";
do
{
System.out.println("------------------------------------------------------------------------------------------------------");
System.out.println("------------ Symbiosis Institute of Computer Studies and Research Library Management System ----------");
System.out.println("------------------------------------------------------------------------------------------------------");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println(" 1 :-   SEE THE BOOK LIST");
System.out.println(" 2 :-   TO RETURN THE BOOK IF YOU ARE A MEMBER");
System.out.println(" 3 :-   TO BE A MEMBER OF THE LIBRARY");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
int op=Integer.parseInt(buf.readLine());
if(op==1)
{
bklst obj1=new bklst();
obj1.lst();
}
 if(op==2)
 {
  library obj2=new library();
  obj2.retbk();
 }
  if(op==3)
  {
  member obj3=new member();
  obj3.memb();
   }
   System.out.println("Do you wish to continue:");
   ans=buf.readLine();
}
while(ans.equalsIgnoreCase("Yes"));
System.out.println("Thank You Visit Again :-)");
  }//method ends
  }//class ends
  
