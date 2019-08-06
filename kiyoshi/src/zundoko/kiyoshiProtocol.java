package zundoko;

import java.util.Random;

public class kiyoshiProtocol {
	public static void main(String[] args) {
		String[] zundoko = { "ズン", "ドコ" };
		int z = 31;
		Random r = new Random();
		while (true) {
			z |= r.nextInt(2);
			z  = z|r.nextInt(2);
			System.out.println(zundoko[z & 1]);
			if ((z &= 31) == 1) {
				System.out.println("キ・ヨ・シ！");
				break;
			}
			z <<= 1;
		}
	}

}
