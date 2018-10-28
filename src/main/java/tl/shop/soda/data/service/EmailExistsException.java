package tl.shop.soda.data.service;

public class EmailExistsException extends Exception {

  EmailExistsException(String message){
    super(message);
  }
}
