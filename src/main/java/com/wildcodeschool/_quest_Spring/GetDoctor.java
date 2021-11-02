package com.wildcodeschool._quest_Spring;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

@Controller
public class GetDoctor {
    @RequestMapping("/doctor/{number}")
    @ResponseBody
    public Doctor doctor(@PathVariable int number) {

        switch(number) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                throw new ResponseStatusException(HttpStatus.SEE_OTHER);
            case 9:
                return Doctor.newDoctor("Christopher Eccleston", number);
            case 10:
                return Doctor.newDoctor("David Tennant", number);
            case 11:
                return Doctor.newDoctor("Matt Smith", number);
            case 12:
                return Doctor.newDoctor("Peter Capaldi", number);
            case 13:
                return Doctor.newDoctor("Jodie Whittaker", number);
            default:
                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Impossible to retrieve the incarnation " + number);
        }
    }
}
