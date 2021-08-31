package javaSopra;
import java.util.Arrays;
public class reorder {
	public static int[] reorderDigits(int[] arr, String orderBy) {
		 int[] results = new int[arr.length];
		 int kount = 0;

		 for (int num : arr) {
				 String numString = Integer.toString(num);
				 if (orderBy.equals("asc")) {
						 char[] charArr = numString.toCharArray();
						 Arrays.sort(charArr);
						 results[kount] = Integer.parseInt(new String(charArr));
				 } else {
						 char[] charArr = numString.toCharArray();
						 Arrays.sort(charArr);
						 results[kount] = Integer.parseInt(new StringBuilder(new String(charArr))
										 .reverse()
										 .toString());
				 }
				 kount++;
		 }

		 return results;
		}
        public static void main(String[] args) {
            int arr[]={23,681,986,435};
            String orderby="asc";
            int res[];
           res= reorderDigits(arr, orderby);
           for(int i =0;i <res.length;i++){
System.out.println(res[i]);}
        }
}