package collection.list;
/**
 * Vector与ArrayList一样，也是通过数组实现的。不同的是它支持线程的同步，
 * 即一时刻只有一个线程能够写Vector，避免多线程同时写引起的不一致性。但实现同步需要很高的花费，
 * 因此，访问它比访问ArrayList慢。
 * 因为ArrayList和Vector都是用数组实现的，所以，在添加和插入时，最好从表尾操作，而不要从中间或者表头开始，以避免数组移动引起的开销！
 * @author WangRongtao
 *
 */
public class MyVector {

}
