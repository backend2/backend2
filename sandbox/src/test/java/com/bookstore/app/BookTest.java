package com.bookstore.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.bookstore.app.Book;
import com.bookstore.app.BookEnt;

public class BookTest {

	@Test
	public void testBookSize() {
		Book book = new Book();
		BookEnt e = book.entity();
		// set value in bean
		book.setSize(5);
		assertEquals(5, book.getSize());
		assertEquals(5, e.size.get());
		assertEquals(Integer.valueOf(5), e.size.getValue());
		assertEquals(Integer.valueOf(5), e.getPropertyValue("size"));
		// set value in prop
		e.size.set(3);
		assertEquals(3, book.getSize());
		assertEquals(3, e.size.get());
		assertEquals(Integer.valueOf(3), e.size.getValue());
		assertEquals(Integer.valueOf(3), e.getPropertyValue("size"));
		// set value in propertyValue
		e.setPropertyValue("size", Integer.valueOf(2));
		assertEquals(2, book.getSize());
		assertEquals(2, e.size.get());
		assertEquals(Integer.valueOf(2), e.size.getValue());
		assertEquals(Integer.valueOf(2), e.getPropertyValue("size"));
	}

	@Test
	public void testBookName() {
		Book book = new Book();
		BookEnt e = book.entity();
		// set value in bean
		book.setName("book1");
		assertEquals("book1", book.getName());
		assertEquals("book1", e.name.getValue());
		assertEquals("book1", e.getPropertyValue("name"));
		// set null value in bean
		book.setName(null);
		assertNull(book.getName());
		assertNull(e.name.getValue());
		assertNull(e.getPropertyValue("name"));

		// set value in prop
		e.name.setValue("book2");
		assertEquals("book2", book.getName());
		assertEquals("book2", e.name.getValue());
		assertEquals("book2", e.getPropertyValue("name"));
		//
		e.name.setValue(null);
		assertNull(book.getName());
		assertNull(e.name.getValue());
		assertNull(e.getPropertyValue("name"));

		// set value in propertyValue
		e.setPropertyValue("name", "book3");
		assertEquals("book3", book.getName());
		assertEquals("book3", e.name.getValue());
		assertEquals("book3", e.getPropertyValue("name"));
		//
		e.setPropertyValue("name", null);
		assertNull(book.getName());
		assertNull(e.name.getValue());
		assertNull(e.getPropertyValue("name"));
	}
}
