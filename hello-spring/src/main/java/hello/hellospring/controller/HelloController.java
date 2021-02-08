package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello") // http 의 GET/POST 의 GET 과 같은 개념 = 즉 localhost:8080/hello 와 매칭이 됨
    public String hello(Model model) { // 스프링이 Model 을 만들어서 넣어줌
        model.addAttribute("data", "hello!!"); // attributeValue의 값은 DB에서 조회에서 넣어줄 수도 있고 다양함
        return "hello"; // resources의 templates 에 위치하는 hello.html 에게 가서 랜더링하라는 의미 = 여기서 만든 모델을 html로 넘김 (ctrl + 클릭)
    }

}
