package test.pivotal.pal.tracker.support;

import java.util.HashMap;
import java.util.Map;

public class MapBuilder<K, V> {

    private Map<K, V> map = new HashMap<>();

    public static MapBuilder<String, String> envMapBuilder() {
        return new MapBuilder<String, String>();
    }

    public static MapBuilder<String, Object> jsonMapBuilder() {
        return new MapBuilder<String, Object>();
    }

    public MapBuilder<K, V> put(K key, V value) {
        map.put(key, value);
        return this;
    }

    public Map<K, V> build() {
        return map;
    }
}
