package com.welcome.android.utils;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ValueEventListener;
import com.welcome.android.objects.FirebaseObject;
import com.welcome.android.objects.User;

/**
 * Created by Kraji on 1/13/2017.
 */

public class FirebaseUtils {
    public static Task login(String email, String password) {
        return FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password);
    }

    public static void logout() {
        FirebaseAuth.getInstance().signOut();
    }

    public static Task signUp(final User newUser, final String password) {
        Task t1 = newUser.pushToDB();
        Task t2 = FirebaseAuth.getInstance().createUserWithEmailAndPassword(newUser.getEmail(), password);
        Task[] tasks = {t1, t2};
        return Tasks.whenAll(tasks);
    }

    public static <T extends FirebaseObject> Task<T> getFirebaseObjectByRef(final GenericTypeIndicator<T> type, DatabaseReference ref) {
        final TaskCompletionSource<T> source = new TaskCompletionSource<T>();
        Task<T> task = source.getTask();
        ref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                T object = dataSnapshot.getValue(type);
                source.setResult(object);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                source.setException(databaseError.toException());
            }
        });
        return task;
    }
}
