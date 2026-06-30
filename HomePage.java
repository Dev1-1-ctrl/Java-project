import java.io.*;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class HomePage {
    public HomePage() {
    }
    // adding a method to show notification in the file
    private String displayNotification(String file) {
        return null;
    }

    //this method will read the data from file
    private String originalData() {
        String getTheAnswer = "";

        try {
            // showing the file path of the file
            File myObj;
            myObj = new File("C:\\Users\\devna\\Java Project\\src\\originalData.txt");

            Scanner readMyData;
            String data;

            //this will read the data according to the result
            for (readMyData = new Scanner(myObj); readMyData.hasNextLine(); getTheAnswer = getTheAnswer + "The data:" + data + "/n") {
                data = readMyData.nextLine();
            }
            //find if there is any error
            readMyData.close();
        } catch (FileNotFoundException var5) {
            System.out.println("Something is not Right. Error found ........");
            var5.printStackTrace();
        }

        return getTheAnswer;
    }

    //this method will read the data from the file
    private String showData() {
        String getTheAnswer = "";

        try {
            // showing the file path of the file
            File myObj = new File("C:\\Users\\devna\\Java Project\\src\\ShowData.txt");

            Scanner readMyData;
            String data;

            //this will read the data according to the result
            for(readMyData = new Scanner(myObj); readMyData.hasNextLine(); getTheAnswer = getTheAnswer + "The data:" + data + "/n") {
                data = readMyData.nextLine();
            }
            //find if there is any error
            readMyData.close();
        } catch (FileNotFoundException var5) {
            System.out.println("Something is not Right. Error found ........");
            var5.printStackTrace();
        }

        return getTheAnswer;
    }

    //this method will create a new file
    private void makeAiData() {
        try {
            // showing the file path of the file
            File myFile = new File("C:\\Users\\devna\\Java Project\\src\\New Data.txt");
            if (myFile.createNewFile()) {
                System.out.println("Data has been created :" + myFile.getName());
                String file = myFile.getName();
                this.displayNotification(file);
            } else {
                System.out.println("I'm sorry file name already exist. ");
            }
            //find if there is any error
        } catch (IOException var3) {
            System.out.println("Some issue has occurred .PleaseTry again");
            var3.printStackTrace();
        }

    }
    //this method will delete the data that you have created
    private void deleteTheData() {

        // showing the file path of the file
        File myFile = new File("C:\\Users\\devna\\Java Project\\src\\New Data.txt");
        if (myFile.delete()) {
            System.out.println("This Data has been Deleted:" + myFile.getName());
        } else {
            System.out.println("Data is not created.First create the data");
        }

    }
    //this method will show whether data is created data
    private void Messages() {
        // showing the file path of the file
        File myFile = new File("C:\\Users\\devna\\Java Project\\src\\New Data.txt");
        if (myFile.exists()) {
            System.out.println("Data has been created.");
        } else {
            System.out.println("Data has not been created.");
        }

    }
   //this method will show whether data has deleted or not
    private void threat() {
        // showing the file path of the file
        File myFile = new File("C:\\Users\\devna\\Java Project\\src\\New Data.txt");
        if (!myFile.exists()) {
            System.out.println("The Data you Created has been deleted or You haven't create a data. ");
        } else {
            System.out.println("The data is still in the system.");
        }

    }
//this method will compare the data, showData and original data
    private void Warning() throws InterruptedException {
        String s1 = this.showData();
        String s2 = this.originalData();
        if (s1.equals(s2)) {
            System.out.println("Checking for errors............");
            Thread.sleep(1000L);
            System.out.println("Loading.....");
            Thread.sleep(1000L);
            System.out.println("No errors has been found.");
        } else {
            System.out.println("Checking for errors............");
            Thread.sleep(1000L);
            System.out.println("Loading.....");
            Thread.sleep(1000L);
            System.out.println("Error has been found. Somebody has been changed the data.");
        }

    }





//this method is to run the home page in various method

    public void runHomePage() throws InterruptedException {
        //this variable is used in message
        String smileyFace = "\ud83e\udd16";
        //read the user input
        Scanner sc = new Scanner(System.in);
        //adding loop to the process
        while(true) {
            //showing the menu option
            String[] homePage = new String[]{"1. Dashboard", "2. Alert Page", "3. Report ", "4. System Administration & Database overview  ","5. Analysis ", "6. Logout"};
            System.out.println("                            ");
            System.out.println("         Hi admin " + smileyFace + "I will Guide you to the  Home Page.                                                     ");
            System.out.println("                            ");
            System.out.println("         This is the Home Page.The home page consist of Dashboard,Alert Page,Report,System Administration  .         ");
            System.out.println("                            ");
            //copying homepage array to dev
            String[] dev = homePage;
            // showing the total length of the home page
            int selectingThedashboard = homePage.length;

//declaring the variable to choose alert
            int selectingTheAlert;
            //looping every thing in home page
            for(selectingTheAlert = 0; selectingTheAlert < selectingThedashboard; ++selectingTheAlert) {
                //going back from the option
                String option = dev[selectingTheAlert];
                //printing the option
                System.out.println(option);
            }
//prompt the user the selecting an option
            System.out.println("Hey Admin" + smileyFace + "Please choose the path you'd like to explore:");
            int selectMenu = sc.nextInt();
            //using switch to select the option
            switch (selectMenu) {
                case 1:
                    System.out.println("Hi admin " + smileyFace + "This is the dashboard.Select an option:-");
                    System.out.println("1. Show Data");
                    System.out.println("2. Make a Data Build by AI");
                    System.out.println("3. Delete the data you have created ");
                    System.out.println("4. Back");
                    selectingThedashboard = sc.nextInt();
                    switch (selectingThedashboard) {
                        case 1:
                            //comparing the string  of files
                            String s2 = this.showData();
                            System.out.println(s2);
                            //when you choose enter will go back to the menu
                            System.out.println("Press Enter key to continue...");
                            try {
                                System.in.read();
                            } catch (Exception var18) {
                            }
                            continue;
                        case 2:
                            //the method is defined on the top
                            this.makeAiData();
                            //when you choose enter will go back to the menu
                            System.out.println("Press Enter key to continue...");

                            try {
                                System.in.read();
                            } catch (Exception var17) {
                            }
                            continue;
                        case 3:
                            //the method is defined on the top
                            this.deleteTheData();
                            //when you choose enter will go back to the menuv
                            System.out.println("Press Enter key to continue...");

                            try {
                                System.in.read();
                            } catch (Exception var16) {
                            }
                        case 4:
                            //it will go back to the main menu
                            continue;
                        default:
                            //if choose wrong option
                            System.out.println("Wrong choice. Please enter a enter the correct option.");
                            return;
                    }
                case 2:
                    System.out.println("Hi admin !" + smileyFace + "This is the Alert Page.Select an option");
                    System.out.println("");
                    System.out.println("1. Warning ");
                    System.out.println("");
                    System.out.println("Hi Admin" + smileyFace + "In warning you can see if anybody changes the Data . ");
                    System.out.println("");
                    System.out.println("2. Messages");
                    System.out.println("");
                    System.out.println("Hi Admin" + smileyFace + "In messages you can see whether you have created the data or not. ");
                    System.out.println("");
                    System.out.println("3. Threat");
                    System.out.println("");
                    System.out.println("Hi Admin" + smileyFace + "In Threat you can see if anybody deleted your created Data.");
                    System.out.println("");
                    System.out.println("4. Back");
                    selectingTheAlert = sc.nextInt();
                    switch (selectingTheAlert) {
                        case 1:
                            //the method is defined on the top
                            this.Warning();
                            //when you choose enter will go back to the menu
                            System.out.println("Press Enter key to continue...");

                            try {
                                System.in.read();
                            } catch (Exception var15) {
                            }
                            continue;
                        case 2:
                            //the method is defined on the top
                            this.Messages();
                            //when you choose enter will go back to the menu
                            System.out.println("Press Enter key to continue...");

                            try {
                                System.in.read();
                            } catch (Exception var14) {
                            }
                            continue;
                        case 3:
                            //the method is defined on the top
                            this.threat();
                            //when you choose enter will go back to the menu
                            System.out.println("Press Enter key to continue...");

                            try {
                                System.in.read();
                            } catch (Exception var13) {
                            }
                        case 4:
                            //it will go back to the main menu
                            continue;
                        default:
                            //if choose wrong option
                            System.out.println("Wrong Option . Please select a correct option.");
                            return;
                    }
                case 3:
                    System.out.println("Hi admin !" + smileyFace + "This is the Report.Select an option");
                    System.out.println("1. Health ");
                    System.out.println("2. Feedback ");
                    System.out.println("3. The Time and date in which data has been Created");
                    System.out.println("4. Back");
                    int selectingTheReport = sc.nextInt();
                    ReportPage reportPage = new ReportPage();
                    switch (selectingTheReport) {
                        case 1:
                            //the method is defined on the top
                            reportPage.Health();
                            System.out.println("Press Enter key to continue...");
                            //when you choose enter will go back to the menu
                            try {
                                System.in.read();
                            } catch (Exception var12) {
                            }
                            continue;
                        case 2:
                            //the method is defined on the top
                            reportPage.feedback();
                            System.out.println("Press Enter key to continue...");
                            //when you choose enter will go back to the menu
                            try {
                                System.in.read();
                            } catch (Exception var11) {
                            }
                            continue;
                        case 3:
                            //the method is defined on the top
                            reportPage.timeAndDate();
                            System.out.println("Press Enter key to continue...");
                            //when you choose enter will go back to the menu
                            try {
                                System.in.read();
                            } catch (Exception var10) {
                            }
                        case 4:
                            //it will go back to the main menu
                            continue;
                        default:
                            //if choose wrong option
                            System.out.println("Wrong Option . Please select a correct option");
                    }
                case 4:
                    System.out.println("Hi admin !" + smileyFace + " System Administration  .");
                    System.out.println("");
                    System.out.println(" _____________________________________________________");
                    System.out.println("|  Admin Name           :-     Dev                    |");
                    System.out.println("|_____________________________________________________|");
                    System.out.println("|  Admin Email Address  :-     Devluttux@gmail.com    |");
                    System.out.println("|_____________________________________________________|");
                    System.out.println("|  Device Name          :-     Pentagon               |");
                    System.out.println("|_____________________________________________________|");
                    System.out.println("|  Version              :-     12.5 Meta              |");
                    System.out.println("|_____________________________________________________|");
                    System.out.println("|  IP Address           :-     192.32.19.0            |");
                    System.out.println("|_____________________________________________________|");
                    System.out.println("|  Build Number        :-      f2.1e.3w.6a.4x.9g      |");
                    System.out.println("|_____________________________________________________|");
                    System.out.println("|  Created Date        :-      17/05/2004             |");
                    System.out.println("|_____________________________________________________|");
                    //when you choose enter will go back to the menu
                    System.out.println("Press Enter key to continue...");

                    try {
                        System.in.read();
                    } catch (Exception var9) {
                    }
                    break;
                case 5:
                    //showing the menu
                    System.out.println("Hi admin !" + smileyFace + "This is the Analysis.Select an option");
                    System.out.println("1. Comparison Analysis ");
                    System.out.println("2. Graph Analysis");
                    System.out.println("3. Data Analysis ");
                    System.out.println("4. Back");
                    int selectingTheAnalysis = sc.nextInt();
                    switch (selectingTheAnalysis) {


                        case 1:
                            //shows the user
                            System.out.println("Performing Comparison Analysis.....");
                            System.out.println("Loading....");
                            Thread.sleep(1000L);
                            System.out.println("100%");
                            System.out.println("Comparison Analysis successfully Done . ");
                            System.out.println("Press Enter key to continue...");
                            //when you choose enter will go back to the menu
                            try {
                                System.in.read();
                            } catch (Exception var12) {
                            }
                            continue;
                        case 2:
                            //shows the user
                            System.out.println("Performing Graph Analysis");
                            System.out.println("Loading....");
                            Thread.sleep(1000L);
                            System.out.println("100%");
                            System.out.println("Press Enter key to continue...");
                            //when you choose enter will go back to the menu
                            try {
                                System.in.read();
                            } catch (Exception var11) {
                            }
                            continue;
                        case 3:
                            //shows the user
                            System.out.println("Performing Data Analysis successfully Done . ");
                            System.out.println("Loading....");
                            Thread.sleep(1000L);
                            System.out.println("100%");
                            System.out.println("Comparison Analysis successfully Done . ");

                            System.out.println("Press Enter key to continue...");
                            //when you choose enter will go back to the menu
                            try {
                                System.in.read();
                            } catch (Exception var10) {
                            }
                        case 4:
                            //it will go back to the main menu
                            continue;
                        default:
                            //if choose wrong option
                            System.out.println("Wrong Option . Please select a correct option");
                    }
// stops
                    break;
                case 6:
                    //if user choose 6 it will log out
                    System.out.println("Bye admin See you again" + smileyFace);
                    System.out.println("Logging out!");
                    //ending the program
                    return;
                default:
                    //if choose wrong option
                    System.out.println("Wrong Option . Please select a correct option ");
                    return;
            }
        }
    }







    //show the capabilities of home page
    public static void main(String[] args) throws InterruptedException {
        //running the home page
        HomePage homePage = new HomePage();
        homePage.runHomePage();
// Make a report class instance
        ReportPage reportPage = new ReportPage();
        reportPage.runReportPage();
    }
}

