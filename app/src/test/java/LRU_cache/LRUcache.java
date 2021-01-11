package LRU_cache;

import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Map;

class LRUcache {

    HashMap<String, LinkedListNode> hashMap = new HashMap<String, LinkedListNode>();

    LinkedListNode head = null;
    LinkedListNode tail = null;

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

    // エントリのセット
    void put(String key, int value) {
        LinkedListNode node;
        node = new LinkedListNode(key, value);
        hashMap.put(key, node);
    }

    // エントリをセットできているかの確認
    boolean print(String key) {
        return hashMap.containsKey(key);
    }

    // キーに対応する値を取得
    int get(String key) {
        if (hashMap.containsKey(key) == false) {
            return -1;
        }
        LinkedListNode node = hashMap.get(key);
        return node.value;
    }

    // エントリの削除
    int remove(String key) {
        LinkedListNode node = hashMap.get(key);
        hashMap.remove(key);
        return node.value;
    }
}
