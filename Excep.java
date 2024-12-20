public class Excep {
    public static void main(String[] args) {
        int[] arr ={1,2,3};
        try{
            System.out.println(arr[5]);
        }
        catch(Exception error){
            //  System.out.println("the error is found");
            System.err.println(error);
            // System.out.println(error);

        }
        finally{
            System.out.println("Excetuted");
        }
    }
}
