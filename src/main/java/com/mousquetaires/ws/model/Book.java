package com.mousquetaires.ws.model;

import java.math.BigDecimal;
import java.util.Date;

public class Book {
	
	private Long bookId;
	private String title;
	private String isbn;
	private BigDecimal price;
	private Date dtCreate;
	private Date dtUpdate;


	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Date getDtCreate() {
		return dtCreate;
	}
	public void setDtCreate(Date dtCreate) {
		this.dtCreate = dtCreate;
	}
	public Date getDtUpdate() {
		return dtUpdate;
	}
	public void setDtUpdate(Date dtUpdate) {
		this.dtUpdate = dtUpdate;
	}


}
