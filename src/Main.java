import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    static void patt(String gmail){
        Pattern pattern = Pattern.compile("\\w{4,}@\\w+.\\w{2,4}");
        Matcher matcher = pattern.matcher(gmail);
        boolean matchFound = matcher.matches();
        ArrayList<String>gmails = new ArrayList<String>();
        if (matchFound){
            gmails.add(gmail);
            for(String i:gmails){
                System.out.println("\n" + "Email added "+i);
            }
        }else{
            System.out.println("Email is invalid!");
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter your email");
        String gmail;
        Scanner scanner = new Scanner(System.in);
        gmail = scanner.nextLine();
        patt(gmail);
    }
}