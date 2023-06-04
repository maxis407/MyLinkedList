public class MyLinkedList<T> {

    private Node<T> head; // ссылка на первый элемент списка
    private int size; // размер списка


    public MyLinkedList() {
        head = null;
        size = 0;
    }


    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }


    public T get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getValue();
    }


    public T remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Node<T> removedNode;
        if (index == 0) {
            removedNode = head;
            head = head.getNext();
        } else {
            Node<T> previous = head;
            for (int i = 0; i < index - 1; i++) {
                previous = previous.getNext();
            }
            removedNode = previous.getNext();
            previous.setNext(removedNode.getNext());
        }
        size--;
        return removedNode.getValue();
    }


    public int size() {
        return size;
    }


    private static class Node<T> {
        private T value;
        private Node<T> next;


        public Node(T value) {
            this.value = value;
            next = null;
        }

        public T getValue() {
            return value;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }
}


