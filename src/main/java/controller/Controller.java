package controller;

import java.util.ArrayList;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {

	
	public static int exp(int base,int power)
	{
		int mul=1;
		while(power!=0)
		{
			mul=mul*base;
			power--;
		}
		return mul;
	}
	
	
	
	public static int happy(int n)
	{
		int sum=0;
		if(n<10)
		{
			return n*n;
		}
		else
		{
			while(n!=0)
			{
				int rem=n%10;
				sum=sum+(rem*rem);
				n=n/10;
			}
			return sum;
		}
	}
	
	
	
	@RequestMapping("/home")
	public String home()
	{
		return "home";
	}
	
	@RequestMapping("/getnum")
	public String getnum(@RequestParam("num") int n,Model m)
	{
//		System.out.println(n);
		
		//pos neg natural and whole
				if(n>0)
				{
					System.out.println("its a positive number");
					m.addAttribute("positive", "IT'S A POSITIVE NUMBER");
					
					System.out.println("its a natural number");
					m.addAttribute("natural", "IT'S A NATURAL NUMBER");

					System.out.println("its a integer");
					m.addAttribute("integer", "IT'S AN INTEGER");

					System.out.println("its a whole number");
					m.addAttribute("whole", "IT'S A WHOLE NUMBER");

				}
				else if(n==0)
				{
					System.out.println("its a whole number");
					m.addAttribute("whole", "IT'S A WHOLE NUMBER");

					System.out.println("its a integer");
					m.addAttribute("integer", "IT'S AN INTEGER");


				}
				else
				{
					System.out.println("its a integer");
					m.addAttribute("integer", "IT'S AN INTEGER");

					System.out.println("its a negative number");
					m.addAttribute("negative", "IT'S A NEGATIVE NUMBER");

				}
				
				
				//odd even 
				if(n%2==0)
				{
					System.out.println("its a even number");
					m.addAttribute("even", "IT'S AN EVEN NUMBER");

				}
				else
				{
					System.out.println("its a odd number");
					m.addAttribute("odd", "IT'S AN ODD NUMBER");

				}
				
				
				
				//prime or not
				 if(n==1)
				{
					System.out.println("Not prime number");
					m.addAttribute("prime", "IT'S NOT A PRIME NUMBER");


				}
				else if(n==2)
				{
					System.out.println("Its a prime number");
					m.addAttribute("prime", "IT'S A PRIME NUMBER");

				}
				else if(n>2) {
				
					boolean f=true;
					for(int i=2;i<=n/2+1;i++)
					{
						if(n%i==0)
						{
							f=false;
							break;
						}
					}
					if(f)
					{
						System.out.println("IT'S A PRIME NUMBER");
						m.addAttribute("prime", "IT'S A PRIME NUMBER");

					}
					else
					{
						System.out.println("Not prime number");
						m.addAttribute("prime", "IT'S NOT A PRIME NUMBER");


					}
				
				
				}
				
				
				
				//composite number
				
				boolean f1=false;
				for(int i=2;i<n;i++)
				{
					if(n%i==0)
					{
						f1=true;
						break;
					}
				}
				if(f1)
				{
				System.out.println("its a composite number");
				m.addAttribute("composite", "IT'S A COMPOSITE NUMBER");

				}
				else
				{
					System.out.println("not a composite number");
					m.addAttribute("composite", "IT'S NOT A COMPOSITE NUMBER");

				}
				
				
				//perfect number
				int sum=0;
				for(int i=1;i<n;i++)
				{
					if(n%i==0)
					{
						sum=sum+i;
					}
				}
				if(sum==n)
				{
					System.out.println("its a perfect number");
					m.addAttribute("perfect", "IT'S A PERFECT NUMBER");

				}
				else
				{
					System.out.println("not a perfect number");
					m.addAttribute("perfect", "IT'S NOT A PERFECT NUMBER");

				}
				
				//square number
				
				for(int i=1;i<n;i++)
				{
					if(i*i<=n)
					{
						if(i*i==n)
						{
							System.out.println(n+" is a square number coz divisible by "+i);
							m.addAttribute("square", n+" IS A SQUARE NUMBER, ITS MULTIPLES ARE "+i+"*"+i);

							break;
						}
					}
					else
					{
						System.out.println("not a square number");
						m.addAttribute("square", "IT'S NOT A SQUARE NUMBER");

						break;
					}	
				}
				
				
				
				for(int i=1;i<n;i++)
				{
					if(i*i*i<=n)
					{
						if(i*i*i==n)
						{
							System.out.println(n+" is a cube number coz divisible by "+i);
							m.addAttribute("cube", n+" IS A CUBE NUMBER, ITS MULTIPLES ARE "+i+"*"+i+"*"+i);

							break;
						}
					}
					else
					{
						System.out.println("not a cube number");
						m.addAttribute("cube", "IT'S NOT A CUBE NUMBER");
						break;
					}
				}
				
				
				//armstrong
				int ns=n;
				int nn=n;
				int power=0;
				while(ns!=0)
				{
					ns=ns/10;
					power++;
				}
				int summ=0;
				   
				while(nn!=0)
				{
					int rem=nn%10;
					summ=summ+exp(rem, power);
					nn=nn/10;
				}
				if(summ==n)
				{
				System.out.println(summ+" is a Armstrong num");
				m.addAttribute("armstrong","IT IS AN ARMSTRONG NUMBER");

				}
				else
				{
					System.out.println(n+" is not a Armstrong num");
					m.addAttribute("armstrong","IT'S NOT AN ARMSTRONG NUMBER");


				}
			
				
				//factoros
				ArrayList a=new ArrayList<>();
				for(int i=1;i<n;i++)
				{
					if(n%i==0)
					{
						a.add(i);
					}
				}
				if(a.isEmpty())
				{
				
				}
				else
				{
					System.out.println(a+" are factors of "+n);
					m.addAttribute("factors", "FACTORS OF "+n+" ARE --> "+a );
				}
				
				
				//to check palindrome
				if(n>9&&n!=10&&n!=100&&n!=1000&&n!=10000&&n!=100000){
				int pd=n;
				int r=0;
				while(pd>0)
				{
					int rem=pd%10;
					r=(r*10)+rem;
					pd=pd/10;
				}
				if(r==n)
				{
				System.out.println(n+" is a palindrome");
				m.addAttribute("palindrome", "IT'S A PALINDROME");
				}
				else
				{
					System.out.println(n+" is not a palindrome");
					m.addAttribute("palindrome","IT'S NOT A PALINDROME");

				}
				}
				
				//happy number
				int n1=n;
				ArrayList<Integer> h=new ArrayList<>();
				boolean flag=false;
			int ct=0;

				while(true)
				{
					if(n1==1)
					{
						System.out.println(n1+" is happy number");
						m.addAttribute("happy","IT'S A HAPPY NUMBER");

						break;
					}
					int rs=happy(n1);
					h.add(rs);
					//System.out.println(rs);
					if(rs==1)
					{
						System.out.println(n+" is a happy");
						m.addAttribute("happy","IT'S A HAPPY NUMBER");

						break;
					}
					else
					{
						n1=rs;
					}
					ct++;
					if(ct>50)
					{
						for(Integer i: h)
						{
							for(Integer j: h)
							{
								if(i==j)
								{
								flag=true;
								break;
								}
							}
						}
					}
					if(flag)
					{
						System.out.println(n+" is not a happy number");
						m.addAttribute("happy","ITS NOT A HAPPY NUMBER");

						break;
					}
					
				}
				
		
		
		
		
		
		m.addAttribute("n",n);
		return "showwhy";
	}
}
