package task_6_AccessControl.phoneBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PhoneBook {

    private List<String> data;

    public PhoneBook() {
        this.data = new ArrayList<>();
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }
    public void setContact(String contact){
        this.data.add(contact);
    }

    public void insert(String contact) {


        for (int i = 0; i < this.data.size(); i++) {

            String num = contact.split("-")[1];
            if (Objects.equals(data.get(i).split("-")[1], num)) {

                data.remove(data.get(i));
            }
        }
        data.add(contact);

    }

    public void deleteByPhoneNumber(String contact) {

        for (int i = 0; i < this.data.size(); i++) {

          //  String num = contact.split("-")[1];
            if (Objects.equals(data.get(i).split("-")[1], contact)) {

                data.remove(data.get(i));
            }
        }

    }
    public  void checkString(String contact) {

        int count=0;
        for (String datum : data) {

            if (Objects.equals(datum.split("")[0], contact)) {
                count++;
                System.out.println(count+". "+ datum);
            }
        }
        if(count==0){
            System.out.printf("Няма име с буква %s",contact);
        }
    }

    public boolean checkNumber(String phoneNumber){

        for (String phone:data){

            if(phone.split("-")[1].equals(phoneNumber)){

                return true;
            }
        }
      return false;

    }
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        for (String datum : data) {

            sb.append(datum).append("\n");
        }

        return "PhoneBook:\n" + sb;
    }
}
