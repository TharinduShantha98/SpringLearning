package lk.ijse.spring.controller;


import lk.ijse.spring.Dto.CustomerDto;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("form")
public class FormDataController {

    @PostMapping
    public String test1( @ModelAttribute CustomerDto customerDto) {
        return "request received " + customerDto.toString();

    }
}
