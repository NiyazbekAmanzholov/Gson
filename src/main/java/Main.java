import com.google.gson.Gson;

import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        serializeUserSimple();
        //derializeUserSimple();
    }



    private static void serializeUserSimple() {
        UserDictionaryDTO userDictionaryDTO = new UserDictionaryDTO("just", Collections.singletonList(new UserDictionaryData()));

        Gson gson = new Gson();

        System.out.println(gson.toJson(userDictionaryDTO));
    }



//    private static void derializeUserSimple() {
//       String userSimpleJson = "{'name':'Norman','email':'norman@mail.com','age':27,'isDeveloper':true}";
//
//       Gson gson = new Gson();
//
//       UserSimple userSimple = gson.fromJson(userSimpleJson, UserSimple.class);
//
//       System.out.println(userSimple);
//    }
}


class UserDictionaryDTO {

    private String name;

    private List<UserDictionaryData> dictionaryStructure;

    public UserDictionaryDTO(String name, List<UserDictionaryData> dictionaryStructure) {
        this.name = name;
        this.dictionaryStructure = dictionaryStructure;
    }
}

class UserDictionaryData {

    private String columnName = "Nik";

    private String columnType = "1";

    private String referenceColumn = "column";


}
