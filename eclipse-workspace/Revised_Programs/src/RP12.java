import java.util.ArrayList;
import java.util.List;

public class RP12 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list= new ArrayList<Integer>();
		
		List<Integer> li= new ArrayList<Integer>();  //Arraylist class comes under interface List, so here assigning object of arraylist to variable of list
		
		list.add(3);
		list.add(9);
		list.add(2);
		list.add(4);
		
		li=list;
		
		for (int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}

		for (Integer list1:li)
		{
			System.out.println(list1);
		}
	}

}
