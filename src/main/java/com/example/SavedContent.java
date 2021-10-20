package com.example;


import io.micronaut.core.annotation.NonNull;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.data.annotation.DateCreated;
import io.micronaut.data.annotation.DateUpdated;
import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.annotation.Where;
import java.time.Instant;

@MappedEntity
@Where("@.deleted is null")
public record SavedContent(
    @Id @GeneratedValue @Nullable Integer id,
    @NonNull String uid,
    @Nullable @DateCreated Instant created,
    @Nullable @DateUpdated Instant updated,
    @Nullable Instant deleted
) {

  public SavedContent(String uid) {
    this(null, uid, null, null, null);
  }
}

