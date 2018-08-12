package io.github.benas.todolist.web.controller;

import io.github.benas.todolist.web.util.SessionData;
import io.github.todolist.core.domain.User;
import io.github.todolist.core.service.api.UserService;
import io.github.benas.todolist.web.common.form.LoginForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.Locale;

@Controller
public class SessionController {

    @Autowired
    private UserService userService;

    @Autowired
    private MessageSource messageProvider;

    @Autowired
    private SessionData sessionData;

    /**
     * *******************
     * Login methods
     * ********************
     */

    @RequestMapping("/login")
    public ModelAndView redirectToLoginPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("loginTabStyle", "active");
        modelAndView.addObject("loginForm", new LoginForm());
        modelAndView.setViewName("user/login");
        return modelAndView;
    }

    @RequestMapping(value = "/login.do", method = RequestMethod.POST)
    public ModelAndView doLogin(@Valid LoginForm loginForm, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();

        final String view = "user/login";

        if (bindingResult.hasErrors()) {
            modelAndView.addObject("error", messageProvider.getMessage("login.error.global", null, sessionData.getLocale()));
            modelAndView.setViewName(view);
            return modelAndView;
        }

        if (invalidCredentials(loginForm)) {
            modelAndView.addObject("error", messageProvider.getMessage("login.error.global.invalid", null, sessionData.getLocale()));
            modelAndView.setViewName(view);
            return modelAndView;
        }

        User user = userService.getUserByEmail(loginForm.getEmail());
        sessionData.setUser(user);
        sessionData.setLocale(Locale.ENGLISH);
        modelAndView.setViewName("redirect:/user/todos");
        return modelAndView;
    }

    private boolean invalidCredentials(LoginForm loginForm) {
        return !userService.login(loginForm.getEmail(), loginForm.getPassword());
    }

    /**
     * *******************
     * Logout method
     * ********************
     */

    @RequestMapping("/user/logout")
    public String logout(HttpSession session) {
        sessionData.setUser(null); //sessionData = null causes NPE in next login
        session.invalidate();
        return "index";
    }
}
