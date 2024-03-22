/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.se.ood.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author 911-19
 */
@Controller
public class SystemController {
    @GetMapping("/")
    public String contextRoot(){
    
    return "project_list";
    // 후치사로 .jsp를 쓰므로 .jsp는 안붙여도 된다  
    // ++ project_list.jsp 를 읽어서 html 문서를 반환
}
}
