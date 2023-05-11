public class helptwosum {
    public static void main(String[] args) {
        int A[] = { 3, 2, 4 };
        int target = 6;
        Solution s1 = new Solution();
        int[] sol = s1.twoSum(A, target);
        System.out.println(A[sol[0]]);
        System.out.println(A[sol[1]]);

    }

}