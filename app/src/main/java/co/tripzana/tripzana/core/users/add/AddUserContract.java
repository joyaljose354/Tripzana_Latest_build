package co.tripzana.tripzana.core.users.add;

/**
 * Created by Joyal on 01-06-2017.
 */

import android.content.Context;

import com.google.firebase.auth.FirebaseUser;



public interface AddUserContract {
    interface View {
        void onAddUserSuccess(String message);

        void onAddUserFailure(String message);
    }

    interface Presenter {
        void addUser(Context context, FirebaseUser firebaseUser);
    }

    interface Interactor {
        void addUserToDatabase(Context context, FirebaseUser firebaseUser);
    }

    interface OnUserDatabaseListener {
        void onSuccess(String message);

        void onFailure(String message);
    }
}
