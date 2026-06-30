// SID :- 2241524
// Team name :- Pentagon
import java.util.Scanner;

public class LoginPage {
    public static void main(String[] arg) throws InterruptedException {
        Scanner myObj = new Scanner(System.in);

        //To find the login  condition
        boolean loginFailed = true;
       String smileyFace = "\uD83E\uDD16";

        System.out.println("  *-*------------   Welcome to Pentagon Login Page   --------------**  ");

        //Admin password and username
        String[] adminUsername = {"Dev"};
        String adminPassword = ("Dev123");

        //continue repeating until the admin enters to home page
        while (loginFailed) {

            System.out.println("          ");
            System.out.println("Enter the username:");
            String enterTheUsername = myObj.nextLine();


            System.out.println("Enter the password:");
            String enterThePassword = myObj.nextLine();

            //examining the entered password is correct and does it match to admins original password and username
            if (enterTheUsername.equals(adminUsername[0]) && enterThePassword.equals(adminPassword)) {
                System.out.println("           ");
                System.out.println("          Welcome back, admin!.Its me Chat Bot "  +smileyFace       );

                //running the home page
                HomePage homePage = new HomePage();
                homePage.runHomePage();

                //exiting the loop if login failed
                loginFailed = false;


            } else {
                System.out.println("You have entered wrong username or password . Please enter the right password and username ");

            }
        }
    }
}



