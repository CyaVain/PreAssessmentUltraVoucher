package assesment.ultraVoucher;

public class Main {

	public static void main(String[] args) {
		String[] arr = {"cook", "save", "taste", "aves", "vase", "state", "map"};

		LogicTest logic = new LogicTest();
		String[] hasil = logic.solution(arr);

		for(String s : hasil){
			System.out.println(s);
		}
	}
}
