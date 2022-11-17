package task_7_JavaBeansAndPojo.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

       // List<Company> companyList =new ArrayList<>();
        Company company = new Company();
        company.setId(1);
        company.setName("MyCompany");
        company.setAddress("Street 15");
        company.setActivity("MyBusiness");
       // companyList.add(company);


        List<Office> officeList= new ArrayList<>();

        Office office =new Office();
        company.setOffice(officeList);
        office.setName("My office");
        office.setFloor(1);
        office.setCapacity(20);
        office.setOfficeNumber(15);

        Office office1 =new Office();
        company.setOffice(officeList);
        office1.setName("ThisOffice");
        office1.setFloor(2);
        office1.setCapacity(2);
        office1.setOfficeNumber(5);

        officeList.add(office1);
        officeList.add(office);

        List<Employees> employeesList = new ArrayList<>();
        Employees employee = new Employees();

        employee.setFirstName("Ivan");
        employee.setLastName("Ivanov");
        employee.setAge(25);
        employee.setPosition("employee");
        employee.setSalary(500);
        employee.setInternship(5);

        Employees employee1 = new Employees();
        employee1.setFirstName("Petar");
        employee1.setLastName("Petrov");
        employee1.setAge(35);
        employee1.setPosition("Team leader");
        employee1.setInternship(8);
        employee1.setSalary(400);

        List<Cars> carsList= new ArrayList<>();
        List<Cars> carsList1= new ArrayList<>();
        Cars car = new Cars("WV","Polo","CA1212AC");
        Cars car1 = new Cars("Fiat","Tipo","CA2121AC");
        carsList.add(car);
        carsList1.add(car1);
        employee.setCars(carsList);
        employee1.setCars(carsList1);


        employeesList.add(employee);
        employeesList.add(employee1);

        office.setEmployees(employeesList);
        office1.setEmployees(employeesList);




        System.out.printf("The company name: %s has %d offices%n",company.getName(),company.getOffice().size());
        System.out.println();

        for (int i = 0; i < company.getOffice().size(); i++) {
            System.out.printf("The office: \"%s\" has %d employee.%n",company.getOffice().get(i).getName(),company.getOffice().get(i).getEmployees().size());
            for (int j = 0; j < company.getOffice().get(i).getEmployees().size(); j++) {
                System.out.printf("Employees name: %s %s,%n",company.getOffice().get(i).getEmployees().get(j).getFirstName(),
                        company.getOffice().get(i).getEmployees().get(j).getLastName());
                for (int k = 0; k < company.getOffice().get(i).getEmployees().get(j).getCars().size(); k++) {
                    System.out.printf("whit car №: %s%n",
                            company.getOffice().get(i).getEmployees().get(j).getCars().get(k).getNumber() );

                }
            }
            System.out.println();
        }

        for (Office off:officeList){

            System.out.printf("The office: \"%s\" has %d employee.%n",off.getName(),off.getEmployees().size());

            for (Employees employ:employeesList){

                System.out.printf("Employees name: %s %s,%n",employ.getFirstName(),employ.getLastName());
                for (Cars cars:employ.getCars()){

                    System.out.printf("whit car №: %s%n",cars.getNumber());
                }
            }
            System.out.println();
        }

       // System.out.println(company);
       // car.MovedInWork();
       // car1.MovedToHome();

    }
}
