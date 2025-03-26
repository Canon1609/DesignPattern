package iuh.fit;

public class Main {
    public static void main(String[] args) {


        Notification notification = new Notification();
        Observer user1 = new User("User 1");
        Observer user2 = new User("User 2");
        Observer librarian1 = new Librarian("Librarian 1");

        notification.addObserver(user1);
        notification.addObserver(user2);
        notification.addObserver(librarian1);

        notification.newBookArrived("Harry Potter");

        notification.removeObserver(user2);
        notification.bookExpiring("along the river during the qingming festival");

    }
}