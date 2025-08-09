package StringImmutability;

public class StringBufferMethods {
	public static void main(String[] args) {
        // 1. append
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println("append: " + sb);

        // 2. insert
        sb.insert(5, ",");
        System.out.println("insert: " + sb);

        // 3. replace
        sb.replace(7, 12, "Java");
        System.out.println("replace: " + sb);

        // 4. delete
        sb.delete(5, 6);
        System.out.println("delete: " + sb);

        // 5. deleteCharAt
        sb.deleteCharAt(5);
        System.out.println("deleteCharAt: " + sb);

        // 6. reverse
        sb.reverse();
        System.out.println("reverse: " + sb);

        // Reset for further methods
        sb = new StringBuffer("Hello World");

        // 7. length
        System.out.println("length: " + sb.length());

        // 8. capacity
        System.out.println("capacity: " + sb.capacity());

        // 9. charAt
        System.out.println("charAt(1): " + sb.charAt(1));

        // 10. setCharAt
        sb.setCharAt(0, 'h');
        System.out.println("setCharAt: " + sb);

        // 11. substring(start)
        System.out.println("substring(6): " + sb.substring(6));

        // 12. substring(start, end)
        System.out.println("substring(0,5): " + sb.substring(0,5));

        // 13. toString
        String str = sb.toString();
        System.out.println("toString: " + str);

        // 14. ensureCapacity
        sb.ensureCapacity(50);
        System.out.println("ensureCapacity: " + sb.capacity());

        // 15. setLength
        sb.setLength(5);
        System.out.println("setLength: " + sb);
    }
}


