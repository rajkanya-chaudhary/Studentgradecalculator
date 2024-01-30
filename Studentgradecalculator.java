import java.util.Scanner;
import java.util.*;;
public class Studentgradecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Subject : ");
        int numSubjects = sc.nextInt();
        int marks[] = new int[numSubjects];
        for(int i = 0;i<numSubjects;i++)
        {
            System.out.println("Enter marks obtained in Subject " + (i + 1) + " : ");
            marks[i] = sc.nextInt();
        }
        int totalMarks = 0;
        for(int mark : marks)
        {
            totalMarks += mark;
        }
        double averagePercentage = (double)totalMarks/numSubjects;
        char grade = calculateGrade(averagePercentage);
         System.out.println("\nResults :");
         System.out.println("Total Marks: " +totalMarks);
         System.out.println("Average Percentage: " + averagePercentage);
         System.out.println("Grade:" + grade);
    }
    private static char calculateGrade(double averagePercentage)
    {
        if(averagePercentage >= 90)
        {
            return 'A';
        }
        else if (averagePercentage >= 80)
        {
            return 'B';
        }
        else if (averagePercentage >= 70) 
        {
            return 'C';
        }
        else if(averagePercentage >= 60)
        {
            return 'D';
        }
        else
        {
            return 'F';
        }

    }

    
}
