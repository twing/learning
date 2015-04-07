import java.util.HashMap;
import java.util.Map;
public class HashMapDemo1{
	public static void main(String args[]){
		Map<String,String> map = null;//声明Map对象，其中key和value的类型都为String
		map = new HashMap<String,String>();
		map.put("twing","www.twing.com");
		map.put("tianqiyubao","tianqiyubao");
		map.put("tianya","www.tianya.com");
		String val = map.get("tianya");//根据key取出值
		System.out.println("取出的内容是：" + val);
	}
}