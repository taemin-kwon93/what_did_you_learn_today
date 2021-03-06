package codeUpExample;

/*년월일을 출력하는 방법은 나라마다, 형식마다 조금씩 다르다.

년월일(yyyy.mm.dd)를 입력받아,

일월년(dd-mm-yyyy)로 출력해보자.

(단, 한 자리 일/월은 0을 붙여 두자리로, 년도도 0을 붙여 네자리로 출력한다.) 


참고
출력하는 자리수를 지정하기 위해 %4d와 같은 형식을 사용할 수 있는데,
빈칸을 0으로 출력하기 위해서는 %04d와 같은 형식을 사용하면 된다.

예시
printf("%02d-%02d-%04d", d, m, y);
2014.07.15 -> 15-07-2014 
*/

import java.util.Scanner;

public class Main27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ymd = sc.nextLine();
		sc.close();
		
		String[] eachWord = ymd.split("\\.");
		
		System.out.println(eachWord[2]+"-"+eachWord[1]+"-"+eachWord[0]);
	}
}