package oops;

public class Student extends Person {
    private final int[] testScores;

    public Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }

    public char calculate() {
        int sum = 0;
        int n = testScores.length;
        for (int testScore : testScores) {
            sum = sum + testScore;
        }
        char grade;
        int avg = sum / n;
        if (avg >= 90 && avg <= 100) {
            grade = 'O';
        } else if (avg >= 80 && avg < 90) {
            grade = 'E';
        } else if (avg >= 70 && avg < 80) {
            grade = 'A';
        } else if (avg >= 55 && avg < 70) {
            grade = 'P';
        } else if (avg >= 40 && avg < 55) {
            grade = 'D';
        } else {
            grade = 'T';
        }
        return grade;
    }
}
