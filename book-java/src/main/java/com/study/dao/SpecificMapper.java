package com.study.dao;

import com.study.bean.specific.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface SpecificMapper {

    public int addBook(Book book);

    public int updateBook(Book book);

    public int deleteBook(@Param("id") String id);

    public List<Book> getBookPage(Map dataMap);

    public int getBookCount(Map dataMap);

    public int addTag(Tag tag);

    public int updateTag(Tag tag);

    public int deleteTag(@Param("id") String id);

    public List<Tag> getTagPage(Map dataMap);

    public List<Tag> getTagAll();

    public int getTagCount();

    public int addNotice(Notice notice);

    public int updateNotice(Notice notice);

    public int deleteNotice(@Param("id") String id);

    public List<Notice> getNoticePage(Map dataMap);

    public int getNoticeCount();

    public int borrowBook(@Param("id") String id);

    public int addBorrowMessage(BorrowMessage borrowMessage);

    public List<BorrowMessage> getBorrowMessagePage(Map dataMap);

    public int getBorrowMessageCount(Map dataMaps);

    public int updateBookType(Book book);

    public Book getBookById(@Param("id") String id);

    public int updateBorrowMessage(BorrowMessage borrowMessage);

    public List<BorrowMessage> getBorrowList(Map dataMap);

    public int getAllBookNum();

    public int getBookNumByStatus(@Param("status") String status);

    public List<Map> getBookTypeGroupNum();

    public List<Map> getBorrowPaiHang();

    public List<BorrowMessage> getBorrowYqMessagePage(Map dataMap);

    public int getBorrowYqMessageCount(Map dataMap);

    public int addBookShelf(BookShelf bookShelf);

    public List<BookShelf> getAllBookShelf();

    public int deleteBookShelf(BookShelf bookShelf);

    public int updateBookShelf(BookShelf bookShelf);

    public int upShelf(Book book);

    public int downShelf(Book book);

    public List<Book> getBookListByShelf(@Param("shelf") String shelf);

    public String getShelfNameByShelfId(@Param("id") String id);
}