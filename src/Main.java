
public class Main {

    public static void main(String[] args) {

        // 1. Create Linked List
        DocumentLinkedList list = new DocumentLinkedList();

        // 2. Check if List is Empty
        System.out.println("Is Empty: " + list.isEmpty());

        // 3. Create Documents
        Document d1 = new Document(1, "Java", "Java Basics");
        Document d2 = new Document(2, "OOP", "Object Oriented Programming");
        Document d3 = new Document(3, "Data Structures", "Linked List");

        // 4. Append Documents
        list.append(d1);
        list.append(d2);
        list.append(d3);

        // 5. Display Documents
        System.out.println("\n--- Initial List ---");
        list.traverse();

        // 6. Get Size
        System.out.println("Size: " + list.getSize());

        // 7. Delete First
        System.out.println("\n--- Delete First ---");
        list.deleteFirst();
        list.traverse();
        System.out.println("Size: " + list.getSize());

        // 8. Delete Last
        System.out.println("\n--- Delete Last ---");
        list.deleteLast();
        list.traverse();
        System.out.println("Size: " + list.getSize());

        // 9. Append More Documents
        list.append(new Document(4, "Database", "SQL Basics"));
        list.append(new Document(5, "Networks", "Computer Networks"));

        // 10. Delete By ID
        System.out.println("\n--- Delete By ID (4) ---");
        list.deleteById(4);
        list.traverse();
        System.out.println("Size: " + list.getSize());

        // 11. Check if List is Empty
        System.out.println("\nIs Empty: " + list.isEmpty());

        // 12. Delete All Elements
        System.out.println("\n--- Delete All ---");
        list.deleteFirst();
        list.deleteFirst();

        // 13. Test Empty List
        System.out.println("\n--- Final Test ---");
        System.out.println("Is Empty: " + list.isEmpty());
        System.out.println("Size: " + list.getSize());
        list.traverse();
    }
}
