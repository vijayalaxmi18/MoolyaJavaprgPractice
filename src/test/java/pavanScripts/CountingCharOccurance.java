package pavanScripts;

public class CountingCharOccurance {

	public static void main(String[] args) {
		String s = "java java java java";
		int totalCount = s.length();
		int actualCount = s.replace("j", "").length();
		int count = totalCount - actualCount;
		System.out.println(count);
	}

}
