import java.util.*;

public class Thala {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 7 characters word or enter the number 7 to see the magic!!");
        String s = sc.nextLine();
        int a  = s.length();
        if (a == 7 || s.equals("7")) {
        System.out.println("* * * * *");
        System.out.println("    *    ");
        System.out.println("    *    ");
        System.out.println("    *    ");
        System.out.println("    *    ");
System.out.println("");
System.out.println("");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("* * * * *");
        System.out.println("*       *");
        System.out.println("*       *");
System.out.println("");
System.out.println("");
        int size = 5;
        for (int i = 1; i <= size; i++) {
            for (int j = i; j <= size - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                if (k == 1 || k == (i * 2) - 1 || i == (size + 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
System.out.println("");
System.out.println("");    
        System.out.println("*");
        System.out.println("* ");
        System.out.println("*    ");
        System.out.println("*    ");
        System.out.println("* * * * *");
System.out.println("");
System.out.println("");
        for (int i = 1; i <= size; i++) {
            for (int j = i; j <= size - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                if (k == 1 || k == (i * 2) - 1 || i == (size + 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
System.out.println("");
System.out.println("");
        for(int i=0;i<=5;i++){
            for(int j=0;j<=6;j++){
              if((i==0&&j%3!=0) || (i==1&&j%3==0) || i-j==2 || i+j==8){
                System.out.print("*"+" ");
              }
              else{
                System.out.print(" "+" ");
              }
            }
            System.out.println();
          }
        }
        
        else
        {
            System.out.println("Nooooooo! Try again :'(");
        }
}
}
