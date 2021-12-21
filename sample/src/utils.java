public class utils {
    public static User createUser(String id) {
        User user = new User();
        user.setId(id); // ユーザID
        user.setName("ユーザ" + id); // 名前
        user.setTel("XXX-XXXX-XXX" + id); // 電話番号
        user.setMail("mail" + id + "@g.com"); // メールアドレス
        return user;
    }
}
