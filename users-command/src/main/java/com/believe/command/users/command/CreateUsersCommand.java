package com.believe.command.users.command;

import com.believe.api.users.model.SocialAccountType;
import com.believe.api.users.model.UsersId;
import lombok.Data;
import org.axonframework.commandhandling.TargetAggregateIdentifier;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * <p> The describe </p>
 *
 * @author Li Xingping
 */
@Data
public class CreateUsersCommand {

  @NotNull
  @TargetAggregateIdentifier
  private final UsersId identifier;
  @NotNull
  private SocialAccountType socialAccountType;
  @NotBlank
  private final String username;
  private String passwordHash;

  public CreateUsersCommand(String username, String passwordHash) {
    this.username = username;
    this.passwordHash = passwordHash;
    this.identifier = new UsersId();
  }

}
