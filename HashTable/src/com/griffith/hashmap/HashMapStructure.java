package com.griffith.hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapStructure {

	public static void main(String[] args) {

		Person p1 = new Person("Joe", 25);
		Person p2 = new Person("Steve", 32);
		Person p3 = new Person("Tom", 28);
		Person p4 = new Person("Jim", 33);

		HashMap<Person, String> personHomeTownMap = new HashMap<Person, String>();
		personHomeTownMap.put(p1, "Charlotte");
		personHomeTownMap.put(p2, "Richmond");
		personHomeTownMap.put(p3, "Unknown");
		personHomeTownMap.put(p4, "Mooresville");

		Iterator<Person> personHomeTownIter = personHomeTownMap.keySet().iterator();
		System.out.println(personHomeTownMap.size());
		while (personHomeTownIter.hasNext()) {
			Person personObj = personHomeTownIter.next();
			String person = personHomeTownMap.get(personObj);
			System.out.println(personObj.getName() + ": " + person + " " + personObj.getAge());

		}

	}

}
