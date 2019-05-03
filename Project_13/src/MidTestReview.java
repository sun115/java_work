// 정규표현식!
// 매치, 패턴 패키지 이용해보기

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MidTestReview {
	public static void main(String[] args) {
		String test = "98d36669000"; // = /3|6|9/
		Pattern pat = Pattern.compile("(3|6|9)");
		Matcher match = pat.matcher(test);

		int matchCount = 0;
		for (int i = 0; i < 99999; i++) {
			if (match.find()) {
				System.out.println(match.group());
				matchCount++;
			} else {
				break;
			}
		}
		System.out.println("총 매치 개수 : " + matchCount);
//		System.out.println(match.find());

	}
}
