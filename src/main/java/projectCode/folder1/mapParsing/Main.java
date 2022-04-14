package projectCode.folder1.mapParsing;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<>();
        map.put("column_name", "desc11");
        map.put("data_type", "varchar");

        Map<String, Object> map2 = new HashMap<>();
        map2.put("column_name", "text");
        map2.put("data_type", "varchar");

        Map<String, Object> map3 = new HashMap<>();
        map3.put("column_name", "text3");
        map3.put("data_type", "date");

        List<Map<String, Object>> mapList = new ArrayList<>();
        mapList.add(map);
        mapList.add(map2);
        mapList.add(map3);

        UserDictionaryEntryDTO dto = new UserDictionaryEntryDTO();
        dto.setReferenceId(1l);
        dto.setUserId(1L);
        dto.setData(mapList);

        System.out.println(buildSqlForUpdate(dto));

    }

    private static String buildSqlForUpdate(UserDictionaryEntryDTO userDictionaryEntryDTO) {
        List<Map<String, Object>> dataList = userDictionaryEntryDTO.getData();
        StringBuilder sqlSet = new StringBuilder();
        if (dataList.size() > 0) {
            for (Map<String, Object> data : dataList) {
                data.forEach((k, v) -> {
                    sqlSet.append(v).append(" ");
                });
            }
        }
        return sqlSet.toString()
                .replaceAll("([^ ]+ [^ ]+) ", "ADD COLUMN IF NOT EXISTS $1, ")
                .replaceAll("\\s*,\\s*$", "");
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







//
//{
//        "referenceId": 1,
//        "data": {
//        "data": [
//        {
//        "column_name": "id",
//        "data_type": "bigint"
//        },
//        {
//        "column_name": "date",
//        "data_type": "date"
//        },
//        {
//        "column_name": "number",
//        "data_type": "bigint"
//        },
//        {
//        "column_name": "desc1",
//        "data_type": "character varying"
//        }
//        ]
//        }
//        }