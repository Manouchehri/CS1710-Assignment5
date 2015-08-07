/**
 * @author David Manouchehri
 *         Created on 8/6/15 at 7:18 PM.
 *         All content is under the MIT License unless otherwise specified.
 *         See LICENSE.txt for details.
 *
 *         Page 407, P8.7
 */
public class Student {
    private String name;
    private double totalScore = 0;
    private int quizCount = 0;

    public Student(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public double getTotalScore() {
        return totalScore;
    }
    public double getAverageScore() {
        return totalScore / quizCount;
    }

    public void addQuiz(double score) {
        this.quizCount++;
        this.totalScore += score;
    }
}
