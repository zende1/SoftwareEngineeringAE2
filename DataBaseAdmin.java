import java.util.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.io.FileReader;
import java.io.Reader;
import java.io.BufferedReader;


class DataBaseAdmin{
List<DataBaseEntity> data = new ArrayList<DataBaseEntity>();
File file;
String dirName;
char[] dataStorage = new char[50];
private String classDirectorName;
private String className;
private TeachingRequirement tr;
private Teacher teacher;




DataBaseAdmin(){
    file = new File("data.txt");
  
}

DataBaseAdmin(String dir){
    file = new File(dir);
}
//read method


private void setData(List<DataBaseEntity> data){
    this.data =data;
}

public int getSize(){
return data.size();
}

private void addData(DataBaseEntity et){
    data.add(et);
}

private void changeData(DataBaseEntity et,int index){
    data.remove(index);
    data.add(et);
}

//read file method

private void readFile(){
   try{
	   file.createNewFile();
	   FileReader fr = new FileReader(file);
	   fr.read(dataStorage);
	   for(char c: dataStorage) {
		   System.out.print(c);
	   }
   }
   catch(IOException e) {
		e.printStackTrace();
	
   
   
}

}
//get information
private void getFile(){
	   try{
		   file.createNewFile();
		   BufferedReader buf = new BufferedReader(new FileReader(file));
		   String line ="";
		   String[] args = null;
			while ((line = buf.readLine()) != null) {
				args = line.split(",");
				
				Teacher teacher = new Teacher();
				arrs = line.split(" ");
				teacher.setUid(Integer.parseInt(arrs[0]));
				teacher.setUname(arrs[1]);
				teacher.setSkill(arrs[2]);
				teacher.setTrainingStatus(Boolean.parseBoolean(arrs[3]));
				teacherList.add(teacher);
			}
		   }
	   
	   catch(IOException e) {
			e.printStackTrace();
		
	   
	   
	}

	}
//convert data[] to list of database entity
private void convert() {
	int ptr1,ptr2;
	while(dataStorage[i]!= '\0') {
		String name ="";
		while(dataStorage[i]!= '\0') {
			
		}
		DataBaseEntry dbe = new DataBaseEntry()
	}
}

//write method
//the method to write to file
private void writeFile(){
   try {
        FileWriter writer = new FileWriter(file,false);
        int size = getSize();
        for(int i = 0;i < size; i++){
            writer.write(data.get(i).toString()+"\n");
        }
        writer.close();
   }
        catch(IOException e) {
    		e.printStackTrace();
    	}
       

}
 
public static void main(String[] args) {
	 Lab lab = new Lab("First class");
     var tr = new TeachingRequirement(lab, 3);
     var te = new Teacher(true, "aaa", "aaa", "aaa@aaa");
     DataBaseEntity entity = new DataBaseEntity("Mike", "English", tr, te);
    DataBaseAdmin dbad = new DataBaseAdmin();
    dbad.addData(entity);
   dbad.readFile();
    
}
}