package LV1;

public class H161990 {
	public int[] solution(String[] wallpaper) {
		int min_x=Integer.MAX_VALUE;
		int min_y=Integer.MAX_VALUE;
		int max_x=-1;
		int max_y=-1;
		for(int i=0;i<wallpaper.length;i++){
			for(int j=0;j<wallpaper[0].length();j++){
				if(wallpaper[i].charAt(j)=='#'){
					min_x = min_x>i ? i : min_x;
					min_y = min_y>j ? j : min_y;
					max_x = max_x<i ? i : max_x;
					max_y = max_y<j ? j : max_y;
				}
			}
		}

		int[] answer = {min_x,min_y,max_x+1,max_y+1};
		return answer;
	}
}