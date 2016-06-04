package com.griffith.arraylist;
import java.util.ArrayList;

public class ArrayListBuilder {

	private Person[] personArray01;
	private Person[] personArray02;
	
	public ArrayListBuilder(Person[] personArray01,  Person[] personArray02)
	{
		this.personArray01 = personArray01;
		this.personArray02 = personArray02;
	}
	
	public ArrayList<String> buildPersonStringList()
	{
		ArrayList<String> mergedList = new ArrayList<>();
		for(Person p: personArray01)
		{
			mergedList.add(p.getName());
		}
		for(Person p: personArray02)
		{
			mergedList.add(p.getName());
		}
		return mergedList;
	}
	
}
