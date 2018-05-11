import java.util.List;
import java.util.ArrayList;

abstract class Bugs {
    public String bugType;
    public String bugName;
    List<Users> userTypeList;

    Bugs (String bugType, String bugName, List<Users> userTypeList) {
        this.bugType = bugType;
        this.bugName = bugName;
        this.userTypeList = userTypeList;
    }

    public String getBugType() {
        return bugType;
    }

    public String getBugName() {
        return bugName;
    };

    abstract String getBugDescription();
    abstract String getBugSeverity();

    public List<Users> getUserTypeList() {
        return userTypeList;
    }
}

class DevelopmentBug extends Bugs {

    String bugDescription;
    String severity;

    DevelopmentBug(String bugType, String bugName, String bugDescription, List<Users> usersList, String severity) {
        super(bugType,bugName,usersList);
        this.bugDescription = bugDescription;
        this.severity = severity;
    }

    @Override
    public String getBugDescription() {
        return bugDescription;
    }

    @Override
    public String getBugSeverity() {
        return severity;
    }
}

class ProductionBug extends Bugs {

    String bugDescription;
    String severity;

    ProductionBug(String bugType, String bugName, String bugDescription, List<Users> usersList, String severity) {
        super(bugType,bugName,usersList);
        this.bugDescription = bugDescription;
        this.severity = severity;
    }

    @Override
    public String getBugDescription() {
        return bugDescription;
    }

    @Override
    public String getBugSeverity() {
        return severity;
    }
}

class Users {
    //Name of this class should be User because it signifies on user.
    public String userType;

    Users(String userType) {
        this.userType = userType;
    }

    public String getUserType() {
        return userType;
    }
}

class BugTrackingSoftware {

    static List<Bugs> bugsList;

    public static List<Bugs> getAllBugs() {
        return bugsList;
    }

    public static void addBug(Bugs bug) {
        bugsList.add(bug);
    }

    public static void removeBug(Bugs bug) {
        bugsList.remove(bug);
    }

    public static List<Bugs> getBugsBySeverity(String severity) {
        List<Bugs> bugsBySeverityList = new ArrayList<>();
        if (bugsList.size() > 0) {
            System.out.println(severity + " bugs are:");
            for (Bugs bugs: bugsList) {
                if (bugs.getBugSeverity().equals(severity)) {
                    bugsBySeverityList.add(bugs);
                }
            }
        }
        return bugsBySeverityList;
    }

    public static void printBug(List<Bugs> bugsList) { //Change name to singular again!
        if (bugsList.size() == 0) {
            System.out.println("Currently, there are no bugs");
            return;
        }
        for (Bugs bugs:bugsList) {
            System.out.println(bugs.getBugType() + ": " + bugs.getBugName() + ", " + bugs.getBugDescription() + ", " + bugs.getBugSeverity());
            for (Users users : bugs.getUserTypeList()) {
                System.out.println("Users of this bugs: " + users.getUserType());
            }
            System.out.println("=====================================================================");
        }
    }

    public static void main (String[] args) {
        // Create an unit test class
        // The unit test class should do all these tests in main, because that is what you are doing
        // The main function should instantiate one instance of the BugTrackingSoftware
        // So keep main outside it
        // Thus BugTrackingSoftware becomes modular you can use it anywhere!

        List<Users> developerUsersList = new ArrayList<>();
        //The list of users should be private inside the BugTrackingSoftware object, with apis to work on it

        developerUsersList.add(new Users("Developer"));

        List<Users> productionUsersList = new ArrayList<>();
        productionUsersList.add(new Users("Developer"));
        productionUsersList.add(new Users("Client"));

        //Similarly buglist should be private inside the BugTrackingSoftware with apis to work on it
        bugsList = new ArrayList<>();
        Bugs bug1 = new DevelopmentBug("DevelopmentBug", "Syntax Error", "Missing Semicolon", developerUsersList, "less-critical");
        Bugs bug2 = new ProductionBug("ProductionBug", "NullPointerException", "Accessing length of null value", productionUsersList, "critical");
        Bugs bug3 = new DevelopmentBug("DevelopmentBug", "Arithmetic Exception", "Divide By Zero", developerUsersList, "critical");
        Bugs bug4 = new ProductionBug("ProductionBug", "NumberFormat Exception", "Require int Found String", productionUsersList, "non-critical");
        addBug(bug1);
        addBug(bug2);
        addBug(bug3);
        addBug(bug4);

        //Get the size using the api of BugTrackingSoftware. Also don't print, in the unit test use assertions
        //Printing is not for production and unnecessary
        System.out.println("No of bugs: " + bugsList.size());
        printBug(getAllBugs());
        removeBug(bug1);
        System.out.println("No of bugs: " + bugsList.size());
        printBug(getAllBugs());
        printBug(getBugsBySeverity("not-critical"));
    }
}