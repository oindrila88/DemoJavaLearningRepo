package learning.collections;

import java.util.*;

public class MapPractice
{
	public static void main(String[] args)
	{
		//HashMap allows null key, and, null value
		//HashMap does not preserve the insertion order of key
		//If the "Key" is repeated, then all the previous Entries are omitted, and, the last repeated "Entry" is kept
		//HashMap is not thread-safe, hence, fast
		Map<String, String> hashMap = new HashMap<>();
		hashMap.put("4", "Oindrila");
		hashMap.put("4", "Kasturi");
		hashMap.put("1", "Soumyajyoti");
		hashMap.put("11", null);
		hashMap.put("7", "Premanshu");
		hashMap.put(null, "Dola");
		hashMap.put("5", "Kasturi");
		
		//Get all the Keys of HashMap
		Set<String> hashMapKeys = hashMap.keySet();
		
		//Display all the values using all the keys of HashMap
		System.out.println("Values using keySet in HashMap");
		for (String key : hashMapKeys)
			System.out.println("Key : " + key + ", Value : " + hashMap.get(key));
		
		//Get all the Entries of HashMap
		Set<Map.Entry<String, String>> hashMapEntries = hashMap.entrySet();
				
		//Display all the values using all the keys of HashMap
		System.out.println("Key-Value Pair using entrySet in HashMap");
		for (Map.Entry<String, String> entry : hashMapEntries)
			System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
		
		//LinkedHashMap allows null key, and, null value
		//LinkedHashMap preserves the insertion order of key
		//If the "Key" is repeated, then all the previous Entries are omitted, and, the last repeated "Entry" is kept
		Map<String, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("4", "Oindrila");
		linkedHashMap.put("4", "Kasturi");
		linkedHashMap.put("1", "Soumyajyoti");
		linkedHashMap.put("11", null);
		linkedHashMap.put("7", "Premanshu");
		linkedHashMap.put(null, "Dola");
		linkedHashMap.put("5", "Kasturi");
		
		//Get all the Keys of LinkedHashMap
		Set<String> linkedHashMapKeys = linkedHashMap.keySet();
		
		//Display all the values using all the keys of LinkedHashMap
		System.out.println("Values using keySet in LinkedHashMap");
		for (String key : linkedHashMapKeys)
			System.out.println("Key : " + key + ", Value : " + linkedHashMap.get(key));
	
		//Get all the Entries of LinkedHashMap
		Set<Map.Entry<String, String>> linkedHashMapEntries = linkedHashMap.entrySet();
						
		//Display all the values using all the keys of LinkedHashMap
		System.out.println("Key-Value Pair using entrySet in LinkedHashMap");
			for (Map.Entry<String, String> entry : linkedHashMapEntries)
		System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
		
		//TreeMap does not allow null key, but, allow null value
		//TreeMap displays the elements in ascending sorted order of keys
		//If the "Key" is repeated, then after sorting of keys in ascending order, all the prior Entries are omitted, and, the last repeated "Entry" is kept
		Map<String, String> treeMap = new TreeMap<>();
		treeMap.put("4", "Oindrila");
		treeMap.put("9", "Kasturi");
		treeMap.put("1", "Soumyajyoti");
		treeMap.put("11", null);
		treeMap.put("7", "Premanshu");
		treeMap.put("1", "Dola");
		treeMap.put("5", "Kasturi");
		
		//Get all the Keys of TreeMap
		Set<String> treeMapKeys = treeMap.keySet();
				
		//Display all the values using all the keys of TreeMap
		System.out.println("Values using keySet in TreeMap");
		for (String key : treeMapKeys)
			System.out.println("Key : " + key + ", Value : " + linkedHashMap.get(key));
		
		//Get all the Entries of TreeMap
		Set<Map.Entry<String, String>> treeMapEntries = treeMap.entrySet();
								
		//Display all the values using all the keys of TreeMap
		System.out.println("Key-Value Pair using entrySet in TreeMap");
		for (Map.Entry<String, String> entry : treeMapEntries)
			System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
		
		//Hashtable does not allow both the null key, and, null value
		//Hashtable does not preserve the insertion order of key
		//If the "Key" is repeated, then all the previous Entries are omitted, and, the last repeated "Entry" is kept
		//Hashtable is thread-safe, hence, slow
		Map<String, String> hashtable = new Hashtable<>();
		hashtable.put("4", "Oindrila");
		hashtable.put("9", "Kasturi");
		hashtable.put("1", "Soumyajyoti");
		hashtable.put("11", "Reema");
		hashtable.put("7", "Premanshu");
		hashtable.put("1", "Dola");
		hashtable.put("5", "Kasturi");
		
		//Get all the Keys of Hashtable
		Set<String> hashtableKeys = hashtable.keySet();
		
		//Display all the values using all the keys of Hashtable
		System.out.println("Values using keySet in Hashtable");
		for (String key : hashtableKeys)
			System.out.println("Key : " + key + ", Value : " + hashtable.get(key));
		
		//Get all the Entries of Hashtable
		Set<Map.Entry<String, String>> hashtableEntries = hashtable.entrySet();
										
		//Display all the values using all the keys of Hashtable
		System.out.println("Key-Value Pair using entrySet in Hashtable");
		for (Map.Entry<String, String> entry : hashtableEntries)
			System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
		
	}
}