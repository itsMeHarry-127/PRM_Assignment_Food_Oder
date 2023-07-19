package org.harry.prm_assignment_food_order;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.harry.prm_assignment_food_order.Model.LoginObj;
import org.harry.prm_assignment_food_order.Model.ProductML;
import org.harry.prm_assignment_food_order.Model.SaleOrderDetailML;
import org.harry.prm_assignment_food_order.Model.SaleOrderReBD;
import org.harry.prm_assignment_food_order.Model.User;
import org.harry.prm_assignment_food_order.Model.productTypeML;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiService {
    Gson gson = new GsonBuilder().setDateFormat("yyy-mm-dd HH:mm:ss").create();
    ApiService apiService = new Retrofit.Builder()
            .baseUrl(" https://58c9-118-69-182-149.ngrok-free.app")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build().create(ApiService.class);
    @GET("getInforCustomer")
    Call<User> getInfoUser(@Query("customerID") int cusID);

    @POST("Login")
    Call<User> login(@Body LoginObj loginObj);

    @GET("getAllProductType")
    Call<List<productTypeML>> getAllProductType();

    @GET("getAllProduct")
    Call<List<ProductML>> getAllProduct();

    @GET("getProductByType")
    Call<List<ProductML>>getProductByType(@Query("productType")int productType);

    @POST("insertNewSO")
    Call<Integer> insertNewSaleOrder(@Body SaleOrderReBD reBD);

    @GET("getListSoDetailBySoID")
    Call<List<SaleOrderDetailML>> getListSoDetail(@Query("cusId") int cusId);

    @GET("AddNewAddress")
    Call<User> addnewAddress(@Query("cusID")int userID, @Query("cusAddress")String userAdd,@Query("cussPhone")String userPhone,@Query("cusPostalCode")String userCode);




}
