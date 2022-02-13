

import java.io.*;
public class Inputdata {

	public static void main(String[] args) throws IOException {
		double a,b,c;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter two numbers");
		a = Double.parseDouble(br.readLine());
	 b = Double.parseDouble(br.readLine());
		c=a+b;
				System.out.println("sum"+c);
		

	}

}
