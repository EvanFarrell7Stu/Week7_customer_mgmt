

public class Customer {
    String customerID;
    String name;
    String email;
    String phoneNumber;

    public Customer() {
        System.out.println();
        this.customerID="";
        this.name="";
        this.email="";
        this.phoneNumber="";
    }

    public void setName(String name){
        this.name=name;
    }

    public void setCustomerID(String customerID){
        this.customerID=customerID;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    public String getName(){
        return name;
    }
    public String getCustomerID(){
        return customerID;
    }
    public String getEmail(){
        return email;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
}
