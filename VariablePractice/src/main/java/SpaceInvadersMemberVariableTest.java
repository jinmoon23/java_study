public class SpaceInvadersMemberVariableTest {
    public static void main(String[] args) {
        SpaceInvadersMemberVariable simv = new SpaceInvadersMemberVariable();

        System.out.println(simv.location);
        simv.moveLeft();
        simv.moveLeft();
        System.out.println(simv.location);
    }
}
