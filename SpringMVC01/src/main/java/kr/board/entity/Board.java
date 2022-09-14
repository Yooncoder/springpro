package kr.board.entity;

import lombok.Data;

@Data // - Lombok API를 이용하면 setter, getter를 쉽게 만듬
public class Board {
	private int idx;	// 번호
	private String title;	// 제목
	private String content;	// 내용
	private String writer;	// 작성자
	private String indate;	// 작성일
	private int count;	// 조회수
	// setter, getter
}