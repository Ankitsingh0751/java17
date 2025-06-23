package Dumppac;


import java.util.Comparator;
import java.util.List;





public class Color {
	String hue;
	int value;
	public Color(String hue, int value) {
		this.hue=hue;
		this.value=value;
	}
	public String toString() {
		return this.hue + ":" + this.value;
		
	}
	public static void main(String[] args) {
		List<Color> clrs= List.of(new Color("Red",100),
							new Color("Yellow",50),
							new Color("Red",75),
							new Color("yellow",75));
		Comparator hueSrtr = (h1,h2) -> h1.hue.compareTo(h2.hue);
		Comparator valueSrtr = (h1,h2) -> { if (h1.value >=h2.value) {
														return 1;
													} else {
														return -1;
													}
											};
		clrs.sort(hueSrtr.thenComparing(valueSrtr));
		System.out.println(clrs);
	}
}
