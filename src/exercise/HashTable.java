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

	int SIZE = 16; // would not make a difference to use a difference

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
			// firstEntry != null
			Entry current = firstEntry;
			while (current.next != null && current.key != key) {
				current = current.next;
			}
			// two cases: either current is the last entry, or
			// key in entry matches given key
			if (current.key == key) {
				current.value = value;
			} else {
				current.next = new Entry(key, value, null);
			}
		}
		
	}

	/**
	 * Returns the value that the key is mapped to.
	 *
	 * @param key
	 * @return the value that key maps to.
	 */
	Object get(Object key) {
		int hashValue = key.hashCode();
		int index = hashValue % SIZE;
		Entry current = table[index];
		while (current.next != null && current.key != key) {
			current = current.next;
		}
		// two cases: either key matches (HURRAY!), or
		// not found (and we're at the last entry)
		if (current.key == key) {
			return current.value;
		} else {
			return null;
		}
	}
}
