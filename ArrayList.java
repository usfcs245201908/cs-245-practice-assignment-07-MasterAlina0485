import java.util.*;
/**
 * Write a description of class ArrayList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayList<T> implements List<T>
{
    // instance variables - replace the example below with your own
    private T[] arr = (T[]) new Object[20];
    private int size = 0; 

    public ArrayList() {}
    
    public void add(T item)
    {
        if (size == arr.length)
            arr=Arrays.copyOf(arr, arr.length*2);
        arr[size] = item;
        size++;
    }
    
    public void add(int pos, T item) throws Exception
    {
        if (pos < 0 || pos > size)
            throw new Exception("Out of bounds index: "+pos);
        if (size == arr.length)
            arr=Arrays.copyOf(arr, arr.length*2);
        
        for (int i = size; i > pos; i--)
        {
            arr[i] = arr[i-1];
        }
        arr[pos] = item;
        size++;
    }
    
    public T get (int pos) 
    {
        return arr[pos];
    }
    
    public T remove (int pos) throws Exception 
    {
        if (pos < 0 || pos >= size)
            throw new Exception("Out of bounds index: "+pos);
        T rmv = arr[pos];
        for (int i = pos; i < size-1; i++)
        {
            arr[i] = arr[i+1];
        }
        size--;
        return rmv;
    }
    
    public int size ()
    {
        return size;
    }
}
