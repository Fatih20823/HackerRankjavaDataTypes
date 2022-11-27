package com.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                double b = (double) Math.pow(2,15);
                double c = (double) Math.pow(2,31);
                double d = (double) Math.pow(2,63);
                if(x>=-b && x<=(b-1)) System.out.println("* short");                
                if(x>=-c && x<=(c-1)) System.out.println("* int");
                if(x>=-d && x<=(d-1)) System.out.println("* long");
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }

	}

}
