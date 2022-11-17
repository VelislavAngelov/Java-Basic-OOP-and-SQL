package homeWork_5.PhoneBook;

public class EntryNotFoundException extends Exception{

    public EntryNotFoundException() {
        super("Запис за този номер не беше намерен.");
    }
}
