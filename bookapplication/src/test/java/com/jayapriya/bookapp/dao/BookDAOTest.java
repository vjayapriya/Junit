package com.jayapriya.bookapp.dao; 

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.jayapriya.bookapp.model.Book;

public class BookDAOTest {

	@Test
	public void testSave() {
		Book book=new Book();
		book.setName("DSP");
		book.setPrice(700f);
		book.setId(6008);
		
		BookDAO dao=new BookDAO();
		dao.save(book);
		
	}

	@Test
	public void testFindAll() {
		BookDAO dao=new BookDAO();
		List<Book>list=dao .FindAll();
		for(Book b: list){
			System.out.println(b);
		}
				
	}

}
