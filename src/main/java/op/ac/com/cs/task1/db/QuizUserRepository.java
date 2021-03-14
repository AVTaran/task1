package op.ac.com.cs.task1.db;



import op.ac.com.cs.task1.models.QuizUser;
import org.springframework.data.repository.CrudRepository;

public interface QuizUserRepository  extends CrudRepository<QuizUser, String> {
}
