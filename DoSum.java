/*
*Write a simple lambda expression that takes two integers and returns their sum.
*/


public class DoSum{
    public static void main(String[] args){
        InterAdd addNumbers = (a,b)-> a + b;
        int result = addNumbers.add(5,7);
        System.out.println(result);
    }
}

@FunctionalInterface
interface InterAdd{
    int add(int a, int b);
}
