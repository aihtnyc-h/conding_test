package LV2;

public class H12905 {
    public int solution(int [][]board)
    {
        // 최소 크기가 1인 정사각형을 찾기 위한 초기값 설정
        int answer = 0;

        // 행과 열의 크기를 저장
        int row = board.length;
        int col = board[0].length;

        // 만약 행 또는 열의 크기가 1이라면 가장 큰 정사각형의 크기는 board의 최대값이 된다.
        if(row < 2 || col < 2){
            for(int i=0; i<row; i++)
                for(int j=0; j<col; j++)
                    // 만약 1을 찾았다면, 그 자체가 가장 큰 정사각형이므로 1을 반환한다.
                    if(board[i][j] == 1)
                        return 1;
        }

        // 동적 프로그래밍을 이용하여 각 위치에서 만들 수 있는 최대 정사각형의 한 변의 길이를 구한다.
        for(int i=1; i<row; i++){
            for(int j=1; j<col; j++){
                /* 현재 위치의 값이 1이고,
                 * 현재 위치를 오른쪽 하단 모서리로 하는 정사각형이 만들어질 수 있다면
                 * (왼쪽, 위쪽, 왼쪽 위 대각선 위치 중 최소값 + 1)을 현재 위치에 저장한다. */
                if(board[i][j] == 1){
                    board[i][j] = Math.min(board[i-1][j], Math.min(board[i][j-1], board[i-1][j-1])) + 1;
                    // 가장 큰 정사각형 한 변의 길이를 갱신한다.
                    answer = Math.max(answer, board[i][j]);
                }
            }
        }
        // 가장 큰 정사각형의 넓이를 반환한다.
        return answer*answer;
    }
}
