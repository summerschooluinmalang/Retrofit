package id.technologue.appsl.retrofit;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jauharibill on 7/9/2018.
 */

public class CreateUserResponse {

    @SerializedName("name")
    public String name;
    @SerializedName("job")
    public String job;
    @SerializedName("id")
    public Integer id;
    @SerializedName("created_at")
    public Integer createdAt;
}
