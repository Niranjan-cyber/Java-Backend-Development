package l_exception_handling;

public class demo {
    public static void main(String[] args) {
        int i = 2;
        int j = 0;

        int nums[] = new int[5];

        
        try {
            j = 18 / i;
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch (ArithmeticException e){     // will throw an exception object
            System.out.println("cant divide by zero " + e);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("index out of bounds ");
        }
        catch(Exception e){
            System.out.println("something went wrong");
        }
        
        System.out.println(j);
        System.out.println("Bye");
    }
}
