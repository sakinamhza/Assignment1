import java.util.Scanner;

public class StudInfoSystem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Stud[] studList = new Stud[5];

        for (int i = 0; i < studList.length; i++) {
            System.out.println("Student " + (i + 1) + " : ");
            System.out.println("Enter the name: ");
            String name = scan.next();
            System.out.println("Enter the matric: ");
            int matric = scan.nextInt();
            System.out.println("Enter your course work: ");
            double courseWork = scan.nextDouble();
            System.out.println("Enter the final exam: ");
            double finalExam = scan.nextDouble();

            studList[i] = new Stud(matric, name, courseWork, finalExam);
            studList[i].calcGrade();

        }

        for (int i = 0; i < studList.length; i++) {
            System.out.println(" \n\n\nStudent  " + (i + 1) + " : ");
            studList[i].displayInfo();

        }

        System.out.println("\n\n\n\n=======================Searching for a student==============================");
        System.out.println("\nEnter the matric number>");
        int matric = scan.nextInt();
        for (int i = 0; i < studList.length; i++) {
            if (studList[i].getMatric() == matric) {
                System.out.println("Student is found!");
                studList[i].displayInfo();

            }
            }
        }
    }


public class Stud {

    private String name;
    private int matric;
    private double courseWork;
    private double finalExam;
    private String grade;
    private boolean mark;



    public Stud(int matric, String name, double courseWork, double finalExam){
       this.name = name;
       this.matric = matric;
       this.courseWork = courseWork;
       this.finalExam = finalExam;


    }

    public void displayInfo(){
        System.out.printf("\n%10s%15s%17s%17s%17s", "Matric" , "Name","Course Work", "Final Exam"," Grade" );
        System.out.printf("\n%10s%15s%17s%17s%17s", matric, name, courseWork, finalExam, grade );

    }

    public String calcGrade (){

        if (mark = courseWork*0.6 + finalExam*0.4 >= 89.45) {
            grade = "A+";
        }
        else if (mark = courseWork*0.6 + finalExam*0.4 >= 79.45) {
            grade = "A";
        }
        else if (mark = courseWork*0.6 + finalExam*0.4>= 74.45) {
            grade = "A-";
        }
        else if (mark = courseWork*0.6 + finalExam*0.4 >= 69.45) {
            grade = "B+";
        }
        else if ( mark = courseWork*0.6 + finalExam*0.4>= 64.45) {
            grade = "B";
        }
        else if (mark = courseWork*0.6 + finalExam*0.4>= 59.45) {
            grade = "B-";
        }
        else if (mark = courseWork*0.6 + finalExam*0.4 >= 54.45) {
            grade = "C+";
        }
        else if (mark = courseWork*0.6 + finalExam*0.4>= 49.45) {
            grade = "C";
        }
        else if (mark = courseWork*0.6 + finalExam*0.4 >= 44.45) {
            grade = "C-";
        }
        else if (mark = courseWork*0.6 + finalExam*0.4 >= 39.45) {
            grade = "D+";
        }
        else if (mark = courseWork*0.6 + finalExam*0.4 >= 34.45) {
            grade = "D";
        }
        else if (mark = courseWork*0.6 + finalExam*0.4 >= 0.01) {
            grade = "Fail";
        }

        return grade;

    }

    public String getName() {return name;}
    public int getMatric() {return matric;}
    public double getcourseWork() {return courseWork;}
    public double getfinalExam() {return finalExam;}
    public String getGrade() {return grade;}
}


