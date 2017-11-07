package com.believe.api.users.event;

import com.believe.api.users.model.UsersId;
import lombok.Value;

import java.io.Serializable;

/**
 * <p> The describe </p>
 *
 * @author Li Xingping
 */
@Value
public class UsersCreatedEvent implements Serializable {

  private final UsersId identifier;
  private final String username;
  private final String password;

}
