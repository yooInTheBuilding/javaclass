package ch11_classes.ex04_board;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BoardMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BoardService boardService = new BoardService();
        boolean run = true;
        while (run){
            System.out.println("---------------------------------------------------------");
            System.out.println("1.글작성 2.글목록 3.글조회 4.글수정 5.글삭제 6.검색 7.테스트데이터 8.종료");
            System.out.println("---------------------------------------------------------");
            System.out.print("선택>");
            String select = br.readLine();
            if (select.equals("1")){
                boardService.write();
            } else if (select.equals("2")) {
                boardService.listUp();
            } else if (select.equals("3")) {
                boardService.check();
            } else if (select.equals("4")) {
                boardService.modify();
            } else if (select.equals("5")) {
                boardService.delete();
            } else if (select.equals("6")) {
                boardService.search();
            } else if (select.equals("7")) {
                boardService.testdata();
            } else if (select.equals("8")) {
                System.out.println("종료합니다");
                run = false;
            }
        }
    }
}
