package com.griffith.arraylist;

import java.util.ArrayList;

public class ArrayListStructure {

	public static void main(String[] args) {

		Person p1 = new Person("Joe", 25);
		Person p2 = new Person("Steve", 32);
		Person p3 = new Person("Tom", 28);
		Person p4 = new Person("Jim", 33);

		ArrayList<Person> personList = new ArrayList<>();
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		personList.add(p4);

		for(Person p: personList)
		{
			System.out.println(p.getName() + ": " + p.getAge());
		}
				
		Person[] personArray01 = new Person[2];		
		personArray01[0] = p1;
		personArray01[1] = p2;
		
		Person[] personArray02 = new Person[2];
		personArray02[0] = p3;
		personArray02[1] = p4;
		
		ArrayListBuilder mergedPersonNameList = new ArrayListBuilder(personArray01, personArray02);
		ArrayList<String> mergedList = mergedPersonNameList.buildPersonStringList();
		for(String person: mergedList)
		{
			System.out.println(person);
		}
	}

}
