package codeUpExample;
/* https://codeup.kr/problem.php?id=1008
 * 
 * 이번에는 특수문자를 출력하는 연습을 해보자.
키보드로 입력할 수 없는 다음 모양을 출력해보자.
(** 참고 : 운영체제의 문자 시스템에 따라 아래와 같은 모양이 출력되지 않을 수 있다.)
┌┬┐
├┼┤
└┴┘

참고
다음과 같은 유니코드로 특수문자를 표현한다고 하자.
(운영체제 또는 컴파일러에 따라 사용되는 문자의 코드표가 다르다.)

윈도우에서는 "ㅂ+한자" 키를 누르면 선문자를 입력할 수 있다.
선문자를 이용하면 일반적인 텍스트 모드화면(메모장 등)에서도 표를 그릴 수 있다.
유니코드 특수문자를 출력하는 방법,
...
printf("\u250C\u252C\u2510\n");
...
┌┬┐
├┼┤
└┴┘
을 그려 출력하면 표처럼 선이 붙어 출력된다.
CLI 명령어 입출력 화면에서 표나 그림을 그리기 위해 사용되던 방법과 비슷하다.
** 주의 : 본 화면에서 복사하여 붙여넣기하면 제대로 되지 않을 수 있으니 직접 소스코드를 작성해 넣어야 한다.*/
public class Main8 {

	public static void main(String[] args) {
		System.out.println("\u250C\u252C\u2510");
		System.out.println("\u251C\u253C\u2524");
		System.out.println("\u2514\u2534\u2518");
	}
}
