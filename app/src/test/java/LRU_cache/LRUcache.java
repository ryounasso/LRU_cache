package LRU_cache;

import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Map;

class LRUcache {

    HashMap<String, LinkedListNode> hashMap = new HashMap<String, LinkedListNode>();

    int capacity;

    public LRUcache(int capacity) {
        this.capacity = capacity;
    }
}
