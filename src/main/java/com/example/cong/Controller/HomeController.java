package com.example.cong.Controller;

import com.example.cong.model.Request;
import com.example.cong.service.RequestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;


@Controller
public class HomeController {

    @GetMapping(value = "")
    public String home(Model model){
        Request request=new Request();
        model.addAttribute("request",request);
        return "tinh";
    }

    @PostMapping(value = "/kiem-tra")
    public String home(Model model,@Valid @ModelAttribute Request request,BindingResult bindingResult){
        if (bindingResult.hasErrors()){//Nếu có lỗi valid thì return luôn
            return "tinh";
        }
        RequestService.ketQua(request);
        model.addAttribute("request", request);
        return "tinh";
    }

}
