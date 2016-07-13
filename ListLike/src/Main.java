import java.util.Iterator;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		Sequence<String> s1 = new Sequence<String>();
		
		assert s1.size() == 0;
		s1.add("Hello");
		s1.add("there");
		assert s1.size() == 2;
		assert s1.get(0).equals("Hello");
		assert s1.get(1).equals("there");
		s1.add("done");
		assert s1.size() == 3;
		assert s1.get(0).equals("Hello");
		assert s1.get(1).equals("there");
		assert s1.get(2).equals("done");
		
		System.out.println("First set of test cases passed");
*/		
		Sequence<String> s = new Sequence<String>();
		s.add("Hello");
		s.add("there");
		s.add("done");
		Iterator<String> i1 = s.iterator();
		Iterator<String> i2 = s.iterator();
		
		//System.out.println(i1.next());
		assert i1.hasNext();
		assert i1.next().equals("Hello");
		assert i1.hasNext();
		assert i1.next().equals("there");
		assert i2.hasNext();
		assert i2.next().equals("Hello");
		assert i1.hasNext();
		assert i1.next().equals("done");
		assert i1.hasNext() == false;
		assert i2.next().equals("there");
		assert i2.next().equals("done");
		assert i2.hasNext() == false;
		System.out.println("Iterator test cases passed");
	}

}
