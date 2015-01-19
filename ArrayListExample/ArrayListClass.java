package DataStructures;

/**
 * @author oguz
 * ArrayList gibi davranan ve bazi methodlarini icinde barindiran
 * ornek ArrayList yapisi
 * @param <E>
 */
public class ArrayListClass<E> implements ArrayListInterface<E>{

	/*Array'in kapasitesi*/
	private int capacity;
	/*Objeleri saklayan array*/
	private E[] data;
	/*
	 * ArrayList sınıfında eger kapasite verilmezse initial olarak
	 * kapasiteyi 10 atar
	 */
	private static final int INITIAL_CAPACITY=10;
	
	/*data Array size*/
	private int size=0;
	
	public ArrayListClass() {
		this.capacity=INITIAL_CAPACITY;
		data=(E[]) new Object[this.capacity];
	}
	
	public ArrayListClass(int capacity) {
		this.capacity=capacity;
		data=(E[]) new Object[this.capacity];
	}
	
	@Override
	public E set(int index, E element) {
		if(index < 0 || index >= this.size()) {
		    throw new ArrayIndexOutOfBoundsException(index);
		}
		
		E value = this.data[index];
		this.data[index]=element;
		
		return value;
		
	}

	@Override
	public boolean add(E element) {
		if(size()==this.capacity)
			reAllocate();
		
		this.data[size()]=element;
		this.size++;
		
		return true;
	}

	@Override
	public void clear() {
		this.data=(E[]) new Object[this.capacity];
		this.size=0;
	}

	/**Obje listede var mi diye kontrol eder 
	 * @param element
	 * @return obje varsa true yoksa false 
	 */
	@Override
	public boolean contains(E element) {
		for(int i=0;i<this.size();i++){
			if(this.data[i]==element)
				return true;
		}
		return false;
	}

	/* 
	 * @return verilen index'deki obje
	 */
	@Override
	public E get(int index) {
		/*index var olan bir index mi?*/
		if(index < 0 || index >= this.size()) {
		    throw new ArrayIndexOutOfBoundsException(index);
		}
		return this.data[index];
	}
	
	/**Objenin index'ini verir
	 * @param element
	 * @return 
	 */
	@Override
	public int indexOf(E element) {
		
		if(element==null)
			throw new NullPointerException();
		
		for(int i=0;i<size();i++){
			if(this.data[i]==element)
				return i;
		}
		return -1;
	}

	@Override
	public boolean isEmpty() {
		if(this.size()==0)
			return true;
		else
			return false;
	}

	@Override
	public E remove(int index) {
		/*index var olan bir index mi?*/
		if(index < 0 || index >= this.size()) {
		    throw new ArrayIndexOutOfBoundsException(index);
		}
		
		E oldElement=this.data[index];
		
		for(int i=index+1;i<size();i++){
			this.data[i-1]=this.data[i];
		}
		this.size--;
		
		return oldElement;
	}

	/* 
	 * @return array size
	 */
	@Override
	public int size() {
		return this.size;
	}

	public void reAllocate() {
		this.capacity=2*this.capacity;
		
		E[] newData = (E[]) new Object[this.capacity];
		System.arraycopy(this.data, 0, newData, 0, size());
		this.data=newData;
	}
	


}
