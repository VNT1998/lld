package hw;

import java.util.Iterator;

public class Node implements Iterable<Node> {
    int data;
    Node next;

    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }

    public Node(int data,Node next)
    {
        this.data=data;
        this.next=next;
    }

    @Override
    public Iterator<Node> iterator() {
        return new NodeIterator(this);
    }
    public static class NodeIterator implements Iterator<Node>{
        Node root;
        public NodeIterator(Node root){
            this.root = root;
        };
        @Override
        public boolean hasNext() {
            return root.next != null;
        }

        @Override
        public Node next() {
            Node temp = root;
            root = root.next;
            return temp;
        }
    }
}
