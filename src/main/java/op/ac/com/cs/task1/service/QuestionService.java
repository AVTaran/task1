//package op.ac.com.cs.task1.service;
//
//import op.ac.com.cs.task1.db.QuestionRepo;
//import op.ac.com.cs.task1.models.Question;
//import op.ac.com.cs.task1.models.QuizUser;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//@Service
//public class QuestionService {
//    @Autowired
//    private QuestionRepo questionRepository;
//
////    private List<Question> questions = Arrays.asList(
////            new Question("100","What is your name"),
////            new Question("101","Where do you live")
////
////    );
//public List<Question> getAllQuestion(){
//    List<Question> questions = new ArrayList<Question>();
//    questionRepository.findAll().forEach(questions::add);
//    return questions;
//    //return quizUsers;
//}
////    public List<Question> getAllQuestion(){
////
////        return questions;
////    }
////
////    public Question getQuestion(String id){
////
////        for(Question u:questions){
////            if(u.getId().equals(id)){
////                return u;
////            }
////
////        }
////        return null;
////    }
//public Question getQuestion(String id){
//    return questionRepository.findById(id).get();
//       /* for(QuizUser u:quizUsers){
//            if(u.getId().equals(id)){
//                return u;
//            }
//
//        }
//        return null;*/
//}
//
//    public void addQuestion(Question question){
//        questionRepository.save(question);
//        //quizUsers.add(user);
//    }
//
////    public void addQuestion(Question question){
////
////        questions.add(question);
////
////    }
//    public void updateQuestion(Question question){
//        questionRepository.save(question);
//    }
//    public void deleteQuestion(String id){
//        questionRepository.deleteById(id);
//    }

//}
