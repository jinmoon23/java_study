public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        user.name = "Jinmun";
        user.phoneNumber = "010-0000-0000";
        user.age = 31;

        System.out.println("name: " + user.name);
        System.out.println("phoneNumber: " + user.phoneNumber);
        System.out.println("age: " + user.age);
    }
}
