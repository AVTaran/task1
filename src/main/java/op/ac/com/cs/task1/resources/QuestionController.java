package op.ac.com.cs.task1.resources;


import op.ac.com.cs.task1.models.Question;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import op.ac.com.cs.task1.models.QuizResponse;
//import op.ac.com.cs.task1.service.QuestionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@RestController
public class QuestionController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/questions")
    public String getQuestions(){
        String url ="https://opentdb.com/api.php?amount=10&category=9&difficulty=easy&type=multiple";
        String jsonRes = restTemplate.getForObject(url,String.class);
        System.out.println(jsonRes);
        return jsonRes;


    }
    @GetMapping("/questions/{count}")
    public String getQuestions(@PathVariable("count") String count){
        String url ="https://opentdb.com/api.php?amount="+count +"&category=9&difficulty=easy&type=multiple";
        String jsonRes = restTemplate.getForObject(url,String.class);
        return jsonRes;

    }

    @GetMapping("/qlist")
    public List<Question> getQuestionsList() throws JsonProcessingException {
        //Task
        //Make external API call to OpenTDB
        //Get JSON response
        //Parse JSON response and read JSON List
        String url ="https://opentdb.com/api.php?amount="+10 +"&category=9&difficulty=easy&type=multiple";
        String jsonRes = restTemplate.getForObject(url,String.class);
        System.out.println(jsonRes);
        ObjectMapper mapper = new ObjectMapper();
        QuizResponse quizResponse = mapper.readValue(jsonRes,QuizResponse.class);
        System.out.println(quizResponse.getResults().size());
        //return  JSON List

        return quizResponse.getResults();
    }
    @GetMapping("/qlist2")
    public List<Question> getQuestionsList2() throws JsonProcessingException {
        //Task
        //Make external API call to OpenTDB
        //Get JSON response
        //Parse JSON response and read JSON List
        String url ="https://opentdb.com/api.php?amount="+10 +"&category=9&difficulty=easy&type=multiple";
        String jsonRes = restTemplate.getForObject(url,String.class);

        String questions = jsonRes.substring(29, jsonRes.length()-1);
        System.out.println(jsonRes);
        System.out.println(questions);
        ObjectMapper mapper = new ObjectMapper();

        List<Question> questionsList = mapper.readValue(questions,new TypeReference<List<Question>>(){});
        //System.out.println(quizResponse.getResults().size());
        //return  JSON List

        return questionsList;
    }
////    @Autowired
////    private QuestionService questionService;
//
//
//    @GetMapping("/questions")
//    public List<Question> getQuestion(){
//        return questionService.getAllQuestion();
//    }
//    @GetMapping("/questions/{id}")
//    public Question getQuestion(@PathVariable String id){
//        return questionService.getQuestion(id);
//    }
//   // @RequestMapping(method = RequestMethod.POST, value="/questions")
//   @PostMapping("/questions")
//    public void addQuestion(@RequestBody Question questions){
//        questionService.addQuestion(questions);
//
//    }
//    @PutMapping("/questions")
//    public void updateQuestion(@RequestBody Question question){
//        questionService.updateQuestion(question);
//    }
//    @DeleteMapping("/questions/{id}")
//    public void deleteQuestion(@PathVariable String id){
//        questionService.deleteQuestion(id);
//    }


}
