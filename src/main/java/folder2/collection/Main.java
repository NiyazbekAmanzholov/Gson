package folder2.collection;

import com.google.gson.Gson;

import java.util.*;

public class Main {
    public static void main(String[] args) {

UserDictionaryData userDictionaryData = new UserDictionaryData("a","b","c");
UserDictionaryData userDictionaryData2 = new UserDictionaryData("a1","b","c");
UserDictionaryData userDictionaryData3 = new UserDictionaryData("a2","b","c");
UserDictionaryData userDictionaryData4 = new UserDictionaryData("a3","b","c");

        List<UserDictionaryData> dictionaryStructure = new ArrayList<>();
        dictionaryStructure.add(userDictionaryData);
        dictionaryStructure.add(userDictionaryData2);
        dictionaryStructure.add(userDictionaryData3);
        dictionaryStructure.add(userDictionaryData4);

        UserDictionaryDTO userDictionaryDTO = new UserDictionaryDTO("Nik", dictionaryStructure);

        Gson gson = new Gson();

        System.out.println(gson.toJson(userDictionaryDTO));
    }
    }




class UserDictionaryData {

    private String columnName;

    private String columnType;

    private String referenceColumn;


    public UserDictionaryData(String columnName, String columnType, String referenceColumn) {
        this.columnName = columnName;
        this.columnType = columnType;
        this.referenceColumn = referenceColumn;
    }

}




class UserDictionaryDTO {

    private String name;

    private List<UserDictionaryData> dictionaryStructure;

    public UserDictionaryDTO(String name, List<UserDictionaryData> dictionaryStructure) {
        this.name = name;
        this.dictionaryStructure = dictionaryStructure;
    }
}