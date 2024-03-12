package pre.assesment.ultraVoucher;

public class LogicTest {

    public String[] solution (String[] arr){
        String[] result= new String[4];
        String[] sortedArr= new String[arr.length];
        for (int i = 0 ; i < arr.length ; i++){
            for(int j = arr.length-1 ; j >= 0 ; j--){
                    sortedArr[i]=arr[i];
            }
        }
        result[0] = sortedArr[0];
        result[1] = sortedArr[1]+", " +sortedArr[3]+", " +sortedArr[4];
        result[2] = sortedArr[2]+", " +sortedArr[5];
        result[3] = sortedArr[6];

        return result;
    }
}
