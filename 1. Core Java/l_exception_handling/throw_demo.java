package l_exception_handling;

class NavinException extends Exception{
    public NavinException(String s){
        super(s);       // for the message
    }
}

public class throw_demo {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try{
            j = 18 / i;
            if (j == 0){
                throw new NavinException("I dont want to print zero");
            }
        }
        catch (NavinException e){
            System.out.println("cant divide by zero" + e);
        }
        catch (Exception e){
            System.out.println("something went wrong");
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}
