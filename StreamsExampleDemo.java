package practicetest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExampleDemo {
	
	public static void main(String[] args) {
		List<Integer> arrlist=new ArrayList<Integer>();
		arrlist.add(5);
		arrlist.add(15);
		arrlist.add(25);
		arrlist.add(35);
		
		List<Integer> newArrList=new ArrayList<Integer>();
		
		//create,configure and process the stream
		newArrList=arrlist.stream().filter(x -> x>=15).collect(Collectors.toList());
		newArrList.stream().forEach(x -> System.out.println(x));
		
	}

}
