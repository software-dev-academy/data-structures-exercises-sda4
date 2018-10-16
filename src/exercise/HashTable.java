package exercise;

class Entry {
	Object key;
	Object value;
	Entry next;
	
	Entry(Object k, Object v, Entry n) {
		key = k;
		value = v;
		next = n;
	}
}

/**
 * Stores keys of type Object and values of type Object.
 */
public class HashTable {

	int SIZE = 256; // would not make a difference to use a difference

	Entry[] table = new Entry[SIZE];

	void put(Object key, Object value) {
		int hashValue = key.hashCode();
		int index = hashValue % SIZE;
		Entry firstEntry = table[index];
		// if hash table is empty, then firstEntry == null!!
		if (firstEntry == null) {
			Entry newEntry = new Entry(key, value, null);
			table[index] = newEntry;
		} else {
			// more complicated (to be continued..)
		}
		
	}

	/**
	 * Returns the value that the key is mapped to.
	 *
	 * @param key
	 * @return the value that key maps to.
	 */
	Object get(Object key) {
		return null; // not yet implemented
	}
}
