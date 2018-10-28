package tl.shop.soda.data.service;

public class UsernameExistsException extends Exception{
  UsernameExistsException(String message){
    super(message);
  }
}
