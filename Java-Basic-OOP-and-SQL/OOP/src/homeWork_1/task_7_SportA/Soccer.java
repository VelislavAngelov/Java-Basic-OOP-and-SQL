package homeWork_1.task_7_SportA;

public class Soccer extends Sport {

    @Override
    public String getName() {
        return "Soccer";
    }

    @Override
    public String getNumberOfTeamMembers() {
        return "Each team has 11 players in " + getName();
    }
}
