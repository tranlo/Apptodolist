package phamtanphat.ptp.khoaphamtraining.apptodolist29072019.api.retrofit;

import phamtanphat.ptp.khoaphamtraining.apptodolist29072019.api.response.LoginResponse;
import phamtanphat.ptp.khoaphamtraining.apptodolist29072019.api.response.RegisterResponse;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiRequest {

    @FormUrlEncoded
    @POST("login.php")
    Call<LoginResponse> onLoginResult(
                                    @Field("user") String username,
                                    @Field("password") String password);
    @FormUrlEncoded
    @POST("register.php")
    Call<RegisterResponse> onRegisterResult(
                                    @Field("user") String username,
                                    @Field("password") String password);
}
