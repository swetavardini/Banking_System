
///throw example -- 

public class Thr {
    static void checkAge(int age)throws ArithmeticException,ArrayIndexOutOfBoundsException{
        if(age<0){
            throw new ArrayIndexOutOfBoundsException("enter orginal age");
        }
        else if(age<18){
            throw new ArithmeticException("U have to be 18  above to be eligible");
        }
        else {
            System.out.println("U are not eligiblle");
        }
    }

    public static void main(String[] args) {
        checkAge(-16);
    }
}