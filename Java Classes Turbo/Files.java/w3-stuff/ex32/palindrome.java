public class palindrome {
public static void main(String[] args) {
    String str = "madam";
    String rev = "";
    int length = str.length();
    for ( int i = length - 1; i >= 0; i-- )
    rev = rev + str.charAt(i);
    if (str.equals(rev))
    System.out.println(str + " is a palindrome");
    else
    System.out.println(str + " is not a palindrome");
    }
    
}