public class Main8_1 {
    public static void calculateGrade(double test1, double test2) {
        double totalPoints = test1 + test2;
        String grade;
        if (totalPoints >= 90) {
            grade = "A";
        } else if (totalPoints >= 80) {
            grade = "B";
        } else if (totalPoints >= 70) {
            grade = "C";
        } else if (totalPoints >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Final grade: " + grade);
    }
    public static void main(String[] args) {
        calculateGrade(72.5,35.7);
    }
}
