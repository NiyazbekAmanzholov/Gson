package folder1.collectionWith;

import com.google.gson.Gson;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Map<String, Object>> list = new ArrayList<>();

        Map<String, Object> map = new HashMap<>();
        map.put("A", "B");

        Map<String, Object> map2 = new HashMap<>();
        map2.put("A", "C");

        Map<String, Object> map3 = new HashMap<>();
        map3.put("A", "D");

        list.add(map);
        list.add(map2);
        list.add(map3);

        UserDictionaryEntryDTO userDictionaryEntryDTO = new UserDictionaryEntryDTO();
        userDictionaryEntryDTO.setUserId(8L);
        userDictionaryEntryDTO.setReferenceId(1020L);
        userDictionaryEntryDTO.setId(89L);
        userDictionaryEntryDTO.setData(list);

        Gson gson = new Gson();
        System.out.println(gson.toJson(userDictionaryEntryDTO));

    }
    }

class UserDictionaryEntryDTO {

    private Long id;

    private Long userId;

    private Long referenceId;

    private List<Map<String, Object>> data;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(Long referenceId) {
        this.referenceId = referenceId;
    }

    public List<Map<String, Object>> getData() {
        return data;
    }

    public void setData(List<Map<String, Object>> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "UserDictionaryEntryDTO{" +
                "id=" + id +
                ", userId=" + userId +
                ", referenceId=" + referenceId +
                ", data=" + data +
                '}';
    }
}

//{
//        "id":89,
//        "userId":8,
//        "referenceId":1020,
//        "data":
//          [
//        {
//        "A":"B"
//        }
//        ,{
//        "A":"C"
//        },
//        {
//        "A":"D"
//        }
//          ]
//        }


// {
//         "id":89,
//         "userId":8,
//         "referenceId":1020,
//         "data":
//           [
//         {
//         "column_name":"text1",
//         "data_type": "text"
//         },
//         {
//         "column_name":"sign",
//         "data_type": "varchar"
//         }
//           ]
//         }
