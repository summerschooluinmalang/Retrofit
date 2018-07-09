package id.technologue.appsl.retrofit;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jauharibill on 7/9/2018.
 */

public class User {

    @SerializedName("name")
    public String name;
    @SerializedName("job")
    public String job;
    @SerializedName("id")
    public String id;
    @SerializedName("createdAt")
    public String createdAt;

    public User(String name, String job){
        this.name = name;
        this.job = job;
    }
}
