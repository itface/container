package collection.list;

import java.util.ArrayList;
import java.util.HashMap;
/**
 * ��1��ArrayList����õ�Listʵ���࣬�ڲ���ͨ������ʵ�ֵģ��������Ԫ�ؽ��п���������ʡ������ȱ����ÿ��Ԫ��֮�䲻�ܺ��С���϶����
* �������С������ʱ�����Ӵ洢�������������������ݸ��Ƶ��µĴ洢�ռ��С�����ArrayList���м�λ�ò������ɾ��Ԫ��ʱ����Ҫ��������п������ƶ������۱Ƚϸߡ�
* ��ˣ����ʺ��漴���Һͱ��������ʺϲ����ɾ����
* ��ΪArrayList��Vector����������ʵ�ֵģ����ԣ�����ӺͲ���ʱ����ôӱ�β����������Ҫ���м���߱�ͷ��ʼ���Ա��������ƶ�����Ŀ�����
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
		//�ж��б��Ƿ����ĳһԪ��
		//ͨ��Ԫ�ص�equals�������ж�Ԫ���Ƿ����
		System.out.println("*****"+list1.contains(map1));
		System.out.println("*****"+list1.contains(map2));
		System.out.println("*****"+list1.contains(map3));
		System.out.println("*****"+list1.contains(list2));
		System.out.println("*****"+list1.containsAll(list2));
	}
}
