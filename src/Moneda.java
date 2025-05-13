

import com.google.gson.annotations.SerializedName;

public class Moneda {

    @SerializedName("conversion_result")
    private String total;


    public String getTotal() {
        return total;
    }
    
}

//Response: {"result":"success","documentation":"https://www.exchangerate-api.com/docs","terms_of_use":"https://www.exchangerate-api.com/terms","time_last_update_unix":1747094402,"time_last_update_utc":"Tue, 13 May 2025 00:00:02 +0000","time_next_update_unix":1747180802,"time_next_update_utc":"Wed, 14 May 2025 00:00:02 +0000","base_code":"USD","target_code":"MXN","conversion_rate":19.6001,"conversion_result":19.6001}  Titulo: null
