import java.util.HashMap;
import java.util.Map;
public class HashMapDemo1{
	public static void main(String args[]){
		Map<String,String> map = null;//����Map��������key��value�����Ͷ�ΪString
		map = new HashMap<String,String>();
		map.put("twing","www.twing.com");
		map.put("tianqiyubao","tianqiyubao");
		map.put("tianya","www.tianya.com");
		String val = map.get("tianya");//����keyȡ��ֵ
		System.out.println("ȡ���������ǣ�" + val);
	}
}