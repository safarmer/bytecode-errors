package com.example;

import io.micronaut.transaction.annotation.ReadOnly;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import java.util.Optional;
import javax.transaction.Transactional;

@Singleton
public class SavedContentService {

  private final SavedContentRepository repo;

  @Inject
  public SavedContentService(SavedContentRepository repo) {this.repo = repo;}

  @ReadOnly
  public Optional<SavedContent> find(int id) {
    return repo.findById(id);
  }

  @Transactional
  public void delete(int id) {
    repo.deleteById(id);
  }
}
