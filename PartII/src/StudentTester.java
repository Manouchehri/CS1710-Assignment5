/**
 * @author David Manouchehri
 *         Created on 8/6/15 at 7:19 PM.
 *         All content is under the MIT License unless otherwise specified.
 *         See LICENSE.txt for details.
 *
 *         Page 407, P8.7
 */
public class StudentTester {
    public static void main(String[] args) {
        Student Tommy = new Student("Tommy");
        System.out.println(Tommy.getName());
        Tommy.addQuiz(85.00);
        Tommy.addQuiz(95.00);
        System.out.println(Tommy.getTotalScore());
        System.out.println(Tommy.getAverageScore());
    }
}
