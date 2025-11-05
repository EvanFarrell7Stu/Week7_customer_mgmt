

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class customer_mgmt_main {
    public static void main(String[] args) {
        List<Customer>customers=new ArrayList<Customer>();
        Scanner sc=new Scanner(System.in);

        System.out.print("=====Customer Management System======\n1) Add Customer\n2) Update Customer\n3) Display All\n4) Exit");
        int UserInput=sc.nextInt();
        int result=1;
        while(result==1){
        Customer customer = new Customer();
        result=switch(UserInput) {
            case 1: {


                System.out.println("Enter Customer ID : ");
                customerID = sc.nextLine();
                System.out.println("Enter Customer Name : ");
                name = sc.nextLine();
                System.out.println("Enter Customer Email : ");
                email = sc.nextLine();
                System.out.println("Enter Customer Phone Number : ");
                phoneNumber = sc.nextLine();
            }

            case 2: {
                System.out.println("Enter Customer ID : ");
                sc.nextLine();
                boolean Index = customers.contains(customer);
                customers.remove();


            }
            case 3: {
                System.out.println("Customer List");
                for (Customer c : customers) {
                    System.out.println("Customer ID" + customerID + "Name:" + name + "\nemail" + email + "\nPhone number" + phoneNumber);
                }
            }
            case 4: {
                System.out.println("Exit");
                yield 4;
            }

        }


    }




}
