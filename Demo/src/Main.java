
public class Main {
    public static void main(String[] args) {

        boolean PassIsValid = true;
        boolean InCarantine = true;

        boolean IsPersonnel = true;

        String message;
        if (PassIsValid && !InCarantine) {
            message = "Проход открыт";
        } else if (IsPersonnel) {
            message = "Проход только для персонала";
        } else {
            message = "Проход закрыт";
        }
        }
}