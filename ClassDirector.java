//Written by:Zhe Tang

public class ClassDirector extends User{
    protected String name;
    protected String subject;
    protected String email;
    protected TeachingRequirement teachingRequirement;
    
    //Constructor(s)
    public ClassDirector(boolean loginStatus, String name, String subject, String email,TeachingRequirement tr)
    { super(loginStatus);
     this.name=name;
     this.subject=subject;
     this.email=email;
     this.teachingRequirement = tr; 
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
    public void set_userID(String name)
    { this.name=name;
    }
     
    public void set_password(String subject)
    { this.subject=subject;
    }
     
    public void set_loginStatus(String email)
    { this.email=email;
    }
   
    /*Other Methods*/
    
    //Deliver this to Database Admin
    public DataBaseEntity setTeachingRequirement(Teacher teacher)
    { 
     DataBaseEntity entity=new DataBaseEntity(this.name,this.subject,this.teachingRequirement,teacher);
     return entity;
    }
    
    @Override
    public String toString(){
        return ""+name+","+subject+","+email+","+teachingRequirement;
    }
    
   public static void main(String[] args) {
       //make the lab
       Lab lab1 = new Lab("class1");
       //make the teaching requirement
       TeachingRequirement tr = new TeachingRequirement(lab1,3);
       ClassDirector cd = new ClassDirector(true, "name", "subject", "email", tr);
       System.out.println(cd);
   }
   
   
   
   
   }