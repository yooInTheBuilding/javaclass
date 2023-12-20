package ch10_class.ex10;

public class Board {
    private long id;
    private String boardTitle;
    private String boardWriter;
    private String boardContents;
    private int boardHits;

    public void setId(long id) {
        this.id = id;
    }

    public void setBoardTitle(String boardTitle) {
        this.boardTitle = boardTitle;
    }

    public void setBoardWriter(String boardWriter) {
        this.boardWriter = boardWriter;
    }

    public void setBoardContents(String boardContents) {
        this.boardContents = boardContents;
    }

    public void setBoardHits(int boardHits) {
        this.boardHits = boardHits;
    }

    public long getId() {
        return id;
    }

    public String getBoardTitle() {
        return boardTitle;
    }

    public String getBoardWriter() {
        return boardWriter;
    }

    public String getBoardContents() {
        return boardContents;
    }

    public int getBoardHits() {
        return boardHits;
    }

    public Board(){

    }
    public Board(String boardTitle, String boardWriter){
        this.boardTitle = boardTitle;
        this.boardWriter = boardWriter;
    }

    @Override
    public String toString() {
        return "Board{" +
                "id=" + id +
                ", boardTitle='" + boardTitle + '\'' +
                ", boardWriter='" + boardWriter + '\'' +
                ", boardContents='" + boardContents + '\'' +
                ", boardHits=" + boardHits +
                '}';
    }
    public void findById(long id){
        if (this.id == id){
            boardHits++;
            System.out.println(boardContents);
        }
    }
}
