package com.ginoamaury.sportapp.View.Fragments;

import android.view.View;

import android.content.res.Resources;
import androidx.recyclerview.widget.RecyclerView;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

import static androidx.core.util.Preconditions.checkState;


public class RecyclerViewMatcher {

    public static final int UNSPECIFIED = -1;
    private final int recyclerId;

    public RecyclerViewMatcher(int recyclerViewId) {
        this.recyclerId = recyclerViewId;
    }

    public Matcher<View> atPosition(final int position) {
        return atPositionOnView(position, UNSPECIFIED);
    }

    public Matcher<View> atPositionOnView(final int position, final int targetViewId) {
        return new TypeSafeMatcher<View>() {
            Resources resources;
            RecyclerView recycler;
            RecyclerView.ViewHolder holder;

            @Override
            public void describeTo(Description description) {
                checkState(resources != null, "resource should be init by matchesSafely()");

                if (recycler == null) {
                    description.appendText("RecyclerView with " + getResourceName(recyclerId));
                    return;
                }

                if (holder == null) {
                    description.appendText(String.format(
                            "in RecyclerView (%s) at position %s",
                            getResourceName(recyclerId), position));
                    return;
                }

                if (targetViewId == UNSPECIFIED) {
                    description.appendText(
                            String.format("in RecyclerView (%s) at position %s",
                                    getResourceName(recyclerId), position));
                    return;
                }

                description.appendText(
                        String.format("in RecyclerView (%s) at position %s and with %s",
                                getResourceName(recyclerId),
                                position,
                                getResourceName(targetViewId)));
            }

            private String getResourceName(int id) {
                try {
                    return "R.id." + resources.getResourceEntryName(id);
                } catch (Resources.NotFoundException ex) {
                    return String.format("resource id %s - name not found", id);
                }
            }

            @Override
            public boolean matchesSafely(View view) {
                resources = view.getResources();
                recycler = view.getRootView().findViewById(recyclerId);
                if (recycler == null)
                    return false;
                holder = recycler.findViewHolderForAdapterPosition(position);
                if (holder == null)
                    return false;

                if (targetViewId == UNSPECIFIED) {
                    return view == holder.itemView;
                } else {
                    return view == holder.itemView.findViewById(targetViewId);
                }
            }
        };
    }
}