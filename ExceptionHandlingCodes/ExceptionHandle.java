package ExceptionHandlingCodes;

public class ExceptionHandle {
    public static void main(String args[])  {
        int a[] = new int[5];

        try{
        System.out.println(a[8]);
            int result = 15/0;

        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) { // "ArrayIndexOutOfBoundsException" catches multiple types of exceptions
            System.out.println("Error: "+ e.getCause());
            System.out.println("Error: "+ e.getMessage());
             System.out.println("Error: "+ e.getLocalizedMessage());
        }
        System.out.println("Hello Golu");

    }
}
