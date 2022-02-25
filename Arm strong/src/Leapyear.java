

import java.io.*;
class LeapYear
{
     public static void main(String args[])throws IOException {
	BufferedReader ob = new BufferedReader( new InputStreamReader (System.in));
	int year;
	System.out.println("Enter any year to check if it's a leap year..");
	year=Integer.parseInt(ob.readLine());
	if( (year%4==0)&&(year%400==0) ) {
			System.out.println(year +" is an leap year");
		}
	else if(year%100!=0) {
			System.out.println(year +" is an leap year");
		}
	else {
			System.out.println(year +" is not an leap year");
		}                  
	
	}
}