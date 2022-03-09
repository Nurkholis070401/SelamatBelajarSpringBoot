package id.ac.uin.latihan1.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api")
@RestController
public class IndexController {
    @GetMapping("/hello")
    public String index(@RequestParam String nama){
        return "Selamat Belajar Spring Boot ! " + nama;
    }
}
