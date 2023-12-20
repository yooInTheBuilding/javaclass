package ch11_classes.ex04_board;

import java.util.ArrayList;
import java.util.List;

public class BoardRepository {
    List<BoardDTO> boardDTOList = new ArrayList<BoardDTO>();

    public void write(BoardDTO boardDTO) {
        boardDTOList.add(boardDTO);
    }

    public BoardDTO check(Long id) {
        BoardDTO boardDTO = null;
        for (int i = 0; i < boardDTOList.size(); i++){
            if (boardDTOList.get(i).getId().equals(id)){
                boardDTOList.get(i).setHits(boardDTOList.get(i).getHits() + 1);
                boardDTO = boardDTOList.get(i);
            }
        }
        return boardDTO;
    }

    public boolean checker(Long id, String pw) {
        boolean bool = false;
        for (int i = 0; i < boardDTOList.size(); i++){
            if (boardDTOList.get(i).getId().equals(id) && boardDTOList.get(i).getBoardPass().equals(pw)){
                bool = true;
            }
        }
        return bool;
    }

    public void modify(Long id, String newTitle, String newContents) {
        for (int i = 0; i < boardDTOList.size(); i++){
            if (boardDTOList.get(i).getId().equals(id)){
                boardDTOList.get(i).setBoardTitle(newTitle);
                boardDTOList.get(i).setBoardContents(newContents);
                break;
            }
        }
    }

    public boolean deleteCheck(Long id, String pw) {
        boolean bool = false;
        for (int i = 0; i < boardDTOList.size(); i++){
            if (boardDTOList.get(i).getId().equals(id) && boardDTOList.get(i).getBoardPass().equals(pw)){
                bool = true;
            }
        }
        return bool;
    }

    public void delete(Long id) {
        for (int i = 0; i < boardDTOList.size(); i++){
            if (boardDTOList.get(i).getId().equals(id)){
                boardDTOList.remove(i);
            }
        }
    }

    public List<BoardDTO> search(String title) {
        List<BoardDTO> boardDTOS = new ArrayList<>();
        for (int i = 0; i < boardDTOList.size(); i++){
            if (boardDTOList.get(i).getBoardTitle().contains(title)){
                boardDTOS.add(boardDTOList.get(i));
            }
        }
        return boardDTOS;
    }
}
