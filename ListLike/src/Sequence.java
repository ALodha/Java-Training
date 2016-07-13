import java.util.Iterator;

public class Sequence<T> implements Iterable<T> {

	String array[]= new String[10];
	static int count=0;
	
	public void add(Object obj){
		if(count<9){
		
			array[count]=(String) obj;
			count++;
		}else{
			System.out.println("Array full");
		}
		
	} 
	
	public String get(int index){
		if(index>count || index<0){
			return "Incorrect index";
		}
		return array[index];
	}
	
	public int size(){
		return count;
	}

	@Override
	public Iterator<T> iterator() {
		//System.out.println(this.array[1]);
	/*	SequenceIterator<T> obj= new SequenceIterator<T>(this);
		System.out.println("From iterator"+this.array[0]);
	*/	
		return new SequenceIterator<T>();
	}

	public class SequenceIterator<E> implements Iterator<E>{

		private int progressCounter =0;
		//String[] array= new String[10];
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if(progressCounter<count)
			return true;
			return false;
		}

		
		@Override
		public E next() {
			// TODO Auto-generated method stub
			@SuppressWarnings("unchecked")
			E e = (E)array[progressCounter];
			progressCounter++;
			return e;
			
		}
		
		public void remove(){
			throw new UnsupportedOperationException();
		}
	}

}
