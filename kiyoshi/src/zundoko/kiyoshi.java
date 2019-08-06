package zundoko;

import java.util.Random;

public class kiyoshi {
	public static void main(String[] args) {
		String[] zundoko = { "\u30ba\u30f3", "\u30c9\u30b3", "\u30ad\u30fb\u30e8\u30fb\u30b7\uff01" };
		Random r = new Random();
		String str = new String();
		String str2 = new String();
		StringBuilder sb = new StringBuilder();
		int i;

		while (!str2.equals(zundoko[2])) {
			i = r.nextInt(zundoko.length - 1);
			//ランダム
			str = zundoko[i];
			sb.append(str);
			System.out.println(str);
			str2 = flg(sb);

		}
		System.out.println(zundoko[2]);
	}

	public static String flg(StringBuilder sb) {

		int brLoop = sb.indexOf("\u30ba\u30f3\u30ba\u30f3\u30ba\u30f3\u30ba\u30f3\u30c9\u30b3");
		if (brLoop > 0) {
			return "\u30ad\u30fb\u30e8\u30fb\u30b7\uff01";
		} else {
			return sb.toString();
		}

	}

}
