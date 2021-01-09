package LRU_cache;

import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Map;

class LRUcache {

    HashMap<String, LinkedListNode> hashMap = new HashMap<String, LinkedListNode>();

    // エントリの最大数を格納する
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

    // エントリの最大数を定義
    public LRUcache(int capacity) {
        this.capacity = capacity;
    }

}
