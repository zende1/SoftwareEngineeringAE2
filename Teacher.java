public class Teacher extends User{
    protected String name;
    protected String subject;
    protected String email;
    
    
    //Constructor(s)
    public Teacher(boolean loginStatus, String name, String subject, String email)
    { super(loginStatus);
     this.name=name;
     this.subject=subject;
     this.email=email;
    }
    
    //Getters
    public String get_name()
    { return this.name;
    }
     
    public String get_subject()
    { return this.subject;
    }
     
    public String get_email()
    { return this.email;
    }
     
    //Setters
    protected void set_userID(String name)
    { this.name=name;
    }
     
    protected void set_password(String subject)
    { this.subject=subject;
    }
     
    protected void set_loginStatus(String email)
    { this.email=email;
    }
   
    //Other Methods
    //one method for teacher to send a package to database admin
    

    //one method for teacher to get a package from database admin


    //login
    //To be added more details
    protected void login()
    { System.out.println("Access granted!");
    }
    @Override
    public String toString(){
        return "" + name +"," + subject  +","
        +email;
    }

    public static void main(String[] args) {
        Teacher te = new Teacher(true,"yu","Eng","gmail");
        System.out.println(te);
    }
   }