package com.sac.interviewQuestions;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class CustomMapToCountMethodCalls<K, V> implements Map<K, V> {

	private final Map<K, V> map; // map being decorated

	private int putCount;
	private int putAllCount;
	private int putIfAbsentCount;

	public CustomMapToCountMethodCalls(Map<K, V> map) {
		this.map = map;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clear() {
		map.clear();

	}

	@Override
	public boolean containsKey(Object key) {
		return map.containsKey(key);
	}

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<java.util.Map.Entry<K, V>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<K> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V put(K key, V value) {
		putCount++;
		return map.put(key, value);
	}

	@Override
	public void putAll(Map<? extends K, ? extends V> m) {
		putAllCount++;
		map.putAll(m);

	}

	@Override
	public V remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection<V> values() {
		// TODO Auto-generated method stub
		return null;
	}

}

