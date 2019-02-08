import java.util.Scanner;

public class intermediateelizza{


public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    String q;
    String[] user = {"I", "me","my","am"};
    String [] com = {"you","you","your","are"};
    do {
        System.out.println("Good day. What is your problem? Enter your response here or Q to quit:");
        q = sc.nextLine();
        q= q.replace("I","you").replace("me","you").replace("my","your").replace("am","are");
        System.out.println(q);

    }while (!q.equalsIgnoreCase("q"));

        }
    }

