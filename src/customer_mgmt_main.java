

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class customer_mgmt_main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<Customer>();
        Scanner sc = new Scanner(System.in);

        System.out.print("=====Customer Management System======\n1) Add Customer\n2) Update Customer\n3) Display All\n4) Exit");

        int result = 1;
        while (result == 1) {
            System.out.print("\nSelect option: ");
            int UserInput = sc.nextInt();
            String dump=sc.nextLine();
            Customer customer1 = new Customer();
            result = switch (UserInput) {
                case 1: {


                    System.out.println("Enter Customer ID : ");
                    String customerID = sc.nextLine();
                    customer1.setCustomerID(customer1.toString());
                    System.out.println("Enter Customer Name : ");
                    String name = sc.nextLine();
                    customer1.setName(name);
                    System.out.println("Enter Customer Email : ");
                    String email = sc.nextLine();
                    customer1.setEmail(email);
                    System.out.println("Enter Customer Phone Number : ");
                    String phoneNumber = sc.nextLine();
                    customer1.setPhoneNumber(phoneNumber);


                    yield 1;
                }

                case 2: {
                    System.out.println("Enter Customer ID : ");
                    String tempID=sc.next();



                    yield 1;


                }
                case 3: {
                    System.out.println("Customer List");
                    for (Customer c : customers) {
                        System.out.println("Customer ID" + c.getCustomerID() + "Name:" + c.getName()+ "\nemail" + c.getEmail() + "\nPhone number" + c.getPhoneNumber());
                    }
                    yield 1;
                }
                case 4: {
                    System.out.println("Exit");
                    yield 4;
                }

                default: {
                    System.out.println("Invalid Input");
                    yield 1;
                }


            };
        }
    }


}
