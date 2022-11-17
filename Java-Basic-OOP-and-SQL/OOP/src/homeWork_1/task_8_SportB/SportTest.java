package homeWork_1.task_8_SportB;

public class SportTest {
    //Сега в друг пакет копирайте класа Sport и го направете да е Java Bean със следните атрибути name и numberOfTeamMembers.
    //Копирайте и клас Soccer. Направете и него на Java Bean.
    //Направете така, че в Soccer винаги numberOfTeamMembers ще е 11, а името ще е “Soccer”.
    //В SportTest клас създайте обект “soccer” от тип Sport който е инстанция на Soccer
    //Създайте също обект “sport” от тип Sport който е инстанция на класа Sport.
    //Изведете в конзолата soccer.getName(), soccer.getNumberOfTeamMembers(), soccer.getClass(), soccer.getClass().getSuperclass()
    //Изведете в конзолата sport.getName(), sport.getNumberOfTeamMembers(), sport.getClass(), sport.getClass().getSuperclass()
    //Разгледайте и се опитайте да си обясните двата изхода.

    public static void main(String[] args) {

        Sport soccer= new Soccer("GGGGG",5);
        Sport sport =new Sport("Sport",2);

        System.out.println(soccer.getName());
        System.out.println(soccer.getNumberOfTeamMembers());
        System.out.println(soccer.getClass());
        System.out.println(soccer.getClass().getSuperclass());

        System.out.println();

        System.out.println(sport.getName());
        System.out.println(sport.getNumberOfTeamMembers());
        System.out.println(sport.getClass());
        System.out.println(soccer.getClass().getSuperclass());
    }
}
