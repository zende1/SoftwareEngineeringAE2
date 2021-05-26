//Written by:Zhe Tang
import java.util.ArrayList;

public class TeachingRequirement { 
 //attributes
 protected Lab lab;
 protected int staffRequired;
 protected ArrayList<String> training = new ArrayList<String>();
 
 
 //constructors
 public TeachingRequirement(Lab lab,int staffNumber)
 {
  this.staffRequired=staffNumber;
 }
 public TeachingRequirement(Lab lab,int staffNumber, ArrayList<String> train)
 {
  this.staffRequired=staffNumber;
  this.training = train;
 }
 
 //setters
 
 //getters
 
 /*other methods*/
 // 4 basic operations:add,delete,search,modify
 public void add_training(String training)
 { this.training.add(training);
 }

 public void delete_training(int index)
 { this.training.remove(index);
 }

 public String search_training(int index)
 { return this.training.get(index);  
 }
 
 public void modify_training(int index,String training)
 { this.training.set(index, training);
 }
 
 //
 public int count_training()
 { return this.training.size(); 
 }

 //
 public void print_requirement()
 { System.out.println(this.lab);
  System.out.println(this.staffRequired);
  for (int i = 0; i < this.training.size(); i++) {
            System.out.println(this.training.get(i));
        }
 }
@Override
public String toString() {
    // TODO Auto-generated method stub
   String ans;
   ans ="" + this.lab+","+this.staffRequired+","+"requirement:";
   for (int i = 0; i < this.training.size(); i++) {
   ans =  ans+this.training.get(i)+" ";
  
}
return ans;
}
 
 public static void main(String[] args) {
     Lab lab =new Lab("Class1");
     ArrayList<String> training = new ArrayList<String>();
     training.add("english");
     training.add("deutsch");
     TeachingRequirement tr =new TeachingRequirement(lab,3,training);
     System.out.println(tr);
 }
}