/**
 * @author David Manouchehri
 *         Created on 8/6/15 at 7:22 PM.
 *         All content is under the MIT License unless otherwise specified.
 *         See LICENSE.txt for details.
 */
public class VotingMachineTester {
    public static void main(String[] args) {
        VotingMachine tester = new VotingMachine();
        tester.voteDemo();
        tester.voteRepub();
        tester.tally();
        tester.clearVotes();
        tester.tally();
    }
}
