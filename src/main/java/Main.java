import com.primeiraaula.service.PersonService;

public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        personService.newPerson("Marcelo", 24, true);
    }
}
