class Details{
    private String name;
    private String email;
    private String phone_no;

    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhone(String phone){
        this.phone_no = phone;
    }

    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getPhone(){
        return phone_no;
    }
}


public class Question2 {
    public static void main(String[] args) { 
        Details dt = new Details();
        dt.setName("Wrushikesh Patil");
        dt.setEmail("wrushikesh.patil@quantiphi.com");
        dt.setPhone("7218030370");

        System.out.println("Name: "+dt.getName()+ "\nEmail: "+dt.getEmail()+ "\nPhone Number: "+dt.getPhone());
    }
}
