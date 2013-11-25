package collection.list;

import java.util.Stack;

/**
 * 堆栈类继承Vector，它总是对列表的尾部数据进行操作，采用了先进后出的策略，自定义了插入、查看和弹出元素三个方法。
 * @author WangRongtao
 *
 */
public class MyStack {

	public static void main(String[] args){
		//堆栈Stack类，它继承自Stack类
		Stack myStack =  new Stack();
		//插入元素，是插入到尾部
		myStack.push("aaa");
		myStack.push("bbb");
		myStack.push("ccc");
		myStack.push("ddd");
		myStack.push("aaa");
		myStack.push("ddd");
		System.out.println("堆栈中的元素是:");
		System.out.println("堆栈尾部元素: " + myStack.peek());
		System.out.println("弹出堆栈尾部元素: " + myStack.pop());
	}
}
