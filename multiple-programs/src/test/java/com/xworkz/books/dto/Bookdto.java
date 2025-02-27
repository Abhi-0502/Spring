package com.xworkz.books.dto;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "book_details")
@NamedQueries({@NamedQuery(name = "DeleteUserById",query = "delete from Bookdto dto where dto.id =: id"),@NamedQuery(name = "getbookAuthorById",query = "select books.authorname from Bookdto  books where books.id = :id"),
        @NamedQuery(name = "getpublishingYearById",query = "select books.publishingYear from com.xworkz.books.dto.Bookdto books where books.id = :id"),
        @NamedQuery(name = "getBookNameById",query = "select books.bookName from Bookdto books where books.id=:id"),@NamedQuery(name = "getbookAuthorAndbookNameById",query = "select books.authorname, books.bookName from com.xworkz.books.dto.Bookdto books where books.id = :id"),
        @NamedQuery(name = "getbookNameAndpublishingYearById" ,query = "select books.authorname, books.bookName from com.xworkz.books.dto.Bookdto books where books.id = :id")})
public class Bookdto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @GenericGenerator(name = "abhi",strategy = "increment")
//    @GeneratedValue(generator = "abhi")
    @Column(name = "book_id")
    private int id;
    @Column(name = "book_name")
    private String bookName;
    @Column(name = "author_name")
    private String authorname;
    @Column(name = "publish_year")
    private int publishingYear;
}
