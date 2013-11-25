package collection.list;

import java.util.ArrayList;
import java.util.HashMap;
/**
 * （1）ArrayList是最常用的List实现类，内部是通过数组实现的，它允许对元素进行快速随机访问。数组的缺点是每个元素之间不能含有“空隙”。
* 当数组大小不满足时会增加存储能力，将已有数组数据复制到新的存储空间中。当从ArrayList的中间位置插入或者删除元素时，需要对数组进行拷贝，移动，代价比较高。
* 因此，它适合随即查找和遍历，不适合插入合删除。
* 因为ArrayList和Vector都是用数组实现的，所以，在添加和插入时，最好从表尾操作，而不要从中间或者表头开始，以避免数组移动引起的开销！
 * @author WangRongtao
 *
 */
public class MyArrayList {

	public static void main(String[] args){
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		HashMap map1 = new HashMap();
		HashMap map2 = new HashMap();
		HashMap map3 = new HashMap();
		map1.put(1, "100");
		map1.put(2, "200");
		map2.put(1, "100");
		map2.put(2, "200");
		map3.put(1, "100");
		list1.add(map1);
		list2.add(map2);
		//判断列表是否包含某一元素
		//通过元素的equals方法，判断元素是否相等
		System.out.println("*****"+list1.contains(map1));
		System.out.println("*****"+list1.contains(map2));
		System.out.println("*****"+list1.contains(map3));
		System.out.println("*****"+list1.contains(list2));
		System.out.println("*****"+list1.containsAll(list2));
	}
}
