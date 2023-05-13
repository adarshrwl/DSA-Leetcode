public class Help {
    public static void main(String[] args) {
        Removedata rd = new Removedata();
        int[] Given_data = { 1, 2, 3, 4, 5, 6, 7, 9, 10 };
        int pos = 3;
        int[] newArray = rd.Removesdata(Given_data, pos);
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }
}
