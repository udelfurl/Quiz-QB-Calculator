package main;
import java.util.Scanner;
public class raiting_calculator {
	public static void main(String[] args){
	@SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
	double a,b,c,d,comp,att,td,yds,intc, rating;
	System.out.print("Enter number of Touchdowns for 2014: ");
	td = input.nextDouble();
	System.out.print("Enter number of Attempts for 2014: ");
	att = input.nextDouble();
	System.out.print("Enter number of Yards for 2014: ");
	yds = input.nextDouble();
	System.out.print("Enter number of Completions for 2014: ");
	comp = input.nextDouble();
	System.out.print("Enter number of Interceptions for 2014: ");
	intc = input.nextDouble();
	a=(((comp/att))-.3)*5;
	b=(((yds/att)-3)*.25);
	c=((td/att)*20);
	d=2.375-((intc/att)*25);
	if(a<0){
		a=0;
	}
	if(b<0){
		b=0;
	}
	if(c<0){
		c=0;
	}
	if(d<0){
		d=0;
	}
	if(a>2.375){
		a=2.375;
	}
	
	if(b>2.375){
		b=2.375;
	}
		
	if(c>2.375){
		c=2.375;
	}
		
	if(d>2.375){
		d=2.375;
	}
	
	rating = ((a+b+c+d)/6)*100;
	
	System.out.println("The Quarterback's rating is:"+rating);
	}
}
