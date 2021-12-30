import java.util.*;
import java.io.*;

public class Main
{
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        int n=input.length();
        String output="";
        for(int i=n/2;i<n;i++) {
            output=output+input.charAt(i);
            int outl=output.length();
            for(int j=0;j<n-outl;j++)
                System.out.print(" ");
            System.out.println(output);
        }
        for(int i=0;i<n/2;i++) {
            output=output+input.charAt(i);
            int outl=output.length();
            for(int j=0;j<n-outl;j++)
                System.out.print(" ");
            System.out.println(output);
        }

}
}