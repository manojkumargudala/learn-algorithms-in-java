package com.manoj.singleclassprojects;

import java.util.Properties;

class MyHashMap {

	Properties prop;

	/** Initialize your data structure here. */
	public MyHashMap() {
		prop = new Properties();
	}

	/** value will always be non-negative. */
	public void put(final int key, final int value) {
		prop.put(key, value);
	}

	/**
	 * Returns the value to which the specified key is mapped, or -1 if this map
	 * contains no mapping for the key
	 */
	public int get(final int key) {
		if (prop.getProperty(key + "") == null) {
			return -1;
		} else {
			return Integer.parseInt(prop.getProperty(key + ""));
		}
	}

	/**
	 * Removes the mapping of the specified value key if this map contains a
	 * mapping for the key
	 */
	public void remove(final int key) {
		prop.remove(key);
	}
}

/**
 * Your MyHashMap object will be instantiated and called as such: MyHashMap obj
 * = new MyHashMap(); obj.put(key,value); int param_2 = obj.get(key);
 * obj.remove(key);
 */