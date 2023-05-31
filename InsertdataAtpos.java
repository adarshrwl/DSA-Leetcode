public class InsertdataAtpos {
    public static int[] insertData(int[] array, int data, int position) {
        int[] newArray = new int[array.length + 1];

        for (int i = 0, j = 0; i < newArray.length; i++, j++) {
            if (i == position) {
                newArray[i] = data;
                j--;
            } else {
                newArray[i] = array[j];
            }
        }

        return newArray;
    }
}
