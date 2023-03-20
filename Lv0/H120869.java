package Lv0;

public class H120869 {
	public static int solution(String[] spell, String[] dic) {
		int answer=0;
		for(int i=0; i<dic.length; i++) {               //dic의 길이만큼 for문을 돌림
			int check=0;                                //확인용 변수
			for(int j=0; j<spell.length; j++) {         //spell의 길이만큼 for문을 돌림
				if(dic[i].indexOf(spell[j])==-1) {      //만약 spell의 j번째 알파벳이 dic의 i번째 단어에 포함이 안되어있으면
					check=-1;                           //check를 -1로
					answer=2;                           //answer를 2로 초기화 하고
					break;                              //for문 즉시 종료
				}
			}
			if(check==0) {
				answer=1;
				break;
			}
		}
		return answer;
	}
	public static void main(String[] args){
		String[] spell = {"p", "o", "s"};
		String[] dci = {"sod", "eocd", "qixm", "adio", "soo"};
		System.out.println(solution(spell, dci));
	}
}
