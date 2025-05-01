 import java.util.Scanner;
 public class TokenRing {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of nodes you want in the Ring : ");
        int n = sc.nextInt();
        //Decides the number of nodes forming the ring

       System.out.println("Ring Formed Is As Below: ");
       
        for (int i = 0; i < n; i++){
            System.out.print(i+" ");
           }
        System.out.println("0");
        
        int choice=0;

             do {
                System.out.print("Enter sender: ");
                int s = sc.nextInt();
 
                System.out.print("Enter receiver: ");
                int r = sc.nextInt();
               
                System.out.print("Enter Data to send: ");
                String d = sc.next();

                int token = 0;
                System.out.print("Token passing: ");
                 
                for (int i = token;i<s;i++) {
                System.out.print(" " + i + "->");
                }
                System.out.println(" " + s);
                System.out.println("Sender " + s + " sending data: " + d);
                
                for (int i =s;i!=r;i=(i+1)%n) {
                System.out.println("Data " + d + " forwarded by " + i);
                }
                System.out.println("Receiver " + r + " received data: " + d);
                token = s;
                
                System.out.println("Do you want to send data again? if Yes Enter 1, if No Enter 0 ");
                choice=sc.nextInt();
          
               } while(choice == 1);
        }
        }
    
 