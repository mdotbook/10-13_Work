public class StringBufferMethods
{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");

        sb.append(" Programming");    // add text
        sb.insert(5, " Super");       // insert text at index 5
        sb.delete(5, 11);             // remove " Super"

        System.out.println(sb);       // Java Programming
    }
}

