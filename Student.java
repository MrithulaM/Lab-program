/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;
import java.util.Scanner;


/**
 *
 * @author 21cse092
 */
public class Student {
    int eng;
    int mat;
    int phy;
    int che;
    int pyt;



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student sc=new Student();
                sc.getdata();
                sc.calculate();
    }

    public void getdata() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter studenr marks");
        eng=sc.nextInt();
        mat=sc.nextInt();
        phy=sc.nextInt();
        che=sc.nextInt();
        pyt=sc.nextInt();
        
        
        
    }
    public void calculate(){
        float total;
        float avg;
        char grade;
        total=eng+mat+phy+che+pyt;
        avg=total/5;
        if(avg>=91)
            System.out.println("Grade O");
        else if(avg>=81&&avg<=90)
            System.out.println("Grade A+");
        else if(avg>=71&&avg<=80)
            System.out.println("Grade A");
        else if(avg>=61&&avg<=70)
            System.out.println("Grade B+");
        else if(avg>=50&&avg<=60)
            System.out.println("Grade B");
        else
             System.out.println("RA");
            
        
    }

}
