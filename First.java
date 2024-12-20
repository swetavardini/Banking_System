import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

// class Sample {
//     private String name;
//     private String pass;

//     Sample(String name,String pass){
//         setName(name);
//         setPass(pass);
//     }

//     public String getName(){
//         return name;
//     }
//     public String getPass(){
//         return pass;
//     }
//     public void setName(String name){
//         this.name = name;
//     }
//     public void setPass(String pass){
//         this.pass = pass;
//     }
    
// }

public class First {
    public static void main(String[] args){
        ArrayList<String> alist = new ArrayList<>();
        alist.add("hloo");
        alist.add("world");
        // Scanner scan = new Scanner(System.in);

        // Sample sam = new Sample(scan.nextLine(),scan.nextLine());


        File file = new File("demo.txt");
        // file.compareTo(file)

        try{
            file.createNewFile();
            System.out.println("file created successfully");
        }
        catch(Exception e){
            System.out.println("check ur memory space");
        }
            try{
                FileWriter fw = new FileWriter(file);
                // fw.write("hi");
                //serializable
                // FileOutputStream fos = new FileOutputStream(file);
                // ObjectOutputStream oos = new ObjectOutputStream(fos);  /// another way 
                ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(file) );
                oos.writeObject(alist);
                oos.close();

                //deserialaize
                FileInputStream fos = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fos);
                // ois.readBoolean();
                ois.close();

                ArrayList<String> fs =(ArrayList<String>)ois.readObject();
                fs.get(0);

                fw.write("hloo SWEETY");
                fw.close();//because only when we close it will save the content
                System.out.println("file upated successfully");


                FileReader fr =new FileReader(file);
                int ch;
                while((ch= fr.read())!=-1){
                    System.out.println((char)ch);
                    fr.close();
                    System.out.println("file reed successfully");

                }
            }
            catch(Exception e){
                System.out.println("check ur File");
            }
        }
    

        
    }

//look out for SERIALIZABLE



