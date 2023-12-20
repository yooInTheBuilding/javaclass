package ch11_classes.ex04_board;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class BoardService {
    BoardRepository boardRepository = new BoardRepository();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void write() throws IOException {
        System.out.println("-------------------------글작성-----------------------------");
        System.out.println("제목>");
        String boardTitle = br.readLine();
        System.out.print("작성자>");
        String boardWriter = br.readLine();
        System.out.print("내용>");
        String boardContents = br.readLine();
        System.out.print("비밀번호>");
        String boardPass = br.readLine();
        BoardDTO boardDTO = new BoardDTO(boardTitle, boardWriter, boardContents, boardPass);
        boardRepository.write(boardDTO);
    }

    public void listUp() {
        System.out.println("---------------------------글목록-----------------------------");
        List<BoardDTO> boardDTOList = boardRepository.boardDTOList;
        for (BoardDTO boardDTO : boardDTOList){
            System.out.println(boardDTO.toString());
        }
    }

    public void check() throws IOException{
        System.out.println("------------------------------글조회-------------------------------");
        System.out.print("글id>");
        Long id = Long.parseLong(br.readLine());
        BoardDTO boardDTO = boardRepository.check(id);
        if (boardDTO == null){
            System.out.println("해당 id는 존재하지 않습니다");
        }else {
            System.out.println("----------------id: " + boardDTO.getId() + " ---------------------");
            System.out.print("제목>");
            System.out.println(boardDTO.getBoardTitle());
            System.out.print("작성자>");
            System.out.println(boardDTO.getBoardWriter());
            System.out.print("글내용>");
            System.out.println(boardDTO.getBoardContents());
            System.out.println("조회수>");
            System.out.println(boardDTO.getHits());
        }
    }

    public void modify() throws IOException{
        System.out.println("----------------------글수정-----------------------------");
        System.out.print("글id>");
        Long id = Long.parseLong(br.readLine());
        System.out.print("비밀번호>");
        String pw = br.readLine();
        boolean checker = boardRepository.checker(id, pw);
        if (checker){
            System.out.print("수정제목>");
            String newTitle = br.readLine();
            System.out.print("수정내용>");
            String newContents = br.readLine();
            boardRepository.modify(id, newTitle, newContents);
        }else {
            System.out.println("id 혹은 pw틀렸습니다");
        }
    }

    public void delete() throws IOException{
        System.out.println("------------------------글삭제---------------------------");
        System.out.print("글id>");
        Long id = Long.parseLong(br.readLine());
        System.out.print("비밀번호>");
        String pw = br.readLine();
        boolean bool = boardRepository.deleteCheck(id, pw);
        if (bool){
            boardRepository.delete(id);
        }else {
            System.out.println("id 혹은 pw 틀림");
        }
    }

    public void search() throws IOException{
        System.out.println("----------------------------검색----------------------------");
        System.out.print("제목>");
        String title = br.readLine();
        List<BoardDTO> boardDTOList = boardRepository.search(title);
        for (int i = 0; i < boardDTOList.size(); i++){
            System.out.println("-------------------------------------------------------");
            System.out.print("id>");
            System.out.println(boardDTOList.get(i).getId());
            System.out.print("조회수>");
            System.out.println(boardDTOList.get(i).getHits());
            System.out.print("작성자>");
            System.out.println(boardDTOList.get(i).getBoardWriter());
            System.out.print("내용>");
            System.out.println(boardDTOList.get(i).getBoardContents());
        }
    }

    public void testdata() {
        for (int i = 1; i < 11; i++){
            BoardDTO boardDTO = new BoardDTO("title" + i, "writer" + i, "1234", "contents" + i);
            boardRepository.write(boardDTO);
        }
    }
}
