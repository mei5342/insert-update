import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class Sample1 {
    public void run() {
        // データ作成
        List<User> userList = new ArrayList<>();
        userList.add(utils.createUser("1"));
        userList.add(utils.createUser("2"));
        userList.add(utils.createUser("3"));
        
        // 加工
        
        
        // 既存・新規読み込み
        userList.forEach(System.out::println);
    }
}