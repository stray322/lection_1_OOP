package lection_2;

public class WrongLoginException extends Exception{
    public WrongLoginException(){
    }
    public WrongLoginException(String message){
           super(message);
    }
}
