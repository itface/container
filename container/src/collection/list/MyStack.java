package collection.list;

import java.util.Stack;

/**
 * ��ջ��̳�Vector�������Ƕ��б��β�����ݽ��в������������Ƚ�����Ĳ��ԣ��Զ����˲��롢�鿴�͵���Ԫ������������
 * @author WangRongtao
 *
 */
public class MyStack {

	public static void main(String[] args){
		//��ջStack�࣬���̳���Stack��
		Stack myStack =  new Stack();
		//����Ԫ�أ��ǲ��뵽β��
		myStack.push("aaa");
		myStack.push("bbb");
		myStack.push("ccc");
		myStack.push("ddd");
		myStack.push("aaa");
		myStack.push("ddd");
		System.out.println("��ջ�е�Ԫ����:");
		System.out.println("��ջβ��Ԫ��: " + myStack.peek());
		System.out.println("������ջβ��Ԫ��: " + myStack.pop());
	}
}
