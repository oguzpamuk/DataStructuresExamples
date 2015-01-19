package DataStructures;

public interface ArrayListInterface<E> {

	/** Belirtilen index'e objeyi set eder
	 * @param index
	 * @param element
	 */
	E set(int index,E element);
	
	/**Verilen objeyi listenin sonuna ekler
	 * 
	 * @param element
	 * @return
	 */
	boolean add(E element);
	
	/** Listenin objelerini siler
	 * Liste boş bir hale gelir
	 */
	void clear();
	
	/**Obje listede var mi diye kontrol eder 
	 * @param element
	 * @return obje varsa true yoksa false 
	 */
	boolean contains(E element);
	
	/**Index'i verilen elemani return eder
	 * @param index
	 * @return Element
	 */
	E get(int index);
	
	/**Objenin index'ini verir
	 * @param element
	 * @return
	 */
	int indexOf(E element);
	
	/**Listenin bos olup olmadigini soyler
	 * @return liste bossa true aksi halde false
	 */
	boolean isEmpty();
	
	/**Verilen index'deki objeyi siler
	 * @param index
	 * @return silinen obje
	 */
	E remove(int index);
	
	/**
	 * @return listedeki eleman sayisi
	 */
	int size();
	
}
