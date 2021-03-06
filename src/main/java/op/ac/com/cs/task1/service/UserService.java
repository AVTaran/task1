package op.ac.com.cs.task1.service;


import op.ac.com.cs.task1.db.QuizUserRepository;
import op.ac.com.cs.task1.models.QuizUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private QuizUserRepository userRepository;
//    private List<QuizUser> quizUsers = Arrays.asList(
//            new QuizUser("100","John","Auckland CBD"),
//            new QuizUser("101","Tiara","Auckland CBD")
//
//    );
public List<QuizUser> getAllQuizUsers(){
    List<QuizUser> users = new ArrayList<QuizUser>();
    userRepository.findAll().forEach(users::add);
    return users;
    //return quizUsers;
}
//    public List<QuizUser> getAllQuizUsers(){
//        //List<QuizUser> users = new ArrayList<QuizUser>();
//        //userRepository.findAll().forEach(users::add);
//        return quizUsers;
//    }
public QuizUser getQuizUser(String id){
    return userRepository.findById(id).get();
       /* for(QuizUser u:quizUsers){
            if(u.getId().equals(id)){
                return u;
            }

        }
        return null;*/
}
//    public QuizUser getQuizUser(String id){
//       // return userRepository.findById(id).get();
//        for(QuizUser u:quizUsers){
//            if(u.getId().equals(id)){
//                return u;
//            }
//
//        }
//        return null;
//    }

    public void addQuizUser(QuizUser user){
        userRepository.save(user);
        //quizUsers.add(user);

    }
    public void updateQuizUser(QuizUser user){
        userRepository.save(user);
    }
    public void deleteQuizUser(String id){
        userRepository.deleteById(id);
    }


}
