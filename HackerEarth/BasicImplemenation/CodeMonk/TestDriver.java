import java.util.List;
import java.util.ArrayList;

//Bug Abstract Class
abstract class Bug {
    private String bugType;
    private String bugName;
    private List<User> userList;

    Bug(String bugType, String bugName) {
        this.bugType = bugType;
        this.bugName = bugName;
    }

    public String getBugType() {
        return bugType;
    }

    public String getBugName() {
        return bugName;
    }

    abstract String getBugDescription();

    abstract String getBugSeverity();

    public void addUsers(List<User> userList) {
        this.userList = userList;
    }

    public List<User> getUserList() {
        return userList;
    }
}

//DevelopmentBug Class
class DevelopmentBug extends Bug {

    private String bugDescription;
    private String severity;

    DevelopmentBug(String bugType, String bugName, String bugDescription, String severity) {
        super(bugType, bugName);
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

//ProductionBug Class
class ProductionBug extends Bug {

    private String bugDescription;
    private String severity;

    ProductionBug(String bugType, String bugName, String bugDescription, String severity) {
        super(bugType, bugName);
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

//User Class
class User {
    private String userType;

    User(String userType) {
        this.userType = userType;
    }

    public String getUserType() {
        return userType;
    }
}

//BugTrackingSoftware Class
class BugTrackingSoftware {

    private static List<Bug> bugsList;
    private List<User> userList;

    BugTrackingSoftware() {
        bugsList = new ArrayList<>();
        userList = new ArrayList<>();
    }

    public List<Bug> getAllBugs() {
        return bugsList;
    }

    public void addBug(Bug bug) {
        bugsList.add(bug);
    }

    public List<User> getUserList() {
        return userList;
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public void addUsersToBug(List<User> userList) {
        for (Bug bug : bugsList) {
            if (bug.getBugType().equals("DevelopmentBug")) {
                List<User> userList1 = new ArrayList<>();
                for (User user:userList) {
                    if (user.getUserType().equals("Developer")) {
                        userList1.add(user);
                        break;
                    }
                }
                bug.addUsers(userList1);
            } else if (bug.getBugType().equals("ProductionBug")) {
                bug.addUsers(userList);
            }
        }
    }

    public void removeBug(Bug bug) {
        bugsList.remove(bug);
    }

    public int getNoOfBugs() {
        return bugsList.size();
    }

    public List<Bug> getBugsBySeverity(String severity) {
        List<Bug> bugsBySeverityList = new ArrayList<>();
        if (bugsList.size() > 0) {
            System.out.println(severity + " bugs are:");
            for (Bug bug : bugsList) {
                if (bug.getBugSeverity().equals(severity)) {
                    bugsBySeverityList.add(bug);
                }
            }
        }
        return bugsBySeverityList;
    }
}

//Test Class
class TestDriver {

    public static void print(List<Bug> bugList) {
        if (bugList.size() == 0) {
            System.out.println("Currently, there are no bugs");
            return;
        }
        for (Bug bug : bugList) {
            System.out.println(bug.getBugType() + ": " + bug.getBugName() + ", " + bug.getBugDescription() + ", " + bug.getBugSeverity());
            for (User user : bug.getUserList()) {
                System.out.println("Users of this bugs: " + user.getUserType());
            }
            System.out.println("=====================================================================");
        }
    }

    public static void main(String[] args) {
        BugTrackingSoftware bugTrackingSoftware = new BugTrackingSoftware();

        Bug bug1 = new DevelopmentBug("DevelopmentBug", "Syntax Error", "Missing Semicolon", "less-critical");
        Bug bug2 = new ProductionBug("ProductionBug", "NullPointerException", "Accessing length of null value", "critical");
        Bug bug3 = new DevelopmentBug("DevelopmentBug", "Arithmetic Exception", "Divide By Zero", "critical");
        Bug bug4 = new ProductionBug("ProductionBug", "NumberFormat Exception", "Require int Found String", "non-critical");

        //Adding bugs to BugTrackingSoftware
        bugTrackingSoftware.addBug(bug1);
        bugTrackingSoftware.addBug(bug2);
        bugTrackingSoftware.addBug(bug3);
        bugTrackingSoftware.addBug(bug4);

        //add users to user list
        bugTrackingSoftware.addUser(new User("Developer"));
        bugTrackingSoftware.addUser(new User("Client"));

        //get user list
        List<User> userList = bugTrackingSoftware.getUserList();

        //Adding list of users to bugs
        bugTrackingSoftware.addUsersToBug(userList);

        //Get the number of bugs in BugTrackingSoftware
        System.out.println("No of bugs: " + bugTrackingSoftware.getNoOfBugs());
        //Get all the bugs in BugTrackingSoftware
        List<Bug> bugList = bugTrackingSoftware.getAllBugs();
        print(bugList);

        //Removing a bug
        bugTrackingSoftware.removeBug(bug1);
        //Get the number of bugs in BugTrackingSoftware
        System.out.println("No of bugs: " + bugTrackingSoftware.getNoOfBugs());
        //Get all the bugs in BugTrackingSoftware
        List<Bug> bugList1 = bugTrackingSoftware.getAllBugs();
        print(bugList1);

        //Get a bug by severity
        List<Bug> severeBugList = bugTrackingSoftware.getBugsBySeverity("non-critical");
        print(severeBugList);
    }
}