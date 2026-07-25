public class lec_36_classesChallenges {
    public static void main(String args[]){
        GroceryMart sc = new GroceryMart();
        sc.setcusName("riya");
        sc.setcustId(123);
        sc.setcusPhoneNo(1234567890);
        sc.setcusAccBal(70000.9);
        sc.setcusAdd("delhi");
        sc.shopping(80000);
        sc.recharge(30000);

    }
}

class GroceryMart{
    private String cusName;
    private int cusId;
    private int cusPhoneNo;
    private double cusAccBal;
    private String cusAdd;

public void setcusName(String name){
    this.cusName = name;
}
public String getcusName(){
    return this.cusName;
}



public void setcustId(int id){
    this.cusId = id;
}
public int getcustId(){
    return this.cusId;
}


public void setcusPhoneNo(int number){
    this.cusPhoneNo = number;
}
public int getcusPhoneNo(){
    return this.cusPhoneNo;
}

public void setcusAccBal(double balance){
    this.cusAccBal = balance;
}
public double getcusAccBal(){
    return this.cusAccBal;
}



public void setcusAdd(String address){
    this.cusAdd = address;
}
public String getcustName(){
    return this.cusAdd;
}


public void shopping(double amount){
    if(cusAccBal >= amount){
        double remBal = cusAccBal - amount;
        System.out.println("your reammaining balance is :" + remBal);
        cusAccBal = remBal;
    }else{
        System.out.println("insufficient amount.");
    }
}



public void recharge(double recharge){
    cusAccBal = cusAccBal + recharge;
    System.out.println("your new balance is :" + cusAccBal);
}



}
