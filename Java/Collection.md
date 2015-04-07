类集的作用

类集实际上是一个动态对象数组，与一般的对象数组不同，类集中的对象内容可以任意扩充

类集特征：

	高性能
	必须允许不同，类型的类集一相同的方式和高度互操作方式工作
	类集必须是容易扩展和修改的

对象数组中包含一组对象，但是对象数组使用的时候存在一个长度限制，那么类集是专门解决这中限制的，使用类集可以方便向数组中增加任意多个数据

对象数组的操作基本上都要保证对象类型的一致性，对于类集而言本身其内部的元素也应该保持一致，不管是何种类型的数据，所有的操作方式都应该是一样的，
类集框架主要接口

	collection 		是存放一组单值的对打接口，所谓的单值是指集合中的每个元素都是一个对象。一般很少会直接使用此接口直接操作
	list 	是collection接口的子接口，也是最常用的接口，此接口对collection接口进行了大量的扩充，里面的内容是允许重复的
	set 	是collection接口的子类，没有对collection 接口进行扩充，里面不允许存放重复内容
	map 	map是存放一对值的最大接口，即，接口中的每个元素都是一对，以key->value形式保存
	iterator 	集合的输出接口，用于输出集合中的内容，只能进行从前到后的单向输出
	listIterator 	是Iterator的子接口，可以进行双向输出
	Enumeration是最早的输出接口，用于输出指定集合中的内容
	SortedSet 	单值的排序接口，实现此接口的集合类，里面的内容是可以排序的，使用比较器排序
	SortedMap 	存放一对值的排序接口，实现此接口的集合类，里面的内容按照key排序，使用比较器排序
	Queue 	队列接口，此接口的子类可以实现队列操作
	Map Entry 	Map.Entry的内部接口，每个Map.Entry对象都保存着一对key->value的内容，每个Map接口中都保存多个Map.Entry接口实例 

最早时候，collection接口广泛使用的，因为EJB 2.x大量使用了Collection接口，随着发展，SUM公司将这些标准逐渐规范化，逐渐的用List和Set来代替Collection，这样可以更加清楚的表示出操作的类型

List接口与Collection接口的关系

List接口可以存放任意数据，而且List接口中内容允许重复

List接口比Collection接口强大很多，大量扩充了Collection接口的操作，

List接口的常用子类：ArrayList，Vection

如果要想使用接口，则要使用对象的多态性进行实例化的操作，那么对于List接口本身也是一样的

List接口的定义

	public interface List<E> extends Collection<E>

List子接口对Collection接口进行了大量的扩充。List接口扩展了Collection并且声明存储一系列元素的累积的特性。使用一个基于零的下标，元素可以通过它们在列表中的位置被插入和访问

一个列表可以包含重复的元素，既可以存在完全相同两个元素。除了由Collection定义的方法之外，List还定义了一些它自己的方法，这些方法总结在下标中。需要注意的是，当类集不能被修改时，其中的集中方法将引发UnsupoortedOperationException异常。的那个一个对象与另一个不兼容时，例如企图将一个不兼容的对象加入一个类集中，将产生ClassCastException异常

LinkedList表示的是一个链表的操作类，此类定义如下：

	public class LinkedList<E> extends
	AbstractSequentialList<E>implements Lint<E>,Queue<E>,Cloneable,Serializable

Queue接口是Collection的子接口，此接口定义如下：

	public interface Queue<E> extends Collection<E>



ArrayList是List中最常用的子类。


掌握ArrayList与Vector类的区别


Set接口也是Collection接口的子接口，但是Set跟List接口或Collection接口不同，不能加入重复元素

Set接口的定义：

	public interface Set<E> extends Collection<E>

Set接口的主要方法与Collection是一致的

Set接口的实例无法像List接口那样进行双向输出

Set接口的常用子类

	散列存放：HashSet
	有序存放：TreeSet

Collection就不能进行双向输出，因为没有提供get()方法，但是Set接口与Collection接口的定义一致，所以其本身也不能双向输出，

HashSet使用散列的方式存放内容，本身没有顺序



Iterator接口

	集合输出的标准操作：
	在使用集合输出的时候必须形成以下的一个思路：‘只要是碰到了集合输出的操作，就一定使用Iterator接口’，因为这是最标准的做法

Iterator接口的操作原理

	Iterator是专门的迭代输出接口，所谓的迭代输出就是将元素一个个进行判断，判断其是否有内容，如果有内容则把内容取出

Map接口

Collection的操作中之前已经发现，每次保存的对象都是一个对象，但是在Map中保存的是一对对象，对象的形式是以：key->value  的形式保存的
	比如电话本：张三 -> 1371132****
Map.Entry是Map

Map接口的常用子类：

	HashMap：无需存放的，是新的操作类，key不允许重复
	Hashtable：无需存放的，是旧的操作类，key不允许重复
	TreeMap：可以排序的Map集合，按集合中的key排序，key不允许重复
	WeekHashMap：弱引用的Map集合，当集合中的某些内容不再使用时，可以清除掉无用的数据，可以使用gc进行回收
	IdentityHashMap：key可以重复的Map集合。
















