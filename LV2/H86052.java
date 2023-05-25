package LV2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class H86052 {
    // 상, 우, 하, 좌로 움직이는데 필요한 델타값
    int[] dr = {-1, 0, 1, 0}; // 상, 우, 하, 좌
    int[] dc = {0, 1, 0, -1}; // 상, 우, 하, 좌
    // 각 위치와 방향에 대한 방문 상태를 기록하는 배열
    int[][][] visited;
    // 각 위치와 방향에서의 이동 횟수를 저장하는 배열
    int[][][] moveCount;
    // 입력으로 받은 격자
    String[] grid;
    // 격자의 행과 열의 개수
    int n, m;

    // 위치와 방향, 그리고 이동 횟수 등을 표현하는 클래스
    class Point {
        int row, col, dir, count, moves;

        Point(int row, int col, int dir, int count, int moves) {
            this.row = row;
            this.col = col;
            this.dir = dir;
            this.count = count;
            this.moves = moves;
        }
    }

    public int[] solution(String[] grid) {
        this.grid = grid;
        n = grid.length;
        m = grid[0].length();
        visited = new int[n][m][4];
        moveCount = new int[n][m][4];
        List<Integer> cycles = new ArrayList<>();

        int count = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                for (int k = 0; k < 4; k++)
                    // 만약 방문하지 않은 위치라면, DFS를 시작한다.
                    if (visited[i][j][k] == 0) {
                        Stack<Point> stack = new Stack<>();
                        // 시작 위치를 스택에 넣는다.
                        stack.push(new Point(i, j, k, ++count, 1));
                        while (!stack.isEmpty()) {
                            Point p = stack.pop();

                            // 이미 방문한 위치라면, 사이클을 확인한다.
                            if (visited[p.row][p.col][p.dir] != 0) {
                                // 사이클이라면, 사이클의 길이를 저장한다.
                                if (visited[p.row][p.col][p.dir] == p.count)
                                    cycles.add(p.moves - moveCount[p.row][p.col][p.dir]);
                                continue;
                            }

                            // 방문하지 않았다면, 방문 표시를 하고 이동 횟수를 기록한다.
                            visited[p.row][p.col][p.dir] = p.count;
                            moveCount[p.row][p.col][p.dir] = p.moves;

                            // 해당 위치가 L이나 R이라면, 방향을 바꾼다.
                            if (grid[p.row].charAt(p.col) == 'L') p.dir = (p.dir + 3) % 4;
                            else if (grid[p.row].charAt(p.col) == 'R') p.dir = (p.dir + 1) % 4;

                            // 다음 위치를 계산하고, 범위를 벗어나지 않도록 조정한다.
                            int nrow = (p.row + dr[p.dir] + n) % n;
                            int ncol = (p.col + dc[p.dir] + m) % m;

                            // 다음 위치를 스택에 넣는다.
                            stack.push(new Point(nrow, ncol, p.dir, p.count, p.moves + 1));
                        }
                    }

        // 사이클의 길이를 오름차순으로 정렬한다.
        Collections.sort(cycles);
        // 리스트를 정수 배열로 변환하여 반환한다.
        return cycles.stream().mapToInt(i -> i).toArray();
    }
}