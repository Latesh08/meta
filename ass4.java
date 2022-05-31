package metaoercent;

public class ass4 {public static void lastDigit(String a, String b)
{
    int lastDig = (a.charAt(a.length() - 1) - '0')
                  * (b.charAt(b.length() - 1) - '0');
    System.out.println(lastDig % 10);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "1234567891233", b = "1234567891233156";
        lastDigit(a, b);
	}

}
