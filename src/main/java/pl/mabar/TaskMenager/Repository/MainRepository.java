package pl.mabar.TaskMenager.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.mabar.TaskMenager.Entity.Task;

@Repository
public interface MainRepository extends CrudRepository<Task, Long> {
}
