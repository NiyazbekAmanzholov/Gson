import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {
        serializeUserSimple();
        derializeUserSimple();
    }

    

    private static void serializeUserSimple() {
        UserSimple userSimple = new UserSimple("Norman", "norman@mail.com", 27, true);

        Gson gson = new Gson();

        System.out.println(gson.toJson(userSimple));
    }



    private static void derializeUserSimple() {
       String userSimpleJson = "{'name':'Norman','email':'norman@mail.com','age':27,'isDeveloper':true}";

       Gson gson = new Gson();

       UserSimple userSimple = gson.fromJson(userSimpleJson, UserSimple.class);

       System.out.println(userSimple);
    }
}
