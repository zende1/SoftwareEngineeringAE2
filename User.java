public class User {

    private boolean loginStatus;
    
    //Constructor(s)
    public User( boolean loginStatus)
    { 
     this.loginStatus=loginStatus;
    }
    
    //Getters
  
    
    public boolean get_loginStatus()
    { return this.loginStatus;
    }
    
    //Setters
  
    
    protected void set_loginStatus(boolean loginStatus)
    { this.loginStatus=loginStatus;
    }
   
    //Other Methods
    //...
   }