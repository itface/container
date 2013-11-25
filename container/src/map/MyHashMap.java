package map;
/**
 * * Map用于存储键值对，不允许键重复，值可以重复。
	 * （1）HashMap是一个最常用的Map，它根据键的hashCode值存储数据，根据键可以直接获取它的值，具有很快的访问速度。
	 * HashMap最多只允许一条记录的键为null，允许多条记录的值为null。
	 * HashMap不支持线程的同步，即任一时刻可以有多个线程同时写HashMap，可能会导致数据的不一致。
	 * 如果需要同步，可以用Collections.synchronizedMap(HashMap map)方法使HashMap具有同步的能力。
 * @author WangRongtao
 *
 */
public class MyHashMap {

}
