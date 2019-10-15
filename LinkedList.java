
/**
 * Write a description of class LinkedList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LinkedList<T> implements List<T>
{
    // instance variables - replace the example below with your own
    private Node start = null;
    private int size = 0; 

    public LinkedList() {}
    
    public void add(T item)
    {
        if (start == null)
            start = new Node(item);
        Node n = new Node(item);
        start.getLast().setNext(n); 
        size++;
    }
    
    public void add(int pos, T item) throws Exception
    {
        Node n;
        if (pos < 0 || pos > size)
            throw new Exception("Out of bounds index: "+pos);
        if (pos == 0) 
        {     
            n = new Node (item, start);
            start = n;
        }
        n = new Node(item, start.getIndex(pos));
        start.getIndex(pos-1).setNext(n); 
        size++;
    }
    
    public T get (int pos) throws Exception 
    {
        if (pos < 0 || pos >= size)
            throw new Exception("Out of bounds index: "+pos);
        return (T)start.getIndex(pos).getData();
    }
    
    public T remove (int pos) throws Exception 
    {
        Node rmv;
        if (pos < 0 || pos >= size)
            throw new Exception("Out of bounds index: "+pos);
        rmv = start.getIndex(pos);
        start.getIndex(pos-1).setNext(start.getIndex(pos+1));
        size--;
        return (T)rmv.getData();
    }
    
    public int size ()
    {
        return size;
    }
    
}
