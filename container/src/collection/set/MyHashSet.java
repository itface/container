package collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
/**
 * （1）Set不允许重复元素，因此加入Set的Object必须定义equals()方法以确保对象的唯一性。
 * （2）HashSet采用散列函数对元素进行排序，是专门为快速查询而设计的。存入HashSet的对象必须定义hashCode()。
 * （3）TreeSet采用红黑树的数据结构进行排序元素，能保证元素的次序，使用它可以从Set中提取有序的序列。
 * 需要注意的是，生成自己的类时，Set需要维护元素的存储顺序，因此要实现Comparable接口并定义compareTo()方法。
 * （4）LinkedHashSet内部使用散列以加快查询速度，同时使用链表维护元素的插入的次序，在使用迭代器遍历Set时，结果会按元素插入的次序显示。
*/
public class MyHashSet {

	public static void main(String[] args){
		Set mySet = new HashSet();
		//Set不允许元素重复
		mySet.add("aaa");
		mySet.add("bbb");
		System.out.println("为mySet加入aaa, bbb元素后: ");
		//删除元素
		mySet.remove("aaa");
		System.out.println("mySet删除aaa元素后: ");
		//增加另外一个集合中的所有元素
		List list = new ArrayList();
		list.add("aaa");
		list.add("aaa");
		list.add("fff");
		mySet.addAll(list);
		System.out.println("mySet添加另外一个集合的所有元素后: ");
		//删除除了另外一个集合包含的以外的所有元素
		mySet.retainAll(list);
		System.out.println("mySet删除除了另外一个集合包含的以外的所有元素后: ");
		//删除另外一个集合包含的所有元素
		mySet.removeAll(list);
		System.out.println("mySet删除另外一个集合包含的所有元素后: ");
		//获取Set中元素的个数
		System.out.println("mySet中当前元素的个数: " + mySet.size());
		//判断Set中元素个数是否为0
		System.out.println("mySet中当前元素为0？  " + mySet.isEmpty());
	}
}
