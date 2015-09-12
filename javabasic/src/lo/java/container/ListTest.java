package lo.java.container;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List arraylist = new ArrayList();
		List linkedlist = new LinkedList();
		Vector vector = new Vector();
		System.out.println(vector instanceof List);
		arraylist.add(null);
		arraylist.add(null);
		arraylist.add(null);
		arraylist.add(null);
		arraylist.add(null);
		arraylist.add(null);
		linkedlist.add(null);
		arraylist.add(linkedlist);
		System.out.println(arraylist.size());
		Map map = new HashMap();
		Collections.synchronizedCollection(arraylist);
	}

}
