package task_7_JavaBeansAndPojo.company;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private int id;
    private String name;
    private String address;
    private String activity;
    private List<Office> office;

    public Company() {
    }

    public Company(int id, String name, String address, String activity, List<Office> office) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.activity = activity;
        this.office = office;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id>0){
            this.id = id;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(isNullOrEmpty(name)){
            this.name = name;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if(isNullOrEmpty(address)){
            this.address = address;
        }
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        if (isNullOrEmpty(activity)) {
        this.activity = activity;
        }
    }

    public List<Office> getOffice() {
        return office;
    }

    public void setOffice(List<Office> office) {
        this.office = office;
    }

    public static boolean isNullOrEmpty(String string) {

        return string != null && !string.trim().isEmpty();
    }

    @Override
    public String toString() {
        return "Company: " +'\n' +
                "id: " + id  +'\n' +
                "name: " + name  +'\n' +
                "address: " + address  +'\n' +
                "activity: " + activity +'\n' +
                 office  +'\n';
    }
}
