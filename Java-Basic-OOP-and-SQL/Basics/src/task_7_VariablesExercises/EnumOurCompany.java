package task_7_VariablesExercises;

public class EnumOurCompany {
//    Дефинирайте с еnum вашата компания с имена IVAN, STOYAN, PETAR, MILEN, OGNYAN.
//    Създайте променливи и ги отпечатайте със System.out.println()

    enum ourCompany{
        IVAN, STOYAN, PETAR, MILEN, OGNYAN;
    }

    public static void main(String[] args) {

        ourCompany firstName = ourCompany.IVAN;
        ourCompany secondName = ourCompany.STOYAN;
        ourCompany thirdName = ourCompany.PETAR;
        ourCompany fourthName = ourCompany.MILEN;
        ourCompany fifthName = ourCompany.OGNYAN;

        System.out.println(firstName);
        System.out.println(secondName);
        System.out.println(thirdName);
        System.out.println(fourthName);
        System.out.println(fifthName);
    }
}
