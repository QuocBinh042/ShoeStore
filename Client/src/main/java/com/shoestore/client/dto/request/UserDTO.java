package com.shoestore.client.dto.request;

import com.shoestore.client.dto.request.AddressDTO;
import com.shoestore.client.dto.request.CartDTO;
import com.shoestore.client.dto.request.RoleDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class UserDTO {
  private int userID;
  private String name;
  private String email;
  private String password;
  private String phoneNumber;
  private String userName;
  private String status;
  private RoleDTO role;
  private List<AddressDTO> addresses;
//  private CartDTO cart;
  private String ci;

}

