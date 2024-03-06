public interface IAuthenticationService {
    User signUp(String username, String password);
    User logIn(String username, String password);

    // Writing code and implemented solution for authentication
}