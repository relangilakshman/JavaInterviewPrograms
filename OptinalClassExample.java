package practicetest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptinalClassExample {
	public static void main(String[] args) {
		//List<String> arrNames=new ArrayList<String>();
		
		String name="Rajesh";
		Optional<String> optinalName=Optional.ofNullable(name);
		
		String nullName=null;
		Optional<String> nullOptionalName=Optional.ofNullable(nullName);
		
		if(optinalName.isPresent()) {
			System.out.println("Name is present: " + optinalName.get());
		}
		else {
			System.out.println("Name is absent");
		}
		
		try {
			
			String nameOrThrow=nullOptionalName.orElseThrow(
					()-> new IllegalArgumentException("Name Cannot be null"));
					
		} catch (IllegalArgumentException e) {
		    System.out.println("Caught Exception " + e.getMessage());
		}
	}

}
