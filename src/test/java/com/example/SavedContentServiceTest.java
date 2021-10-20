package com.example;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@MicronautTest
class SavedContentServiceTest {

  @Inject SavedContentService service;

  @Test
  void testSave() {
    var result = service.find(1);
    Assertions.assertFalse(result.isPresent());
  }
}
