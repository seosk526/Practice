package kr.ac.kopo.kopo01.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "board_item")

public class BoardItem_Test {

	@Id
	@GeneratedValue
	@Column

	private int id;
	private String title;
	private String date;
	private String content;
	private int boardId;

	//private List<BoardItem> comments;
	
	public BoardItem_Test() {
		
	}

	public BoardItem_Test(int id) {
		this.id = id;
	}
	
	public BoardItem_Test(String title, String date, String content, int boardid) {
		this.title = title;
		this.date = date;
		this.content = content;
		this.boardId = boardid;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getBoardId() {
		return boardId;
	}

	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}

//	public List<BoardItem> getComments() {
//		return comments;
//	}
//
//	public void setComments(List<BoardItem> comments) {
//		this.comments = comments;
//	}	
}
