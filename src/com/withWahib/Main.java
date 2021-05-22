package com.withWahib;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner v = new Scanner(System.in );
        System.out.print(" Enter n number : ");
        int n = v.nextInt();

        double numbers[] = new double [n];

        System.out.println(" Enter the numbers you want its average : ");
        double sum =0 ;
        for (int i=0 ; i<n; i++ ){
            numbers[i]= v.nextDouble();
            sum+= numbers[i];
        }
        double average = sum/n;
        if(average>=90)
            System.out.println(" Excellent ");
        else if (average>=80 &&average<90)
            System.out.println(" Very good ");
        else if (average<80 && average>=70)
            System.out.println(" Good ");
        else if(average<70 && average>=60)
            System.out.println(" Fair ");
        else if (average<60 && average>=50)
            System.out.println(" Poor you should work hard ");
        else
            System.out.println(" Failed you should work harder ");
        System.out.println(" Your average : "+ average);

    }
}