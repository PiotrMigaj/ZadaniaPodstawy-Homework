package day2;

public interface IStringHelper {

    public static boolean isTextValid(String text){

        return text!=null && !text.isBlank();

    }

}
