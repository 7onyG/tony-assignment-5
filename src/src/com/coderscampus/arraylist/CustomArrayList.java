package src.com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	 int size = 0;
	 
	 private Object[] increaseSizeArray() {
		 
		 
			Object[] newArray = new Object[size*2];
			for (int i=0; i<size; i++) {
				newArray[i] = items[i];
				
			}
			return newArray;
		}

	 
	 
	@Override
	public boolean add(T item) {
		if (size == items.length) {
			
			items = increaseSizeArray();
			
		}
		
		items[size] = item;
		size++;
		return true;
	}

	@Override
	public int getSize() {
		
		return size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index)  throws IndexOutOfBoundsException {
		
		if (index >= size) throw new IndexOutOfBoundsException("Out of bounds");
		
		return (T) items[index];
		
	}
	
	
}
