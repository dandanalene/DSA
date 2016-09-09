package linear;
import java.util.Scanner;

public class Linear {

   
    public static void main(String[] args) {
        int b, a, search, array[];
        
        Scanner dan = new Scanner(System.in);
        System.out.print("Enter number: ");
        b = dan.nextInt();
        array =  new int[b];
        
        System.out.println("Enter " + b + " number: ");
        
        for (a=0; a<b; a++)
        array[a] = dan.nextInt();
        
            System.out.println("Enter value you want to find: ");
            search = dan.nextInt();
            
                for(a=0; a<b; a++){
                    if (array[a]==search){
                        System.out.println(search + " is present." );
                        break;
                    }
                }
                    if (a == b){
                        System.out.println(search + " is absent.");
                       
                    }
                }
        
    }

