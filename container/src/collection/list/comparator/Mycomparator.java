package collection.list.comparator;
import java.util.Comparator;




public class Mycomparator implements Comparator{

	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		/*
		KqtjModel obj1 = (KqtjModel)o1;
		KqtjModel obj2 =(KqtjModel)o2;
		String dept1 = obj1.getDeptname()==null?"":obj1.getDeptname();
		String pid1 = obj1.getPersonid()==null?"":obj1.getPersonid();
		String dept2 = obj2.getDeptname()==null?"":obj2.getDeptname();
		String pid2 = obj2.getPersonid()==null?"":obj2.getPersonid();
		if(dept1.compareTo(dept2)<0){
			return 0;
		}else if(dept1.compareTo(dept2)==0){
			if(pid1.compareTo(pid2)>=0){
				return 1;
			}else{
				return 0;
			}
		}else{
			return 1;
		}*/
		return 1;
	}
}
