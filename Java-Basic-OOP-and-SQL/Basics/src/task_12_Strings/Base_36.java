package task_12_Strings;

public class Base_36 {
    //Говорихме, че има различни бройни системи. Има двоична, осмична, десетична шестнадесетична… и.т.н.
    //
    //Една доста интересна бройна система е 36-тичната. Защо?
    // Защото съдържа всички цифри от 0 до 9, така и всички букви от английската азбука - A до Z.
    //Сега задачата ви е да направите програма, която показва как изглеждат числата в различните бройни системи.
    //
    //Затова трябва да отпечатате числото 0x7DEDEDE1 в:
    //1.Двоичен формат (с представка 0b отпред)
    //2.Осмичен формат (с представка 0 отпред)
    //3.Десетичен формат
    //4.Шестнадесетичен формат (с представка 0x и ако има букви в числото, те да са малки)
    //5. 36-тично, като всички букви са главни.

    public static void main(String[] args) {

        int num = 2112744929;
       // int num = 4324234;

        String bin = Integer.toString(num,2);
        String oct = Integer.toString(num,8);
        String dec = Integer.toString(num,10);
        String hec = Integer.toString(num,16);
        String threeSix = Integer.toString(num,36);

        System.out.printf("0b%s\n",bin);
        System.out.printf("0%s\n",oct);
        System.out.println(dec);
        System.out.printf("0x%s\n",hec);
        System.out.println(threeSix.toUpperCase());

    }
}
