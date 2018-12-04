package ch.ehi.umleditor.application;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class MetaAttribute<K, V> {
	private Map<String,String> map = null;
	
	public MetaAttribute() {
		if (map == null) {
			map = new LinkedHashMap<String, String>();
			}
		}
	/**
	 * Adds a new value to the map. If the map already contains a value
	 * at the given key, an exception is raised. If your intent
	 * is to update the value regardless of whether it is present or not,
	 * consider using the {@link #addOrUpdate(Object, Object)} method instead.
	 *
	 * @param key the lookup key
	 * @param value the value to store
	 * @throws IllegalStateException if the map already contains a value at the given key
	 */
	
	public synchronized LinkedHashMap getMap() {
		return (LinkedHashMap) map;
	}
	public synchronized void add(String key, String value) {
		if (map.containsKey(key)) {
			JOptionPane.showMessageDialog(null, "A value for '"+key+"' is already present.");
		}
		if (value == null) {
			JOptionPane.showMessageDialog(null, "Value cannot be null.");
		}

		map.put(key, value);
	}

	/**
	 * Updates an existing value in the map. The previous value is returned.
	 * If no value was present, then an exception is raised. If your intent
	 * is to store the value regardless of whether it is present or not,
	 * consider using the {@link #addOrUpdate(Object, Object)} method instead.
	 *
	 * @param key the lookup key
	 * @param value the value to store
	 * @return the previous value
	 * @throws IllegalStateException if there was no previous value
	 */
	public synchronized String update(String key, String value) {
		if (!map.containsKey(key)) {
			JOptionPane.showMessageDialog(null, "There is no value to update for key '"+key+"'.");
		}

		if (value == null) {
			JOptionPane.showMessageDialog(null, "Value cannot be null.");
		}

		return map.put(key, value);
	}

	/**
	 * Adds a new value, or updates an existing value in the map. The previous
	 * value is returned. If no value was present, then {@code null} will be
	 * the returned value.
	 *
	 * @param key the lookup key
	 * @param value the value to store
	 * @return the previous value or {@code null}
	 */
	public synchronized String addOrUpdate(String key, String value) {
//		if (map.containsKey(key)) {
//			JOptionPane.showMessageDialog(null, "A value for '"+key+"' is already present.");
//		}
		if (value == null || key == null) {
			JOptionPane.showMessageDialog(null, "Key or Value cannot be null.");
		}
		return map.put(key, value);
	}

	/**
	 * Removes a value from the map. Returns true if a value was removed, or
	 * false if the operation had no effect.
	 *
	 * @param key the lookup key
	 * @return true if a value was removed, false otherwise
	 */
	public synchronized boolean remove(String key) {
		System.out.println(key);
		if (this.contains(key)) {
			map.remove(key);
			return true;
		}
		JOptionPane.showMessageDialog(null, "Key or Value cannot be null.");
		return false;
	}

	/**
	 * Returns true if the map contains the given key.
	 *
	 * @param key the lookup key
	 * @return true if the map contains the key, false otherwise
	 */
	public synchronized boolean contains(String key) {
		return map.containsKey(key);
	}

	/**
	 * Retrieve an element from the map. Because {@code null} values are not allowed,
	 * a returned value of {@code null} will always mean that the map did not contain
	 * the value. Therefore, a call to {@link #contains(Object)} which returns true
	 * will guarantee that a call to get(key) will always return a non-null value.
	 *
	 * @param key the lookup key
	 * @return the value stored under the given key, or null
	 */
	public synchronized String get(String key) {
		return map.get(key);
	}
	public int numberRow() {
		return map.size();
	}
}