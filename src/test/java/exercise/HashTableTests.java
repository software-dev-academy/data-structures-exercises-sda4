package exercise;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HashTableTests {

	@Test
	void testPutAndGet() {
		HashTable ht = new HashTable();
		ht.put("kth", 15);
		int res = (int) ht.get("kth");
		assertEquals(16, res, "The value that was returned by 'get' did not match the expected value.");
	}
}
