package programas.clear;

public class FindPosition {


    public static void main(String[] args) {
        String input = "(1,3)-(2,5)";
        // disvisionDesh = (1,3),    (2,5);
        // 1,3  2,5
        String[] inputDesh = divisionDesh(input);
        int[] fist = divisionInt(divisionComma(inputDesh[0]));
        int[] second = divisionInt(divisionComma(inputDesh[1]));


        // fist = {1,3}
        // second = {2,5}

        //calculation (fist second) => 계산값

     //   System.out.println(calculation(divisionDesh(input)));
    }

    private static int[] divisionInt(String divisionComma) {
        String[] a = divisionComma.split(",");
        int[] a2 = new int[2];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = Integer.parseInt(a[i]);
        }
        return a2;
    }


    public static String divisionComma(String a) {
        return a.substring(1,a.length()-1);
    }

    // 하드코딩하지마라
    // 어려우면 처음부터 싹 날리고 해보자.
    public static double calculation(String[] input){
        double[] numResult = new double[2];
        for (int i = 0; i < input.length; i++) {
            double input1 = Integer.parseInt(input[0].substring(2*i+1,2*i+2)); //1,2 / 3,4
            double input2 = Integer.parseInt(input[1].substring(2*i+1,2*i+2));
            numResult[i] = input2 - input1;
        }
        return Math.sqrt( Math.pow(numResult[0],2) + Math.pow(numResult[1],2));
    }

    public static String[] divisionDesh(String input){
        return input.split("-");
    }
}
