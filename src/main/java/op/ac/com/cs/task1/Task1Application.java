package op.ac.com.cs.task1;

//import op.ac.com.cs.task1.service.QuestionService;
import op.ac.com.cs.task1.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Task1Application {

	@Bean
	public UserService getUserService() {
		return new UserService();

	}
	@Bean
	public RestTemplate restTemplate(){

		return new RestTemplate();
	}
//
//	@Bean
//	public QuestionService getQuestionService() {
//		return new QuestionService();
//
//	}
	public static void main(String[] args) {
		SpringApplication.run(Task1Application.class, args);
	}

}
