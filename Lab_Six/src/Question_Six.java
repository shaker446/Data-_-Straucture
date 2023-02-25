public class Question_Six {
    public void circularVersion(){
        oneSentinel();
        Node<E> e = trailer.getNext();
        trailer = trailer.getPrev();
        trailer.setNext(e);
    } 
}