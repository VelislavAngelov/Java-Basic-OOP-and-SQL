package homeWork_5.PhoneBook;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PhoneBook {

    private Map<Integer, String> data;

    public PhoneBook() {
        this.data = new HashMap<>();
    }

    public Map<Integer, String> getData() {
        return data;
    }

    public void setData(Map<Integer, String> data) {
        this.data = data;
    }

    public void insert(String contact) {

        String name = contact.split("-")[0];
        Integer num = Integer.parseInt(contact.split("-")[1]);
       // data.values().removeIf(number -> Objects.equals(number, num));

        data.put( num,name);
    }

    public void deleteByPhoneNumber(Integer contact) {

        if (data.keySet().remove(contact)) {
            System.out.println("Записът беше успешно изтрит.");
        } else {

            System.out.println("Запис за този номер не беше намерен.");
        }

    }

    public void checkString(String contact) {

        int count = 0;
        for (Map.Entry<Integer, String> datum : data.entrySet()) {

            if (Objects.equals(datum.getValue().split("")[0], contact)) {
                count++;
                System.out.println(count + ". " + datum.getValue() + "-" + datum.getKey());
            }

        }
        if (count == 0) {
            System.out.printf("Няма име с буква %s", contact);
        }

    }
    public boolean isCheckString(String  contact){

        int count = 0;
        for (Map.Entry<Integer, String> datum : data.entrySet()) {

            if (Objects.equals(datum.getValue().split("")[0], contact)) {
                count++;

            }
        }
        return count != 0;
    }

    public boolean checkNumber(String phoneNumber) {

        for (Integer phone : data.keySet()) {

            if (phone.equals(Integer.parseInt(phoneNumber))) {

                return true;
            }
        }
        return false;

    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        for (Map.Entry<Integer,String> datum : data.entrySet()) {

            sb.append(datum.getValue()).append("-").append(datum.getKey()).append("\n");
        }
        return "PhoneBook:\n" + sb;

    }
}
