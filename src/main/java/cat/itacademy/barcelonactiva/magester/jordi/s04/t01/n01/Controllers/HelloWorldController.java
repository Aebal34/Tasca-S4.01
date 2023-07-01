package cat.itacademy.barcelonactiva.magester.jordi.s04.t01.n01.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String greetings(@RequestParam(defaultValue = "UNKNOWN") String name){

        return "Hello "+name+". You are executing a Maven project.";
    }

    @GetMapping({"/HelloWorld2", "/HelloWorld2/{name}"})
    public String greetings2(@PathVariable(required = false) String name){

        return "Hello "+name+". You are executing a Maven project.";
    }

}
