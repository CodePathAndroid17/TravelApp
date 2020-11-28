package com.codepath.spalli235.battuta.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pictogram.PostsAdapter;
import com.example.pictogram.R;
import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseQuery;

import java.util.ArrayList;
import java.util.List;

import static com.example.pictogram.PostsAdapter.Post.KEY_CREATED;


public class PostFragment<RecyclerView> extends Fragment {

    private RecyclerView rvPosts;
    public static final String TAG = "PostsFragment";
    protected PostsAdapter adapter;
    protected List<PostsAdapter.Post> allPosts;
    private SwipeRefreshLayout swipeContainer;

    public PostFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_post, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvPosts= view.findViewById(R.id.rvPosts);
        swipeContainer= view.findViewById(R.id.swipeContainer);
        allPosts = new ArrayList<>();
        adapter = new PostsAdapter(getContext(), allPosts);

        rvPosts.setAdapter(adapter);
        rvPosts.setLayoutManager(new LinearLayoutManager(getContext()));

        swipeContainer.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {

            @Override

            public void onRefresh() {
                // Your code to refresh the list here.
                // Make sure you call swipeContainer.setRefreshing(false)
                // once the network request has completed successfully.
                Log.i(TAG, "Fetching new data");
                queryPosts();
                swipeContainer.setRefreshing(false);
            }


        });

        // Configure the refreshing colors

        swipeContainer.setColorSchemeResources(
                android.R.color.holo_blue_bright,
                android.R.color.holo_green_light,
                android.R.color.holo_orange_light,
                android.R.color.holo_red_light);

        //Using recyclerview
        //0. create layout for one row in the list
        //1.create adapter
        //2.create data course
        //3. set adapter on recycler view
        //4. set layout manager on recycler view
        queryPosts();
    }

    protected void queryPosts() {
        ParseQuery<PostsAdapter.Post> query = ParseQuery.getQuery(PostsAdapter.Post.class);
        query.include(PostsAdapter.Post.KEY_USER);
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