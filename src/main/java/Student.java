public class Student {
    private int number;
    private String fullName;
    private int[] assignmentGrade;
    private int[] assignmentPercentageAllocation;

    Student(int number, String fullName, int[] assignmentGrade, int[] assignmentPercentageAllocation ){
        this.number = number;
        this.fullName = fullName;
        this.assignmentGrade = assignmentGrade;
        this.assignmentPercentageAllocation = assignmentPercentageAllocation;
    }

    private int calculateTotalGrade(int[] assignmentGrade, int[] percentageAllocation){
        double totalGrade = 1.0;
        int counter = 0;
        for (int individualGrade:this.assignmentGrade){
            totalGrade +=  (individualGrade * percentageAllocation[counter]/100);
            counter +=  1;
        }
        return (int)totalGrade;
    }

    private String determineLetterGrade(int gradeMark){
        String letterGrade;
        final int maxMark = 22;
        if ((maxMark - gradeMark) < 5) {
            letterGrade = "A" + (int)((maxMark - gradeMark) + 1);
        } else if ((maxMark - gradeMark) < 7) {
            letterGrade = "B" + (int)((maxMark - gradeMark) -4);
        } else if ((maxMark - gradeMark) < 10) {
            letterGrade = "C" + (int)((maxMark - gradeMark) -7);
        } else {
            letterGrade = "H";
        }
        return letterGrade;
    }

    private String getFirstInitial(){
        return fullName.substring(0,1);
    }

    private String getLastName(){
        return fullName.split(" ")[1];
    }

    private void displayGrade(int totalGrade, String letterGrade){
        System.out.println(totalGrade);
        System.out.println( getFirstInitial()+ " " + getLastName() + " got " + letterGrade);
    }
    public void calcaulateGrade(){


        int gradeTotal = calculateTotalGrade(assignmentGrade,assignmentPercentageAllocation);
        String letterGrade = determineLetterGrade(gradeTotal);
        displayGrade(gradeTotal, letterGrade);

    }

    public static void main(String[] arg){
        int[] assigmentGrade = {15,19,18};
        int[] percentageAllocation = {25,25,50};
        Student student = new Student(20012, "Derek Somerville",assigmentGrade,percentageAllocation );
        student.calcaulateGrade();
    }
}