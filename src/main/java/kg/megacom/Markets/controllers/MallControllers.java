package kg.megacom.Markets.controllers;

import kg.megacom.Markets.dao.MallDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MallControllers {

    private MallDAO mallDAO;

    @Autowired
    public MallControllers(MallDAO mallDAO) {
        this.mallDAO = mallDAO;
    }

    @GetMapping("/malls")
    private String startPage(Model model){
        model.addAttribute("markets", mallDAO.index());
        return "index";
    }



}
