package epamtask2;
import java.util.*;
public class maincalc {

  public static void main(String args[]) {
	  
       char c='y';
        while(c=='y')
        {
		int num1,num2;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the first operand:");
		num1=s.nextInt();
		System.out.println("Enter the second operand:");
		num2=s.nextInt();
		
		System.out.println("choose the operation add-> + ; \n sub-> - ;\n mul-> * ;\n div-> / ");
		char ch=s.next().charAt(0);
		simplecalc obj=new simplecalc();
		switch(ch)
		{
		case '+' :System.out.print(num1 +"+"+ num2+"="+obj.add(num1,num2));
		          break;
		case '-' :System.out.print(num1 +"-"+ num2+"="+obj.sub(num1,num2));
		          break;
		case '*' :System.out.print(num1 +"*"+ num2+"="+obj.mul(num1,num2));
		          break;
		case '/' :System.out.print(num1 +"/"+ num2+"="+obj.div(num1,num2));
		          break;
		default:System.out.print("Enter a valid operator!!");
		}
		System.out.println("\n");
		System.out.println("do you want to perform another operation [y/n]");
		c=s.next().charAt(0);
        }
		
		
  }

}
