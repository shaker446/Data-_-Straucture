public class Question_One {
    public void signatureTransfer(LinkedStack S, LinkedStack T){
        while(!S.isEmpty())
            T.push(S.pop());
    }
}
