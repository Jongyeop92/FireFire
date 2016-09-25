package app.jongyeop.fireinthehouse;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Mr.Han on 2016-09-19.
 */
public class MyInstanceIdListenerService extends FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh() {
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();

        /*
        // 바뀐 토큰(혹은 처음 받은 토큰)에 대한 처리
        SharedPreferences tokenFile = getSharedPreferences("token", 0);
        if(tokenFile.getString("token", "").equals("")) {
            SharedPreferences.Editor editor = tokenFile.edit();
            editor.putString("token", refreshedToken);
            editor.commit();
        } else {
            // 바뀐 토큰에 대한 적절한 처리
        }
        */
    }
}

