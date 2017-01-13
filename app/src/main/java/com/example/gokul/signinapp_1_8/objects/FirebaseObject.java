package com.example.gokul.signinapp_1_8.objects;

/**
 * Created by Kraji on 1/12/2017.
 */

public class FirebaseObject {
    @Exclude
    private DatabaseReference ref;

    public FirebaseObject() {
    }

    @Exclude
    public DatabaseReference getRef() {
        return ref;
    }

    @Exclude
    public void setRef(DatabaseReference ref) {
        this.ref = ref;
    }

    @Exclude
    public Task pullFromDB() {
        // TODO: ...
        return null;
    }

    @Exclude
    public Task pushToDB() {
        return ref.set(this);
    }
}
