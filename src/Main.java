public class Main {

    public static void main(String[] args) {
        String myUsername = "gledermegtilfredag";
        String myPassword = "password";
        String endring = "Good morning BØØØ";

        if(!User.validateUsername(myUsername)) {
            System.out.println("Username doesn't fit the rules. Please check the User class.");
        } else {
            User u = new User(myUsername, User.hashPassword(myPassword));
            System.out.println(u);
        }
    }
}
