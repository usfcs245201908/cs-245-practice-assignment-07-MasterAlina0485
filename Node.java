
/**
 * Write a description of class Node here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Node<T>
{
    private T data;
    private Node next;
    /**
     * Constructor for objects of class Node
     */
    public Node(T d, Node n)
    {
        // initialise instance variables
        data = d; 
        next = n; 
    }

    public Node(T d)
    {
        // initialise instance variables
        data = d; 
        next = null; 
    }
    
    public T getData()
    {
        return data;
    }
    public Node getNext()
    {
        return next;
    }
    
    public void setNext(Node n)
    {
        next = n;
    }
    
    /*
    public Node getLast() // Recursive call to get the last node in the list
    {
        if (this.next == null)
            return this;
        return next.getLast();
    }
    */
    public Node getLast() // non recursive version i guess
    {
        Node n = this;
        while (n.next != null)
            n=n.next;
        return n;    
    }
    
    /*
    public Node getIndex(int index) throws Exception //recursive call to get the nth node in the list
    {
        if (index <= 0)
            return this;
        if (this.next == null)
            throw new Exception ("not enough nodes in the list.");
        return next.getIndex(index-1); 
    }
    */
    public Node getIndex (int index) throws Exception // non recursive version i guess
    {
        Node n = this;
        while (index >0)
        {
            if (n.next == null)
                throw new Exception ("not enough nodes in the list.");
            n=n.next;
            index--; 
        }
        return n; 
    }
    
}
