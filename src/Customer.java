

public class Customer {
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

    public void getName(){
        return name;
    }
    public void getCustomerID(){
        return customerID;
    }
    public void getEmail(){
        return email;
    }
    public void getPhoneNumber(){
        return phoneNumber;
    }
}
