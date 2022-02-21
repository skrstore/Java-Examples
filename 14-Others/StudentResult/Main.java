import java.util.Scanner;

class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        getChoice();

        input.close();
    }

    public static void getChoice() {
        System.out.println("\nChoose an Option");
        System.out.println("1 - Show Default Result");
        System.out.println("2 - Make a new By Entering the detail");
        System.out.println("3 - Exit");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                showDefault();
                break;
            case 2:
                makeNew();
                break;
            case 3:
                System.out.println("Exitting...");
                return;
            default:
                System.out.println("Out of the Range");
                System.out.println("Exitting...");
        }
    }

    public static void showDefault() {
        System.out.println("/*****    StudentResult Result    *****/");

        StudentData s1 = new StudentData();

        s1.rollNo = 10001;
        s1.name = "Sachin Kumar Rajput";
        s1.marks.Maths = 35;
        s1.marks.HTML = 33;
        s1.marks.DataStructure = 26;
        s1.marks.OperatingSystem = 41;
        s1.getDAta();

        getChoice();
    }

    public static void makeNew() {
        System.out.println("/*****  Making a new Result  *****/");
        StudentData s1 = new StudentData();

        System.out.println("Enter the Rollno of the StudentResult( 10015 )");
        s1.rollNo = input.nextInt();
        System.out.println("Enter the name of the StudentResult ( Sachin )");
        s1.name = input.next();
        System.out.println("Enter the Marks of Maths ( <=50 ) :");
        s1.marks.Maths = input.nextInt();
        System.out.println("Enter the Marks of HTML ( <=50 )");
        s1.marks.HTML = input.nextInt();
        System.out.println("Enter the Marks of DataStructure ( <=50 )");
        s1.marks.DataStructure = input.nextInt();
        System.out.println("Enter the Marks of Operating System ( <=50 )");
        s1.marks.OperatingSystem = input.nextInt();
        System.out.println("Processing...");
        s1.getDAta();

        getChoice();
    }
}

class StudentData {
    int rollNo;
    String name;
    String branch = "CSE";
    Marks marks = new Marks();
    float percentages;
    char grade;
    String remark;
    boolean status;

    public float getPercentage() {
        return ((float) (this.marks.Maths + this.marks.HTML + this.marks.DataStructure + this.marks.OperatingSystem)
                / 4) * 2;
    }

    public char getGrade(float m) {
        if (m < 60) {
            return 'F';
        } else if (m < 70) {
            return 'D';
        } else if (m < 80) {
            return 'C';
        } else if (m < 90) {
            return 'B';
        } else {
            return 'A';
        }
    }

    public String getRemark(char m) {
        switch (m) {
            case 'A':
                return "Excellent";
            case 'B':
                return "Very Good";
            case 'C':
                return "Good";
            default:
                return "Need Improvement";
        }
    }

    public boolean getStatus(char m) {
        if (m == 'A' || m == 'B' || m == 'C' || m == 'D' || m == 'E') {
            return true;
        } else {
            return false;
        }
    }

    public void getDAta() {
        this.percentages = getPercentage();
        this.grade = getGrade(this.percentages);
        this.remark = getRemark(this.grade);
        this.status = getStatus(grade);

        System.out.println("\t-----     STUDENT DETAIL : " + this.rollNo + "     -----");
        System.out.println("\t> ROLL_NO : " + this.rollNo);
        System.out.println("\t> NAME : " + this.name);
        System.out.println("\t> BRANCH : " + this.branch);
        System.out.println("\t> STUDENT MARKS : ");
        System.out.println("\t\t- MATH : " + this.marks.Maths);
        System.out.println("\t\t- HTML : " + this.marks.HTML);
        System.out.println("\t\t- DATA STRUCTURE : " + this.marks.DataStructure);
        System.out.println("\t\t- OPERATING SUSTEM : " + this.marks.OperatingSystem);
        System.out.println("\t> PERCENTAGES : " + this.percentages);
        System.out.println("\t> GRADE : " + this.grade);
        System.out.println("\t> Remark : " + this.remark);
        System.out.println("\t> PROMOTED TO NEXT CLASS : " + this.status);
    }
}

class Marks {
    int Maths;
    int HTML;
    int DataStructure;
    int OperatingSystem;
}