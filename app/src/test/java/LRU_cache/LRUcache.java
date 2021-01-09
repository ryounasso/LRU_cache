package LRU_cache;

import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Map;

class LRUcache {

    HashMap<String, LinkedListNode> hashMap = new HashMap<String, LinkedListNode>();

    int capacity;

    class LinkedListNode {

        LinkedListNode next;
        LinkedListNode prev;
        String key;
        int value;

        public LinkedListNode(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public LRUcache(int capacity) {
        this.capacity = capacity;
    }

}
