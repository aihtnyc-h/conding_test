package 백준;
/*
5
1....
..3..
.....
.4...
...9.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1996 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[][] map = new char[n][n], mine = new char[n][n];
        // 8방 탐색을 하기 위한 xy 배열에 넣기
        int[] dx = { -1, -1, -1, 0, 0, 1, 1, 1 }, dy = { -1, 0, 1, -1, 1, -1, 0, 1 };
        for (int i = 0; i < n; i++) {
            String tmp = br.readLine();
            for (int j = 0; j < n; j++)
                map[i][j] = tmp.charAt(j);
        }
        // 배열 입력받기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int cnt = 0;
                if (map[i][j] != '.') {
                    mine[i][j] = '*';
                    continue;
                }
                else
                    for (int k = 0; k < 8; k++) {
                        if (i + dx[k] < 0 || i + dx[k] >= n || j + dy[k] < 0 || j + dy[k] >= n)
                            continue;
                        if (map[i + dx[k]][j + dy[k]] > '0')
                            cnt += map[i + dx[k]][j + dy[k]] - '0';
                    }
                if (cnt < 10)
                    mine[i][j] = (char) (cnt + '0');
                else
                    mine[i][j] = 'M';
            }
        }
        for (int i = 0; i < n; i++)
            System.out.println(mine[i]);
    }
}

