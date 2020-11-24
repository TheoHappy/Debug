import java.util.LinkedList;


public class MyList<E> extends LinkedList<E> {
	@Override
	public boolean add(E e) {return super.add(e);}
	
	@Override
	public E set(int index,E e) {return super.set(index, e);}
	
	@Override
	public E get(int index) {return super.get(index);}
	
	@Override
	public int size() {return super.size();}
}

