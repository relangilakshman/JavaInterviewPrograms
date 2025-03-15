package practicetest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamProgram {
public static void main(String[] args) {
	List<String> names=Arrays.asList("Ram","Lakshman","Kalyan");
	
	List<String> filteredNames= names.stream()  //stream created
			                     .filter(name -> name.startsWith("R"))
			                     .map(String::toUpperCase)
			                     .collect(Collectors.toList());
	System.out.println(filteredNames);
}
}
