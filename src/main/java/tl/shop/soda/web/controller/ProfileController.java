package tl.shop.soda.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
import tl.shop.soda.data.entity.UserAccount;
import tl.shop.soda.service.exception.useraccount.EmailExistsException;
import tl.shop.soda.data.service.RegistrationService;
import tl.shop.soda.service.exception.useraccount.UsernameExistsException;
import tl.shop.soda.web.model.UserModel;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/profile")
public class ProfileController {

  private final RegistrationService registrationService;

  @Autowired
  public ProfileController(RegistrationService registrationService) {
    this.registrationService = registrationService;
  }

  @GetMapping(value = "/registration")
  public String showRegistration(WebRequest request, Model model) {
    UserModel userModel = new UserModel();
    model.addAttribute("user", userModel);
    return "registration";
  }

  @PostMapping(value = "/registration")
  public ModelAndView registerUserAccount(
      @ModelAttribute("user") @Valid UserModel userModel,
      BindingResult result,
      WebRequest request,
      Errors errors) {

    var registered = new UserAccount();
    if (!result.hasErrors()) {
      try {
        registered = registrationService.registerNewUserAccount(userModel);
        if (registered != null) return new ModelAndView("successRegister", "user", userModel);
      } catch (EmailExistsException e) {
        result.rejectValue("email", "message.regError");
      } catch (UsernameExistsException e) {
        result.rejectValue("username", "message.regError");
      }
    }
    return new ModelAndView("registration", "user", userModel);
  }
}
