public class reverseodd {
	public static String reverseOdd(String str) {
				String[] words = str.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() % 2 == 0)
                result += words[i] + " ";
            else {
                result += new StringBuilder(words[i]).reverse() + " ";
            }
        }
        return result.trim();
	}
    public static void main(String[] args) {
        String str="Bananas";
       String res= reverseOdd(str);
       System.out.print(res);
    }
}