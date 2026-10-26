package ExceptionHandlingCodes;
public class RuntimeError {
    public static void main(String[] args) {
        int[] numerators = {10, 200, 300, 500};
        int[] denominators = {2, 0, 5, 0};

        for(int i=0; i<numerators.length; i++) {
            System.out.println(divide(numerators[i], denominators[i]));
        }
        System.out.println("Kya ye sahi code hai ?");
    }



    public static int divide(int a, int b) {

        try{
            return a/b ;
        } catch (ArithmeticException e) {
            System.out.println("Denominator cannot be zero");
            System.out.println("Error: "+ e.getCause());
            System.out.println("Error: "+ e.getMessage());
             System.out.println("Error: "+ e.getLocalizedMessage());
            return 0;
        } 
    }
}

