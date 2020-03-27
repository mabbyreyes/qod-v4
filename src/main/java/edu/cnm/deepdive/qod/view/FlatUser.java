package edu.cnm.deepdive.qod.view;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import edu.cnm.deepdive.qod.model.entity.User.Role;
import java.net.URI;
import java.util.Date;
import java.util.UUID;
import org.springframework.lang.NonNull;

@JsonPropertyOrder({"id", "created", "updated", "displayName", "href"})
public interface FlatUser {

  UUID getId();

  Date getCreated();

  Date getUpdated();

  @NonNull
  String getDisplayName();

  @NonNull
  Role getRole();

  URI getHref();

}
