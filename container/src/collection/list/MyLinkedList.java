package collection.list;

import java.util.LinkedList;
import java.util.Stack;

/**
 * LinkedList��������ṹ�洢���ݵģ����ʺ����ݵĶ�̬�����ɾ�����漴���ʺͱ����ٶȱȽ�����
 * ���⣬�����ṩ��Listû�ж���ķ�����ר�����ڲ�����ͷ�ͱ�βԪ�أ����Ե�����ջ�����к�˫�����ʹ�á�
 * @author WangRongtao
 *
 */
public class MyLinkedList {

	public static void main(String[] args){
		//LinkedList�Զ���ķ���
		LinkedList linklist = new LinkedList();
		//���Ԫ�ص��б�ͷ
		linklist.addFirst("fff");
		System.out.println("��fff�ŵ��б�ͷ��");
		//���Ԫ�ص��б�β
		linklist.addLast("eee");
		System.out.println("��eee�ŵ��б�β��");
		//��ȡ��ͷԪ��
		System.out.println("�б�ͷԪ�أ�" + linklist.getFirst());
		//��ȡ��βԪ��
		System.out.println("�б�βԪ�أ�" + linklist.getLast());
		//ɾ���б�ͷ��Ԫ��
		linklist.removeFirst();
		System.out.println("ɾ���б�ͷԪ�غ�");
		//ɾ���б�β��Ԫ��
		linklist.removeLast();
		System.out.println("ɾ���б�βԪ�غ�");
	}
}
