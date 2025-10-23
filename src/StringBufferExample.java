public class StringBufferExample
{
    public static void main(String[] args) {
        StringBuffer text = new StringBuffer("Hello");
        text.append(" World"); // modifies same object

        System.out.println("Modified StringBuffer: " + text);
    }
}


