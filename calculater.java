import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student grade calculator");
        System.out.println("enter no. of subjects");
        int nS=scanner.nextInt();
        int total=0;
        for(int i=0;i<nS;i++)
        {
            System.out.println("enter marks obtained in "+(i+1)+"i ");
            int marks=scanner.nextInt();
            total+=marks;
        }
        double averm=(double)total/nS;
        char  letterGrade;
        if (averm >= 90) {
           letterGrade = 'A';
        } else if (averm >= 80) {
           letterGrade = 'B';
        } else if (averm>= 70) {
           letterGrade = 'C';
        } else if (averm >= 60) {
           letterGrade = 'D';
        } else {
           letterGrade = 'F';
        }
        System.out.println("Your average is: " + averm);
    System.out.println("Your letter grade is: " +letterGrade);

        scanner.close();
    }
}