package lk.ijse.springsan.Controller;


import lk.ijse.springsan.Entity.Blog;
import lk.ijse.springsan.Repositary.BlogRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/blog")
public class BlogController {


    @Autowired
    private BlogRepositary blogRepositary;

    @GetMapping("/getAllPost")
    public List<Blog> getAllPost(){
        return blogRepositary.findAll();
    }

    @PostMapping("/postAll"){
        public Blog postAll(){
        return blog;
    }

    @GetMapping("/getOnePost/{id}")
    public String  getOnePost(@PathVariable String id){
        return id;
    }

}
