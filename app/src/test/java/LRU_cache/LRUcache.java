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
        if (hashMap.containsKey(key) == false) {
            if (isFull() == true) {
                hashMap.remove(tail.key);
                removeNode(tail);
            }
            node = new LinkedListNode(key, value);
            hashMap.put(key, node);
        } else {
            node = hashMap.get(key);
            node.value = value;
            hashMap.put(key, node);
            removeNode(node);
        }
        ToHead(node);
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
        removeNode(node);
        ToHead(node);
        return node.value;
    }

    // エントリの削除
    void remove(String key) {
        LinkedListNode node = hashMap.get(key);
        hashMap.remove(key);
        removeNode(node);
    }

    // エントリの順番を更新
    void ToHead(LinkedListNode node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    // エントリをリストから削除
    void removeNode(LinkedListNode node) {
        if (node == head && node == tail) {
            head = null;
            tail = null;
        } else if (node == head) {
            head = node.next;
            head.prev = null;
        } else if (node == tail) {
            tail = node.prev;
            tail.next = null;
        } else {
            LinkedListNode prev = node.prev;
            LinkedListNode next = node.next;
            prev.next = next;
            next.prev = prev;
        }
    }

    // エントリが最大数の達したかどうかを確認
    boolean isFull() {
        return hashMap.size() == this.capacity;
    }
}
