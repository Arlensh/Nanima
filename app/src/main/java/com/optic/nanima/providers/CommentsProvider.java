package com.optic.nanima.providers;

        import com.google.android.gms.tasks.Task;
        import com.google.firebase.firestore.CollectionReference;
        import com.google.firebase.firestore.FirebaseFirestore;
        import com.google.firebase.firestore.Query;
        import com.optic.nanima.models.Comment;

public class CommentsProvider {

    CollectionReference mCollection;

    public CommentsProvider() {
        mCollection = FirebaseFirestore.getInstance().collection("Comments");
    }

    public Task<Void> create(Comment comment) {
        return mCollection.document().set(comment);
    }

    public Query getCommentsByPost(String idPost) {
        //return mCollection.whereEqualTo("idPost", idPost).orderBy("timestamp", Query.Direction.ASCENDING);
        //return mCollection.whereEqualTo("idPost", idPost);
        return mCollection.whereEqualTo("idPost", idPost).orderBy("timestamp", Query.Direction.DESCENDING);
    }


}
