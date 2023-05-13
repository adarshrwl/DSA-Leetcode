public class Removedata {
    public int[] Removesdata(int[] Given_data, int data) {
        int len = Given_data.length;
        int i;
        int j;
        for (i = 0; i < len; i++) {
            if (Given_data[i] == data) {
                break;
            }

            // 3
        }
        for (j = i; j < Given_data.length - 1; j++) {
            Given_data[j] = Given_data[j + 1];
        }
        Given_data[j] = 0;
        return Given_data;
    }
}
