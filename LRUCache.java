package uma;
import java.util.*;

public class LRUCache {
    private final int capacity;
    private final LinkedHashMap<Integer, Integer> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new LinkedHashMap<>(capacity, 0.75f, true);
    }

    public int get(int key) {
        return map.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            map.put(key, value);
            return;
        }
        if (map.size() == capacity) {
            map.remove(map.keySet().iterator().next());
        }
        map.put(key, value);
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1)); 
        cache.put(3, 3);                 
        System.out.println(cache.get(2)); 
        cache.put(4, 4);                  
        System.out.println(cache.get(1)); 
        System.out.println(cache.get(3)); 
        System.out.println(cache.get(4)); 
    }
}
