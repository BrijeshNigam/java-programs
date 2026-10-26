package ExceptionHandlingCodes;

public class ExceptionHandle {
    public static void main(String args[])  {
        int a[] = new int[5];

        System.out.println("Hello, Golu");

        try{
        System.out.println(a[8]);
            int result = 15/0;

        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) { // "ArrayIndexOutOfBoundsException" catches multiple types of exceptions
            System.out.println("Error: "+ e.getCause());// "getCause()" returns the cause of the exception
            System.out.println("Error: "+ e.getMessage());// "getMessage()" returns a detailed message about the exception
            System.out.println("Error: "+ e.getLocalizedMessage());// "getLocalizedMessage()" returns a localized description of the exception
            System.out.println("Error: "+ e.getStackTrace());// "getStackTrace()" returns an array of stack trace elements representing the stack dump of the exception
        }
        System.out.println("Bye, Golu");

    }
}
