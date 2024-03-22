/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.se.ood.control.ch03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author 911-19
 */

@Controller
@RequestMapping("/ch03")
public class CH03Controller {

    @GetMapping("/simple_page_directive")
    public String ch03(){
        return "ch03/simple_page/index";
    }

    @GetMapping("/error_page/index1")
    public String errorPage(){
        return "ch03/error_page/index1";
    }

    @GetMapping("/error_page/index2")
    public String errorPageWithErrorPage(){
        return "ch03/error_page/index2";
    }

    @GetMapping("/include")
    public String include(){
        return "ch03/include/index";
    }
        @GetMapping("/project/simple_page")
    public String simplepage(){
        return "ch03/simple_page/index";
    }
}