/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package LRU_cache;

import org.junit.Test;

import jdk.jfr.Timestamp;

import static org.junit.Assert.*;
import java.util.LinkedHashMap;
import java.util.Map;

// テストコード
public class AppTest {
    LRUCache lrucache = new LRUCache(2);

    @Test
    public void LRUキャッシュの実行() throws Exception {
        lrucache.capacity = 2;
        lrucache.put("テスト", 1);
        lrucache.get("テスト");
        assertEquals(1, lrucache.get("テスト"));
    }
}
