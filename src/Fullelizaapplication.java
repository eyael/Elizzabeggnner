import java.util.Random;
import java.util.Scanner;

public class Fullelizaapplication {
private static int Rand;
private static Random input = new Random();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String q;

        String [] hedges = {"Please tell me more","Many of my patients tell me the same thing","It is getting late, maybe we had better quit"};
        String [] qualifiers= {"Why do you say that","You seem to think that","So, you are concerned that"};

        System.out.println("Good day. What is your problem? Enter your response here or Q to quit:");
        q = sc.nextLine();
        q= q.replace("I","you").replace("me","you").replace("my","your").replace("am","are");
        System.out.println(qualifiers[randgenerator()]+ " " +  q);
        do {
                System.out.println("Enter your response here or Q to quit: ");
                q = sc.nextLine();
                input = new Random();
                Rand= input.nextInt(3);
                System.out.println(hedges[randgenerator()]+ "\n");

                if (!q.equalsIgnoreCase("q")){
                    System.out.println("Enter your response here or Q to quit: ");
                    q = sc.nextLine();
                    q= q.replace("I","you").replace("me","you").replace("my","your").replace("am","are");
                    System.out.println(qualifiers[randgenerator()]+ " " +  q);
                }
        }while (!q.equalsIgnoreCase("q"));

    }
    public static int randgenerator(){
        input = new Random();
        Rand= input.nextInt(3);
        return Rand;
    }
}