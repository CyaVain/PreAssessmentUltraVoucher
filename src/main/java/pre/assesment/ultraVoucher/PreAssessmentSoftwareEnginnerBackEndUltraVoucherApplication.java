package pre.assesment.ultraVoucher;

import org.apache.commons.logging.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PreAssessmentSoftwareEnginnerBackEndUltraVoucherApplication {

	public static void main(String[] args) {
		String[] arr = {"cook", "save", "taste", "aves", "vase", "state", "map"};

		LogicTest test = new LogicTest();
		String[] hasil = test.solution(arr);

		for(String s : hasil){
			System.out.println(s);
		}
	}
}
