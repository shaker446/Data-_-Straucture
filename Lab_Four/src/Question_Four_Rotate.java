
public class Question_Four_Rotate {
    private void rotate(){ // Q Four
        if(!isEmpty()){
            E el = tail.getElement();
            tail.element = head.getElement();
            head.element = el;
        }
    }
}