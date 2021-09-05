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
import java.util.ArrayList;
import java.util.List;


@Controller
public class HomeController {

    @GetMapping(value = "")
    public String home(Model model){
        Request request=new Request();
        model.addAttribute("request",request);
        List<Request> requests=new ArrayList<>();
        model.addAttribute("listRequest",requests);
        return "tinh";
    }

    @PostMapping(value = "/kiem-tra")
    public String home(Model model,@Valid @ModelAttribute Request request,BindingResult bindingResult){
        if (bindingResult.hasErrors()){//Nếu có lỗi valid thì return luôn
            return "tinh";
        }
        List<Request> requests=RequestService.ketQua(request);
        model.addAttribute("request", request);
        model.addAttribute("listRequest",requests);
        return "tinh";
    }

}
