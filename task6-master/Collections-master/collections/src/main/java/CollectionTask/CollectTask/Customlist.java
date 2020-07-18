package CollectionTask.CollectTask;
import java.util.*;
public class Customlist<R> extends AbstractList<R>
{
	int size=0;
	Object elements[];
	public Customlist()
	{
		elements=new Object[10];
	}
	public boolean add(R ele) 
	{
		if(size==elements.length)
		{
			maintainCapacity();
		}
		elements[size++]=ele;
		return true;
			
	}
	@SuppressWarnings("unchecked")
	@Override
	public R get(int i)
	{
		return (R) elements[i];
	}
	@Override
	public  int size()
	{
		return elements.length;
	}
	public void maintainCapacity()
	{
		elements=Arrays.copyOf(elements,elements.length*2);	
	}
	@SuppressWarnings("unchecked")
	@Override
	public R remove(int i) 
	{
		Object p=elements[i];
		size--;
		System.arraycopy(elements, i+1,elements,i,elements.length-i-1);
		return (R) p;
	}
	public void print() {
		for(int i=0;i<size;i++) {
			System.out.println(elements[i]);
		}
	}
}
