public class AgeVerfication {
   
    public String AgeVerfication(Integer age, Integer userAge){
        if(userAge >= 18){
            return "You can play this game";
        } else{
            return "You cannot play this game";
        }
    }
}
