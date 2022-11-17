package homeWork_5.PhoneBook;

public class PhoneBookFullExcepition extends Exception {

    public PhoneBookFullExcepition () {
        super("Too many records. The limit is 100.");
    }


}
