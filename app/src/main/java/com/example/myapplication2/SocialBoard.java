package com.example.myapplication2;

import java.time.LocalDate;

public class SocialBoard {
    private String boardID;
    private String userID;
    private String boardTitle;
    private String boardContent;
    private String boardDate;
    private int boardLike;
    private boolean load;

    public SocialBoard(){}

    public SocialBoard(String boardID, String userID, String boardTitle, String boardContent, String boardDate, int boardLike, boolean load){
        this.boardID = boardID;
        this.userID = userID;
        this.boardTitle = boardTitle;
        this.boardContent = boardContent;
        this.boardDate = boardDate;
        this.boardLike = boardLike;
        this.load = true;
    }

    public SocialBoard(String board_id, String uid, String input_title, String input_content, LocalDate now, int boardLike) {
    }

    public String getBoardID() { return boardID;}
    public String getUserID() { return userID; }
    public String getBoardTitle() { return boardTitle; }
    public String getBoardContent() {return boardContent;}
    public String getBoardDate() {return boardDate;}
    public int getBoardLike() {return boardLike;}
    public boolean getload() {return load;}
}
