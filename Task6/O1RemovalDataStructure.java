package Task6;

import java.util.HashMap;

public class O1RemovalDataStructure {
    private HashMap<String, Node> hashTable;
    private Node head;
    private Node tail;

    public O1RemovalDataStructure() {
        this.hashTable = new HashMap<>();
        this.head = new Node(null, 0);
        this.tail = new Node(null, 0);
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    public void insert(String key, int value) {
        if (hashTable.containsKey(key)) {

            remove(key);
        }

        Node newNode = new Node(key, value);
        hashTable.put(key, newNode);

        newNode.next = head.next;
        newNode.prev = head;
        head.next.prev = newNode;
        head.next = newNode;
    }

    public void remove(String key) {
        if (!hashTable.containsKey(key)) {
            return;
        }

        Node nodeToRemove = hashTable.get(key);


        nodeToRemove.prev.next = nodeToRemove.next;
        nodeToRemove.next.prev = nodeToRemove.prev;

        hashTable.remove(key);
    }

    public void display() {
        Node current = head.next;
        while (current.next != null) {
            System.out.print("(" + current.key + ": " + current.value + ") -> ");
            current = current.next;
        }
        System.out.println("None");
    }

    public static void main(String[] args) {
        O1RemovalDataStructure customDataStructure = new O1RemovalDataStructure();
        customDataStructure.insert("A", 1);
        customDataStructure.insert("B", 2);
        customDataStructure.insert("C", 3);
        customDataStructure.insert("D", 4);
        customDataStructure.insert("E", 5);

        System.out.println("Initial state:");
        customDataStructure.display();

        customDataStructure.remove("C");

        System.out.println("\n Data after removing 'C':");
        customDataStructure.display();
    }
}