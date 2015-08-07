/**
 * @author David Manouchehri
 *         Created on 8/6/15 at 7:22 PM.
 *         All content is under the MIT License unless otherwise specified.
 *         See LICENSE.txt for details.
 *
 *         Page 407, Question P8.10
 */
public class VotingMachine {
    private int demoVotes, repubVotes;

    public void clearVotes() {
        this.demoVotes = 0;
        this.repubVotes = 0;
    }
    public void voteDemo() {
        this.demoVotes++;
    }
    public void voteRepub() {
        this.repubVotes++;
    }
    public void tally() {
        System.out.println("Democrat Votes at " + demoVotes +
                ", Republican votes at " + repubVotes);
    }
}
