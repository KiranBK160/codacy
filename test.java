public class Example {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // Unused variable
        int unusedVariable = 10;
        // Null pointer dereference
        String potentiallyNullString = null;
        System.out.println(potentiallyNullString.length());
        // Magic number
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }
        // Hardcoded string literal
        System.out.println("Hardcoded string literal");
        // Deprecated method usage
        Example example = new Example();
        example.deprecatedMethod();
    }
    @Deprecated
    public void deprecatedMethod() {
        System.out.println("This method is deprecated.");
    }
}
