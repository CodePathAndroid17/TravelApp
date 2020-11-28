package com.codepath.spalli235.battuta.fragments;

import android.util.Log;

import com.example.pictogram.PostsAdapter;
import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseQuery;
import com.parse.ParseUser;

import java.util.List;

import static com.example.pictogram.PostsAdapter.Post.KEY_CREATED;

public class ProfileFragment extends PostFragment {

    @Override
    protected void queryPosts()
    {
        ParseQuery<PostsAdapter.Post> query = ParseQuery.getQuery(PostsAdapter.Post.class);
        query.include(PostsAdapter.Post.KEY_USER);
        query.whereEqualTo(PostsAdapter.Post.KEY_USER, ParseUser.getCurrentUser());
        query.setLimit(20);
        query.addDescendingOrder(KEY_CREATED);
        query.findInBackground(new FindCallback<PostsAdapter.Post>() {
            @Override
            public void done(List<PostsAdapter.Post> posts, ParseException e) {
                if(e != null)
                {
                    Log.e(TAG, "Issue with getting posts",e);
                    return;
                }

                for(PostsAdapter.Post post: posts)
                {
                    Log.i(TAG, "Post: " + post.getDescription() + ", username: "+ post.getUser().getUsername());
                }
                allPosts.clear();
                allPosts.addAll(posts);
                adapter.notifyDataSetChanged();
            }
        });


    }

}
