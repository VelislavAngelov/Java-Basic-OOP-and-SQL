package homeWork_1.task_8_SportB;

public class Sport {

    private  String name;
    private int numberOfTeamMembers;

    public Sport(String name, int numberOfTeamMembers) {
        this.name = name;
        this.numberOfTeamMembers = numberOfTeamMembers;
    }


    public String getName() {
        return name;
    }

    public int getNumberOfTeamMembers() {
        return numberOfTeamMembers;
    }
}
