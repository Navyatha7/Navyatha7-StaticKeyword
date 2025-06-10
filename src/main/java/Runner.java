public class Runner {
    /**
     * This method sets the value of Class.global_var to the given input.
     *
     * @param in the String value you should assign to global_var.
     */
    public void changeClassVar(String in) {
        Class.global_var = in;
    }

    // Optional: a main method to test the functionality
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.changeClassVar("Hello, World!");
        System.out.println(Class.global_var); // Output: Hello, World!
    }
}
