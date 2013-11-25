package collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
/**
 * ��1��Set�������ظ�Ԫ�أ���˼���Set��Object���붨��equals()������ȷ�������Ψһ�ԡ�
 * ��2��HashSet����ɢ�к�����Ԫ�ؽ���������ר��Ϊ���ٲ�ѯ����Ƶġ�����HashSet�Ķ�����붨��hashCode()��
 * ��3��TreeSet���ú���������ݽṹ��������Ԫ�أ��ܱ�֤Ԫ�صĴ���ʹ�������Դ�Set����ȡ��������С�
 * ��Ҫע����ǣ������Լ�����ʱ��Set��Ҫά��Ԫ�صĴ洢˳�����Ҫʵ��Comparable�ӿڲ�����compareTo()������
 * ��4��LinkedHashSet�ڲ�ʹ��ɢ���Լӿ��ѯ�ٶȣ�ͬʱʹ������ά��Ԫ�صĲ���Ĵ�����ʹ�õ���������Setʱ������ᰴԪ�ز���Ĵ�����ʾ��
*/
public class MyHashSet {

	public static void main(String[] args){
		Set mySet = new HashSet();
		//Set������Ԫ���ظ�
		mySet.add("aaa");
		mySet.add("bbb");
		System.out.println("ΪmySet����aaa, bbbԪ�غ�: ");
		//ɾ��Ԫ��
		mySet.remove("aaa");
		System.out.println("mySetɾ��aaaԪ�غ�: ");
		//��������һ�������е�����Ԫ��
		List list = new ArrayList();
		list.add("aaa");
		list.add("aaa");
		list.add("fff");
		mySet.addAll(list);
		System.out.println("mySet�������һ�����ϵ�����Ԫ�غ�: ");
		//ɾ����������һ�����ϰ��������������Ԫ��
		mySet.retainAll(list);
		System.out.println("mySetɾ����������һ�����ϰ��������������Ԫ�غ�: ");
		//ɾ������һ�����ϰ���������Ԫ��
		mySet.removeAll(list);
		System.out.println("mySetɾ������һ�����ϰ���������Ԫ�غ�: ");
		//��ȡSet��Ԫ�صĸ���
		System.out.println("mySet�е�ǰԪ�صĸ���: " + mySet.size());
		//�ж�Set��Ԫ�ظ����Ƿ�Ϊ0
		System.out.println("mySet�е�ǰԪ��Ϊ0��  " + mySet.isEmpty());
	}
}
