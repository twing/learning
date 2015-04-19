IO

File 类

在整个io包中，唯一与文件本身有关的类是File类，使用File类可以进行创建或删除文件等常用操作。要使用File类，则首先要观察File类的构造方法，此类的 常用构造方法如下：

public File(String pathname) -> 实例化File类时，必须设置好路径

可以发现，如果要使用一个File类，则必须向File类的构造方法中传递一个文件路径

File类中的主要方法和常量

	public static final String pathSeparator	表示路径的分隔符（windows是：";"）
	public static final String separator 	表示路径的分隔符(window 是："\")
	public File(String pathname) 	创建File类对象传入完整路径
	public boolean createNewFile() throws IOException 	创建新文件
	public boolean delete() 	删除文件
	public boolean exists()	 	判断文件是否存在
	public boolean isDirectiory() 	判断给定的路径是否是一个目录
	public long length() 	返回文件的大小
	public String[] list() 	列出指定目录的全部内容，只是列出了名称
	public File[] listFile() 	列出指定目录的全部内容，只是列出了名称 	
	public boolean mkdir() 	创建一个目录
	public boolean renameTo(File dest) 	为已有文件重新命名

<hr>

字节流和字符流

流

	在程序中所有的数据都是以流的方式进行传输或保存的，吃呢供需需要数据的时候要使用输入栏读取数据，而当程序需要将一些数据保存起来的时候，就要使用输出流完成

程序中输入输出都是以流的形式保存的，流中保存的实际上全都是字节文件

字节流与字符流

	在java.io 包中操作文件内容 的主要有两大类：字节流，字符流两类部分为输入和输出操作。在字节流中输出数据主要是使用OoutputStream完成，输入使的是inputStream，在字符流中输出主要是使用Writer类完成，输入主要是使用Reader类完成

操作流程

	在Java中IO操作也是有吸纳供应步骤的，以文件操作为例，主要的操作流程如下：A,使用File类打开一个文件 B，通过字节流或字符流的子类，指定输出的位置 C，进行读/写操作 D，关闭输入/输出

使用File类操作的时候一定要有路径的问题，注意分隔符

实际上四个操作类都是抽象类

字节流

	字节流主要是操作byte类型数据，以byte数组为准，主要操作类就是OutputStream，InputStream
	字节输出流：OutputStream
	字节输入流：InputStream

Byte是字节，肯定使用字节流操作，所有的数据基本上都可以直接使用byte数组表示出来

字节输入流OutputStream

	OutputStream是整个io包中字节输出流的最大父类，此类的定义如下：public abstract class OutputStream extends Object implements Closeable,Flushable
	此类是抽象类，如果要使用此类的话，则首先必须通过子类实例化对象，那么如果现在要操作的是一个文件，则可以使用：FileOutputStream类，通过向上转型之后，可以为OutputStream实例化

字节输出流InputStream

	既然程序可以向文件中写入内容，则就可以通过InputStream从文件中把内容读取进来，首先来看InputStream类的定义：
	public abstreact class InputStream extends Object implements Closeable
	与OutputStream 类一样，InputStream 本身也是一个抽象类，必须依靠其子类，如果现在是从文件中读取，子类肯定是FileInputStream
	观察FileInputStream类的构造方法：
	public FileInputStream(File file) throws FileNotFoundException

InputStream类常用方法
<table border="1">
<tr>
<th>方法或常量</th>
<th>类型</th>
<th>描述</th>
</tr>
<tr>
<td>public int available() throws IOException</td>
<td>普通</td>
<td>可以取得输入文件的大小</td>
</tr>
<tr>
<td>public void close() throws IOException</td>
<td>普通</td>
<td>变比输入流</td>
</tr>
<tr>
<td>public abstract int read() throws IOException</td>
<td>普通</td>
<td>读取内容，以数字的方式读取</td>
</tr>
<tr>
<td>public int read(byte[] b) throws IOException</td>
<td>普通</td>
<td>将内容读到byte数组之中，同时返回读入的个数</td>
</tr>
</table>

字符流

	在程序中一个字符等于2个字节，那么Java提供了Reader，Writer两个专门操作字符流的类
	字符输出流：Writer
	字符输入流：Reader
<table border='1'>
<tr>
<th>方法或常量</th>
<th>类型</th>
<th>描述</th>
</tr>
<tr>
<th>public abstract void close() throws IOException</th>
<th>普通</th>
<th>关闭输入流</th>
</tr>
<tr>
<th>public void write(String str) throws IOException</th>
<th>普通</th>
<th>将字符串输出</th>
</tr>
<tr>
<th>public void write(char[] cbuf) throws IOException</th>
<th>普通</th>
<th>将字符数组输出</th>
</tr>
<tr>
<th>public abstract void flush() throws IOException</th>
<th>普通</th>
<th>强制性情况缓存</th>
</tr>
</table>

字符流可以直接输出字符串，不要像字节流那样转换为字符串才可输出

字节流和字符流的区别

字节流和字符流使用是非常相似的。

字符在内存中形成的，字节流在操作的是本身，是不会用到缓冲区的，与文件本身直接操作的，而字符流在操作的时候是使用到缓冲区

字节和字符转换流

一般在操作输入输出内容的时候就需要使用字节或字符流，但是有些时候需要将字符流变为字节流的形式，或者将字节流变为字符流的形式，所以，就需要另外一组转换流的操作

在整个IO包中，实际上就是分为字节流和字符流，但是除了这两个流之外还有一组字节流-字符流的转换类

OutputStreamWriter:是Writer 的子类，将输出的字符流变为字节流，即：将一个字符流的输出对象变为字节流的输出对象
InputStreamReader:是Reader的子类，将输入的字节流变为字符流，即：将一个字节流的输入对象变为字符流的输入对象


掌握System对IO的三种支持：

	System.out
	System.err
	System.in

掌握System.out及System.err的区别

掌握输入，输出重定向

System表示系统类

<table border='1'>
<tr>
<th>System类的常量</th>
<th>描述</th>
</tr>
<tr>
<th>public static final PrintStream out</th>
<th>对应系统标准输出，一般是显示器</th>
</tr>
<tr>
<th>public static final PrintStream.err</th>
<th>错误信息输出</th>
</tr>
<tr>
<th>public static final InputStream in</th>
<th>对应着标准输入，一般是键盘</th>
</tr>
</table>






数据操作流

	在io包中，提供了两个与平台无关的数据操作流
	数据输出流（DataOutputStream）
	数据输入流（DataInputStream）
	通常数据输入流输出流会按照一定的格式将数据输出，再通过数据输入安装一定的格式将数据读入

如果要想使用数据操作流，指的肯定要由用户自己指定数据的保存格式，必须按指定好的格式保存数据，踩可以使用数据输入流将数据读取进来

DataOutputStream

	DataOutputStream是OutputStream的子类，此类的定义如下：
	public class DataOutputStream extends FileterOutputStream implements DataOutput

	此类继承自FileterOutputStream类（FileterOutputStream是OutputStream的子类）同时实现了DataOutput接口，在DataOutput接口定义了一系列的写入各种数据的方法
	DataOutputStream类的定义：
		public class DataOutputStream
		extends FileterOutputStream
		implements DataOutput
	Dataoutput接口定义了一系列的writeXxx()的操作，可以写入各种数据类型的数据。此接口的定义格式应该大致了解，便于以后学习
	要想使用DataOutputStream写入数据的话，则必须制定好数据的输出格式

数据的写入格式

数据之间使用“\n"分割，每天数据中每个内容之间使用"\t"分割

<table border='1'>
<tr>
<th>商品</th>
<th>分隔符</th>
<th>价格</th>
<th>分隔符</th>
<th>数量</th>
<th>分隔符</th>
</tr>

<tr>
<th>衬衣</th>
<th>\t</th>
<th>98.3f</th>
<th>\t</th>
<th>3</th>
<th>\n</th>
</tr>
<tr>
<th>手套</th>
<th>\t</th>
<th>30.3f</th>
<th>\t</th>
<th>2</th>
<th>\n</th>
</tr>
<tr>
<th>围巾</th>
<th>\t</th>
<th>50.5f</th>
<th>\t</th>
<th>1</th>
<th>\n</th>
</tr>
</table>


合并流：从概念上来说就是内容合并在一起

合并流的主要功能是将两个文件的内容合并成一个文件

SeueuenceInputStream类的常用方法

<table border='1'>
<tr>
<th>方法</th>
<th>类型</th>
<th>描述</th>
</tr>
<tr>
<th>public SequenceInputStream(InputStream s1.InputStream s2)</th>
<th>类型</th>
<th>使用两个输入流对象实例化本类对象</th>
</tr>
<tr>
<th>public int available() throws IOException</th>
<th>普通</th>
<th>返回文件大小</th>
</tr>
</table>

类的定义
java.lang.Object
	java.io.InputStream
		java.io.SequenceInputStream



压缩流

	在日常的使用中经常会使用到像WinRAR或WinZIP这样的压缩文件，通过这些软件可以把一个很大的文件进行压缩以方便传输
	在Java中为了减少传输时的数据量也提供了专门的压缩流，可以将文件或文件夹压缩成ZIP,JAR,GZIP等文件形式






