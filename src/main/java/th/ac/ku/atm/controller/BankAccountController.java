package th.ac.ku.atm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankAccountController {
    @RequestMapping("/bankAccount")
    public String getBankAccountPage(Model model) {
        return "bankAccount";
    }

}