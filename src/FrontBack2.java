public class FrontBack2 {
  public String frontBack(String str) {
    String result = "";

    if (str.length() <= 1) {
      return str;
    }
    result = str.charAt(str.length() - 1) + str.substring(1, str.length() -1) +
        str.charAt(0);
    return result;
  }
}
