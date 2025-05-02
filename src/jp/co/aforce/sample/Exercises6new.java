package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class Exercises6new {
	public static void main(String[] args) {
		int j = 100000;

		Tourist tokyo = new Tourist("東京", 15 * j, 25 * j);
		Tourist osaka = new Tourist("大阪", 12 * j, 18 * j);
		Tourist kyoto = new Tourist("京都", 8 * j, 12 * j);
		Tourist fukuoka = new Tourist("福岡", 5 * j, 8 * j);
		Tourist sapporo = new Tourist("札幌", 4 * j, 6 * j);

		//		作成したクラスを方にできる
		List<Tourist> turistdate = new ArrayList<Tourist>();
		turistdate.add(tokyo);
		turistdate.add(osaka);
		turistdate.add(kyoto);
		turistdate.add(fukuoka);
		turistdate.add(sapporo);

		int total = 0;
		for (Tourist date : turistdate) {
			int subtotal = date.getDomestic() + date.getForeign();
			total += subtotal;

		}
		System.out.println("全都市の総観光客数：" + total);

		System.out.print("\n100万人を超える都市：");
		for (Tourist date : turistdate) {
			int subtotal = date.getDomestic() + date.getForeign();
			if (subtotal > 10 * j) {
				System.out.print(date.getCity() + "、");
			}

		}

		double maxratio =0;
		
		
		System.out.println("\n\n外国人観光客が最も割合が高い都市");
		for (Tourist date : turistdate) {

//			double ratio = (double) date.getForeign() / (double) (date.getDomestic() + date.getForeign());
			double ratio =date.calc();
			
			
			if(ratio>maxratio) {
				maxratio=ratio;
				System.out.println(date.getCity());
			}
		}
		System.out.println(maxratio);
	}
}
