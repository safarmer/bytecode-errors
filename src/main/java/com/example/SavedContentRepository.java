package com.example;

import io.micronaut.data.annotation.Query;
import io.micronaut.data.annotation.Where;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;
import javax.validation.constraints.NotNull;

@JdbcRepository(dialect = Dialect.H2)
public interface SavedContentRepository extends CrudRepository<SavedContent, Integer> {

  @Override
  @Query("update saved_content set deleted = current_date where id = :id")
  void deleteById(@NotNull Integer id);
}
