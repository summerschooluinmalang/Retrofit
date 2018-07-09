package id.technologue.appsl.retrofit;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jauharibill on 7/9/2018.
 */

public class UserList {
    @SerializedName("page")
    public Integer page;
    @SerializedName("per_page")
    public Integer perPage;
    @SerializedName("total")
    public Integer total;
    @SerializedName("total_pages")
    public Integer totalPages;
    @SerializedName("data")
    public List<Datum> data=new ArrayList();

    public class Datum{
        @SerializedName("id")
        public Integer id;
        @SerializedName("first_name")
        public String firstName;
        @SerializedName("last_name")
        public String lastName;
        @SerializedName("avatar")
        public String avatar;
    }
}
