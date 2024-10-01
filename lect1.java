import java.util.Scanner;

public class lect1 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("enter a number:");
    String value = input.nextLine();
    System.out.println(value);

    //conversion among double>float>long>int>short>byte
        int x= (int) 3.5; //narrowing
        System.out.println(x);
        
}
}
