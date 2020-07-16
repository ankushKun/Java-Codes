 
//WRITE A JAVA PROGRAM TO DISPLAY ALL NUMBERS BETWEEN 1 AND n, WHICH IS DIVISIBLE BY m, ALSO SHOW IF IT IS ODD OR EVEN
//12-06-2020 

import java.util.*;

public class Integ {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();//Input from user
        System.out.println("Enter the value of m");
        int m = sc.nextInt();//Input from user
        
        //Run a loop from 1 to n
        for(int i=1;i<=n;i++){
            //Check if the number is divisible by m
            if(i%m==0){
                //If divisible print the number
                System.out.print(i+" : ");//Using print so that the next thing we print will be printed in the same line
                //Check if number is EVEN or ODD
                if(i%2==0){
                    System.out.println("EVEN");
                }else{
                    System.out.println("ODD");
                }
            }
        }
	}
}

