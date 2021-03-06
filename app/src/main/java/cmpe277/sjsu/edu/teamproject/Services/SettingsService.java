package cmpe277.sjsu.edu.teamproject.Services;

import cmpe277.sjsu.edu.teamproject.model.GenericPostResponse;
import cmpe277.sjsu.edu.teamproject.model.Settings;
import cmpe277.sjsu.edu.teamproject.model.SettingsPostBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;


public interface SettingsService {

    @GET("/settings/{emailid}")
    Call<Settings> getSettings(@Path("emailid") String emailId);

    @POST("/settings/update")
    Call<GenericPostResponse> updateSettings(@Body SettingsPostBody settingsPostBody);

}
