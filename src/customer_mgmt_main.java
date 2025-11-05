

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class customer_mgmt_main {
    public static void main(String[] args) {
        List<Customer>customers=new ArrayList<Customer>();
        Scanner sc=new Scanner(System.in);

        System.out.print("=====Customer Management System======\n1) Add Customer\n2) Update Customer\n3) Display All\n4) Exit");
        int UserInput=sc.nextInt();

        Customer customer = new Customer();
        void result=switch(UserInput){
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
            boolean Index=customers.contains(customer);
            customers.remove(Index)

            }
            case 3: {

            }
            case 4: {

            }




    }

for(Customer c:customers){
    System.out.println("Customer ID"+customerID+ "Name:"+name+"\nemail"+email+"\nPhone number"+phoneNumber);
}

    }
}
