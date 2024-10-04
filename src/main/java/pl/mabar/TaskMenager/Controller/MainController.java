package pl.mabar.TaskMenager.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.mabar.TaskMenager.Entity.Task;
import pl.mabar.TaskMenager.Service.MainService;

@Controller
public class MainController {

    @Autowired
    MainService mainService;

    @GetMapping("/")
    public String index(Model model)
    {
        mainService.form(model);
        return "index";
    }

    @PostMapping("/save")
    public String save (@ModelAttribute Task task)
    {
        mainService.save(task);
        return "redirect:/all";
    }

    @GetMapping("/all")
    public String all (Model model)
    {
        mainService.showAllTask(model);
        return "AllTasks";
    }
}
