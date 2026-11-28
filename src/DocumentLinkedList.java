public class DocumentLinkedList {

    Node head;
    int size;

    public DocumentLinkedList() {
        this.head = null;
        this.size = 0;
    }

    // isEmpty
    public boolean isEmpty() {
        return head == null;
    }

    // Append a document
    public void append(Document data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {

            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        size++;
    }

    // Traverse 
    public void traverse() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;

        while (current != null) {

            System.out.println("ID: " + current.data.id);
            System.out.println("Title: " + current.data.title);
            System.out.println("Content: " + current.data.content);

            current = current.next;
        }
    }

    // Get size
    public int getSize() {
        return size;
    }

    // Delete first element
    public void deleteFirst() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;
        size--;
    }

    // Delete last element
    public void deleteLast() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            size--;
            return;
        }

        Node current = head;

        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
        size--;
    }

    // Delete by ID
    public void deleteById(int id) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.data.id == id) {
            head = head.next;
            size--;
            return;
        }

        Node current = head;

        while (current.next != null) {

            if (current.next.data.id == id) {
                current.next = current.next.next;
                size--;
                return;
            }

            current = current.next;
        }

        System.out.println("Document ID not found");
    }
}
