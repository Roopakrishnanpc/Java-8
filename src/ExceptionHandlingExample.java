class D {
    String name = "Roopa";
}

public class ExceptionHandlingExample { 
    public static void main(String[] args) {
        D d = null;
        try {
            System.out.println(d.name); // This will throw NullPointerException
        } catch (NullPointerException e ) {//if you keep this below exception you will get ureachable catch
        	//catch (NullPointerException |SQLException ex ) { multicatchblock
        	d = new D(); // Initialize 'd' to handle the exception
            System.out.println(d.name); // This will print "Roopa"
            // e.printStackTrace(); // Optionally print the stack trace
        } catch (Exception e) {
            // Handle other exceptions (this block will never be reached in this case)
        } finally {
            System.out.println("Done eh"); // This will always be executed
        }
    }
}
