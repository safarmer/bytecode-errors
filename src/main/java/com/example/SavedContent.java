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
import java.util.Objects;

@MappedEntity
@Where("@.deleted is null")
public class SavedContent {

  @Id
  @GeneratedValue
  @Nullable
  private Integer id;

  @NonNull private String uid;

  @Nullable
  @DateCreated
  private Instant created;

  @Nullable
  @DateUpdated
  private Instant updated;

  @Nullable private Instant deleted;

  @Nullable
  public Integer getId() {
    return id;
  }

  public void setId(@Nullable Integer id) {
    this.id = id;
  }

  @NonNull
  public String getUid() {
    return uid;
  }

  public void setUid(@NonNull String uid) {
    this.uid = uid;
  }

  @Nullable
  public Instant getCreated() {
    return created;
  }

  public void setCreated(@Nullable Instant created) {
    this.created = created;
  }

  @Nullable
  public Instant getUpdated() {
    return updated;
  }

  public void setUpdated(@Nullable Instant updated) {
    this.updated = updated;
  }

  @Nullable
  public Instant getDeleted() {
    return deleted;
  }

  public void setDeleted(@Nullable Instant deleted) {
    this.deleted = deleted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof SavedContent)) {
      return false;
    }
    SavedContent that = (SavedContent) o;
    return Objects.equals(getId(), that.getId()) && getUid().equals(that.getUid())
        && Objects.equals(getCreated(), that.getCreated()) && Objects.equals(getUpdated(),
        that.getUpdated()) && Objects.equals(getDeleted(), that.getDeleted());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId(), getUid(), getCreated(), getUpdated(), getDeleted());
  }
}

