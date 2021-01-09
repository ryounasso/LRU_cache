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
    LRUcache lrucache = new LRUcache(2);

    // エントリの最大数を格納できているかテスト
    @Test
    public void LRUキャッシュの実行() throws Exception {
        lrucache.capacity = 2;
        assertEquals(2, lrucache.capacity);
    }
}
