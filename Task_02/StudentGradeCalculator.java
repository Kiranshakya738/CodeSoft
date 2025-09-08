import java.util.*;

public class StudentGradeCalculator {

    // method to calculate Grade based on total avg percent
    public static void Grade(float avgPercent) {
        if (avgPercent >= 90 && avgPercent<=100) {
            System.out.println("Grade O");
        }else if(avgPercent>=80 && avgPercent<90){
            System.out.println("Grade A+");
        }else if(avgPercent>=70 && avgPercent<80){
            System.out.println("Grade A");
        }else if(avgPercent>=60 && avgPercent<70){
            System.out.println("Grade B+");
        }else if(avgPercent>=50 && avgPercent<60){
            System.out.println("Grade B");
        }else if(avgPercent>=40 && avgPercent<50){
            System.out.println("Grade C");
        }else if(avgPercent>=30 && avgPercent<40){
            System.out.println("Grade P");
        }else{
            System.out.println("Grade F");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.println("-- GRADE CALCULATOR --");
        System.out.print("Enter the number of subjects: ");
        int numberofsubjects = sc.nextInt();
        float subjects[] = new float[numberofsubjects];

        // loop to take input marks of each subjects
        System.out.println("Marks obtained (out of 100) in each subject.");
        for(int i=0; i<numberofsubjects; i++){
            System.out.print("Enter the marks of subject "+i+" : ");
            subjects[i] = sc.nextInt();

            // Validate input
            if (subjects[i] < 0 || subjects[i] > 100) {
                System.out.println("Invalid marks! Please enter between 0 and 100.");
                i--; // repeat this subject
                continue;
        }
    }

        float totalMarks = 0,totalAvgPercent;

        // loop to calculate total marks of all subjects
        for(int i=0; i<numberofsubjects; i++){
            totalMarks += subjects[i];
        }

        // calculate total average percentage
        totalAvgPercent = totalMarks/numberofsubjects;

        // show result
        System.out.println("-- RESULT --");
        System.out.println("Total Marks: "+totalMarks);
        System.out.printf("Total Average Percentage: %.2f%n",totalAvgPercent," %"); // %.2f%n it is use to reduce digits afte the decimal point 
        StudentGradeCalculator.Grade(totalAvgPercent); // grade method to call
    }
}
