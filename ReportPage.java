import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class ReportPage {
//this method is to run report
    public void runReportPage(){

    }//the method provide feedback
    void feedback() {
        System.out.println("Please Enter the feedback :-");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println("Thank you for your feedback");
        System.out.println("The feedback: " + userInput);
    }
    //this method shows health
    void Health() {
        System.out.println("..____________________________________________________________..");
        System.out.println("::     Screen Time :- 3hr,5min                                ::");
        System.out.println("::     Storage &  Caches :- 1.30 GB used in Internal Storage  ::");
        System.out.println("::     Permission  Allowed : -  Location                      ::");
        System.out.println("::                              Notification                  ::");
        System.out.println("::                              camera                        ::");
        System.out.println("::                              Microphone                    ::");
        System.out.println("..____________________________________________________________..");
    }
    //this method show time and date
    void timeAndDate() {
        LocalDate myObj = LocalDate.now();
        System.out.println("Date:-" + String.valueOf(myObj));
        LocalTime myDOO = LocalTime.now();
        System.out.println("Time:-" + String.valueOf(myDOO));
    }



    // show the capabilities of report page
    public static void main(String[] args) throws InterruptedException {
        ReportPage  reportPage = new ReportPage();
        reportPage.runReportPage();
    }
}
