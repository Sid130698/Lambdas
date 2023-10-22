// Implement a lambda that checks if a given string is empty.

public class EmStr{
    public static void main(String[] args){
        EmptString emptyString = (inputString)->inputString.length()>0?false:true;
        System.out.println(emptyString.checkEmpty("Mota bhai"));
        System.out.println(emptyString.checkEmpty(""));
    }
}

@FunctionalInterface
interface EmptString{
    boolean checkEmpty(String inputString);
}