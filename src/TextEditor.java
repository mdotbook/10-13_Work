public class TextEditor
{
    public static void main(String[] args) {
        // 1. Using String (immutable)
        String title = "Welcome";
        System.out.println("Original title: " + title);

        // Trying to add text
        String newTitle = title + " to Java";
        System.out.println("After concatenation (String): " + newTitle);
        System.out.println("Title remains same: " + title); // still "Welcome"

        // 2. Using StringBuffer (mutable)
        StringBuffer content = new StringBuffer("This is a simple text editor.");
        System.out.println("\nOriginal content: " + content);

        // Adding text
        content.append(" It can modify text easily.");
        System.out.println("After append (StringBuffer): " + content);

        // Inserting text
        content.insert(5, " really");
        System.out.println("After insert: " + content);

        // Deleting text
        content.delete(5, 11);
        System.out.println("After delete: " + content);

        // Reversing text
        content.reverse();
        System.out.println("After reverse: " + content);
    }

}
