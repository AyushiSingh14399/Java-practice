package javaSopra;

public class ascString {
    
    public static boolean ascending(String str) {
          for(int digits = 1; digits < str.length(); digits++){
              boolean ascending = true;
              String curNum = str.substring(0, digits);
              long curNumInt = Long.parseLong(curNum);
              String curTestStr = str.substring(digits);
              while(curTestStr.length() > 0) {
                  long nextNum = curNumInt+1;
                  String nextNumStr = ""+nextNum;
                  if (curTestStr.indexOf(nextNumStr) != 0) {
                      ascending = false;
                      break;
                  }
                  curNumInt = nextNum;
                  curTestStr = curTestStr.substring(digits);
              }
              if (ascending) {
                  return true;
              }
          }
          return false;
    }
    public static void main(String[] args) {
        String s="242526";
      boolean r=  ascending(s);
      System.out.println(r);
    }
  }