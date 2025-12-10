import java.io.*;
class hello{
    public static void main(String[] args){
       // createData();
        //readFileData();
        deleteFile();
        //creating a new file
       try{
        File file =new File("home.html");
            if(file.createNewFile()){
                System.out.println("doneee" + file.getName());   
                   }
                    else{
                       System.out.println("already file created");
        }
        } catch (Exception e){
           System.out.println(e);
        }
    }
    //creating data in a file
    static void createData(){
        try {
            FileWriter writer=new FileWriter("home.html",true);
            writer.write("hello new file data");    //overwrite 
            writer.close();
        } catch (Exception e){
             System.out.println(e);
        }
    }
    // reading of a file
      static void readFileData(){
          try {
             FileReader reader=new FileReader("home.html");
             int ch;
             while((ch=reader.read())!=-1) {
                System.out.println((char)ch);
             }
          }catch (Exception e){

          }
      }
      static void deleteFile(){
        try {
            File file=new File("home.html");
            if(file.delete()){
                System.out.println("deleteddd");
            }
            else{

            }
        }catch (Exception e){

        }
      }

}
