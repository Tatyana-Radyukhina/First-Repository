public class Names {
    public static void main(String[] args) {
        String user1 = "иван иванов";
        String user2 = "Вован Иванов";
        checkUserName(user1, user2);
    }
    public static void checkUserName(String user1, String user2) {
        if (user1.equalsIgnoreCase(user2) == true)
            System.out.println("Выберите другое имя пользователя");
        else
            System.out.println("Отличное имя! Ваше имя имеет длину " + user2.length() + " символов. " );
    }
}

