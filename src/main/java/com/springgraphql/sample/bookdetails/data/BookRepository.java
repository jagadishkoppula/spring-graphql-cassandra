package com.springgraphql.sample.bookdetails.data;

import com.springgraphql.sample.bookdetails.data.Book;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CassandraRepository<Book, String> {
}
