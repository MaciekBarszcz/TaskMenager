package pl.mabar.TaskMenager.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import pl.mabar.TaskMenager.Entity.Task;
import pl.mabar.TaskMenager.Repository.MainRepository;



@Service
public class MainService {
    @Autowired
    MainRepository mainRepository;

    public void form (Model model)
    {

        model.addAttribute("Task", new Task());
    }

    public void save(@ModelAttribute Task task)
    {
        mainRepository.save(task);
    }

    public void showAllTask (Model model)
    {
       Iterable<Task> AllTask = mainRepository.findAll();
       model.addAttribute("AllTasks", AllTask);

    }

}
