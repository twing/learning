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

方法或常量

<table border="1">
<tr>
<td>row 1, cell 1</td>
<td>row 1, cell 2</td>
</tr>
<tr>
<td>row 2, cell 1</td>
<td>row 2, cell 2</td>
</tr>
</table>






























