package package2;

import java.util.Scanner;

public class Cxun {
	@SuppressWarnings("resource")
	public static void main(String [] args) {
		String s1="汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列土可怜光彩生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行翠华摇摇行复止西出都门百余里六军不发无奈何宛转蛾眉马前死花钿委地无人收翠翘金雀玉搔头君王掩面救不得回看血泪相和流黄埃散漫风萧索云栈萦纡登剑阁峨嵋山下少人行旌旗无光日色薄蜀江水碧蜀山青圣主朝朝暮暮情行宫见月伤心色夜雨闻铃肠断声天旋地转回龙驭到此踌躇不能去";
		int count=0;			Scanner input=new Scanner(System.in);
		System.out.println("请输入要查找的字：");
		String in=input.next();
		char[] ch=s1.toCharArray();
		char c=in.charAt(0);
		try {
		    for(int i=0;i<s1.length();i++) {
			    if (c==ch[i]) 
				    count++;
			}
		    System.out.println(c+" 字一共出现了"+count+"次");
		}
		catch(Exception e) {
			System.out.println("输入错误");
		}
		
	}
}
