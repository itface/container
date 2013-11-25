package collection.list;

import java.util.LinkedList;
import java.util.Stack;

/**
 * LinkedList是用链表结构存储数据的，很适合数据的动态插入和删除，随即访问和遍历速度比较慢。
 * 另外，它还提供了List没有定义的方法，专门用于操作表头和表尾元素，可以当作堆栈、队列和双向队列使用。
 * @author WangRongtao
 *
 */
public class MyLinkedList {

	public static void main(String[] args){
		//LinkedList自定义的方法
		LinkedList linklist = new LinkedList();
		//添加元素到列表头
		linklist.addFirst("fff");
		System.out.println("把fff放到列表头后：");
		//添加元素到列表尾
		linklist.addLast("eee");
		System.out.println("把eee放到列表尾后：");
		//获取表头元素
		System.out.println("列表头元素：" + linklist.getFirst());
		//获取表尾元素
		System.out.println("列表尾元素：" + linklist.getLast());
		//删除列表头的元素
		linklist.removeFirst();
		System.out.println("删除列表头元素后：");
		//删除列表尾的元素
		linklist.removeLast();
		System.out.println("删除列表尾元素后：");
	}
}
