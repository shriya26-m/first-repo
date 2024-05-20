/*
 class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("writting something");

    }
    public void Color(){
        System.out.println(this.color);
    }
}



public class Classes {
    public static void main(String[]args){
        Pen pen1=new Pen();
        pen1.color="blue";
        pen1.type="gel";
        pen1.write();
        pen1.Color();

        Pen pen2=new Pen();
        pen2.color="black";
        pen2.type="ballpoint";
        pen2.Color();

    }
}
/*  if (operator==1){
            System.out.println("addition:"+add(num1,num2));
        }

        else if (operator == 2) {
            System.out.println("subtraction:"+sub(num1,num2));
            }

        else if(operator==3){
            System.out.println("multiplication:"+mul(num1,num2));
            }

        else if(operator==4){
            System.out.println("division:"+div(num1,num2));
        }

        else{
            System.out.println("out of range");
        }
    }

    public static int add(int num1,int num2){
        int n;
        n=num1+num2;
        return n;
    }

    public static int sub(int num1,int num2){
        int n;
        n=num1-num2;
        return n;
    }

    public static int mul(int num1,int num2){
        int n;
        n=num1*num2;
        return n;
    }

    public static int div(int num1,int num2){
        int n;
        n=num1/num2;
        return n;
    }
*/
import java.util.Scanner;

public class Classes {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hint:choose 1 for addition,choose 2 for subtraction,choose 3 for Multiplication, choose 4 for division");

        System.out.println("Please choose your operator :");



        int operator = scan.nextInt();
        System.out.println("enter first numbers");

        int num1 = scan.nextInt();
        System.out.println("enter second numbers");

        int num2= scan.nextInt();


        add(num1, num2, operator);
    }
    public static int add(int num1,int num2, int operator){
        if (operator==1){
            System.out.println("addition:"+  (num1+num2));
        }

        else if (operator == 2) {
            System.out.println("subtraction:"+  (num1-num2));
        }

        else if(operator==3){
            System.out.println("multiplication:"+ (num1*num2));
        }

        else if(operator==4){
            System.out.println("division:"+ (num1/num2));
        }

        else{
            System.out.println("out of range");
        }

        return 0;
    }

    // public static int sub(int num1,int num2){
    //     int n;
    //     n=num1-num2;
    //     return n;
    // }

    // public static int mul(int num1,int num2){
    //     int n;
    //     n=num1*num2;
    //     return n;
    // }

    // public static int div(int num1,int num2){
    //     int n;
    //     n=num1/num2;
    //     return n;
    // }

}