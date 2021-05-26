



public class DataBaseEntity {

   private String classDirectorName;
   private String className;
   private TeachingRequirement tr;
   private Teacher teacher;
   private ClassDirector cd;

    public DataBaseEntity(String name,String nameClass, TeachingRequirement tr, Teacher teacher){
       classDirectorName  = name;
       className = nameClass;
       this.tr = tr;
       this.teacher = teacher;
    }

    public DataBaseEntity(ClassDirector cd, TeachingRequirement tr, Teacher teacher){
      this.cd =cd;
      this.tr = tr;
      this.teacher = teacher;
   }

    @Override
    public String toString(){
         return ""+cd+"," +  className+"," + tr+"," + teacher;
    }
    public static void main(String[] args) {
       //test printing 
       var lab = new Lab("First class");
       var tr = new TeachingRequirement(lab, 3);
       var te = new Teacher(true, "aaa", "aaa", "aaa@aaa");
       DataBaseEntity entity = new DataBaseEntity("MIke", "English", tr, te);
      System.out.println(entity);
    }

}
