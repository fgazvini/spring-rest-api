package com.mousquetaires.ws.repository;

import java.util.List;

import com.mousquetaires.ws.model.Book;


public interface BookRepository {
	
	public List<Book> getAll();
	public Book get(Long id);
	public void create(Book book);
	public void update(Book book);
	public void delete (Book book);
}
