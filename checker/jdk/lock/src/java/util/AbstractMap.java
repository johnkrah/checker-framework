package java.util;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;

import org.checkerframework.checker.nullness.qual.KeyFor;
import org.checkerframework.checker.lock.qual.*;

// Subclasses of this interface/class may opt to prohibit null elements.
public abstract class AbstractMap<K extends Object, V extends Object> implements Map<K, V> {
  protected AbstractMap() {}
  public class SimpleEntry<K extends Object, V extends Object>
      implements Map.Entry<K, V>, java.io.Serializable {
    private static final long serialVersionUID = 0;
    public SimpleEntry(K a1, V a2) { throw new RuntimeException("skeleton method"); }
    public SimpleEntry(Map.Entry<? extends K, ? extends V> a1) { throw new RuntimeException("skeleton method"); }
    @Pure public K getKey(@GuardSatisfied SimpleEntry<K,V> this) { throw new RuntimeException("skeleton method"); }
    @Pure public V getValue(@GuardSatisfied SimpleEntry<K,V> this) { throw new RuntimeException("skeleton method"); }
    public V setValue(V a1) { throw new RuntimeException("skeleton method"); }
    @Pure public boolean equals(@GuardSatisfied SimpleEntry<K,V> this,@GuardSatisfied Object a1) { throw new RuntimeException("skeleton method"); }
    @Pure public int hashCode(@GuardSatisfied SimpleEntry<K,V> this) { throw new RuntimeException("skeleton method"); }
    @SideEffectFree public String toString(@GuardSatisfied SimpleEntry<K,V> this) { throw new RuntimeException("skeleton method"); }
  }
  public class SimpleImmutableEntry<K extends Object, V extends Object>
      implements Map.Entry<K, V>, java.io.Serializable {
    private static final long serialVersionUID = 0;
    public SimpleImmutableEntry(K a1, V a2) { throw new RuntimeException("skeleton method"); }
    public SimpleImmutableEntry(Map.Entry<? extends K, ? extends V> a1) { throw new RuntimeException("skeleton method"); }
    @Pure public K getKey(@GuardSatisfied SimpleImmutableEntry<K,V> this) { throw new RuntimeException("skeleton method"); }
    @Pure public V getValue(@GuardSatisfied SimpleImmutableEntry<K,V> this) { throw new RuntimeException("skeleton method"); }
    public V setValue(V a1) { throw new RuntimeException("skeleton method"); }
    @Pure public boolean equals(@GuardSatisfied SimpleImmutableEntry<K,V> this,@GuardSatisfied Object a1) { throw new RuntimeException("skeleton method"); }
    @Pure public int hashCode(@GuardSatisfied SimpleImmutableEntry<K,V> this) { throw new RuntimeException("skeleton method"); }
    @SideEffectFree public String toString(@GuardSatisfied SimpleImmutableEntry<K,V> this) { throw new RuntimeException("skeleton method"); }
  }
  @Pure public int size(@GuardSatisfied AbstractMap<K,V> this) { throw new RuntimeException("skeleton method"); }
  @Pure public boolean isEmpty(@GuardSatisfied AbstractMap<K,V> this) { throw new RuntimeException("skeleton method"); }
  @Pure public boolean containsValue(@GuardSatisfied AbstractMap<K,V> this,@GuardSatisfied Object a1) { throw new RuntimeException("skeleton method"); }
  @Pure public boolean containsKey(@GuardSatisfied AbstractMap<K,V> this,@GuardSatisfied Object a1) { throw new RuntimeException("skeleton method"); }
  @Pure public V get(@GuardSatisfied AbstractMap<K,V> this,@GuardSatisfied Object a1) { throw new RuntimeException("skeleton method"); }
  public V put(K a1, V a2) { throw new RuntimeException("skeleton method"); }
  public V remove(Object a1) { throw new RuntimeException("skeleton method"); }
  public void putAll(Map<? extends K, ? extends V> a1) { throw new RuntimeException("skeleton method"); }
  public void clear() { throw new RuntimeException("skeleton method"); }
  @SideEffectFree public Set<K> keySet(@GuardSatisfied AbstractMap<K,V> this) { throw new RuntimeException("skeleton method"); }
  @SideEffectFree public Collection<V> values(@GuardSatisfied AbstractMap<K,V> this) { throw new RuntimeException("skeleton method"); }
  @SideEffectFree public abstract Set<Map.Entry<K,V>> entrySet(@GuardSatisfied AbstractMap<K,V> this);
  @Pure public boolean equals(@GuardSatisfied AbstractMap<K,V> this,@GuardSatisfied Object a1) { throw new RuntimeException("skeleton method"); }
  @Pure public int hashCode(@GuardSatisfied AbstractMap<K,V> this) { throw new RuntimeException("skeleton method"); }
  @SideEffectFree public String toString(@GuardSatisfied AbstractMap<K,V> this) { throw new RuntimeException("skeleton method"); }
}
