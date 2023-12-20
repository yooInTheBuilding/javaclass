package ch10_class.ex10;

import ch10_class.ex9.Member;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BoardMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Board board = new Board();
        List<Board> boardList = new ArrayList<Board>();
        boolean runProgram = true;
        int select;
        long id = 1;
        while (runProgram){
            System.out.println("---------------------------------------------");
            System.out.println("1.글작성 2.글조회 3.종료");
            System.out.println("---------------------------------------------");
            System.out.print("선택>>");
            select = Integer.parseInt(br.readLine());
            if (select == 1){
                board = new Board();
                System.out.println("제목과 글쓴이를 입력하세요 No." + id);
                System.out.print("입력>>");
                st = new StringTokenizer(br.readLine());
                board.setBoardTitle(st.nextToken());
                board.setBoardWriter(st.nextToken());
                System.out.println("내용을 입력하세요>>");
                board.setBoardContents(br.readLine());
                board.setId(id);
                boardList.add(board);
                id++;
                System.out.println("작성 완료");
            } else if (select == 2) {
                System.out.println("조회하고 싶은 글의 번호를 입력해주세요");
                System.out.print("입력>>");

            }
        }
    }
}
