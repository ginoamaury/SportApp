package com.ginoamaury.sportapp.View.Fragments;


import android.util.Log;
import android.view.View;

import androidx.test.espresso.UiController;
import androidx.test.espresso.ViewAction;
import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.espresso.util.TreeIterables;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import com.ginoamaury.sportapp.MainActivity;

import com.ginoamaury.sportapp.R;


import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isRoot;
import static androidx.test.espresso.matcher.ViewMatchers.withEffectiveVisibility;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static com.ginoamaury.sportapp.View.Fragments.TeamsFragmentTest.ViewSynchronizer.viewExists;
import static java.util.EnumSet.allOf;


public class TeamsFragmentTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule = new ActivityScenarioRule<>(MainActivity.class);


    @Test
    public void test_isListFragmentVisible_onAppLaounch() {
        onView(withId(R.id.recyclerShows)).check(matches(isDisplayed()));
    }

    @Test
    public void test_selectListItem() throws InterruptedException {
        onView(withId(R.id.menu_spanish)).perform(click());
        Assert.assertTrue(viewExists(withId(R.id.recyclerShows),2000));
        onView(withId(R.id.recyclerShows)).perform(RecyclerViewActions.actionOnItemAtPosition(4,click()));
        onView(withId(R.id.recyclerShows)).perform(
                RecyclerViewActions.actionOnItemAtPosition(4, MyViewAction.clickChildViewWithId(R.id.fab)));
    }

    @Test
    public void test_bootomNavigation(){
        onView(withId(R.id.menu_premier_league)).perform(click());
        onView(withId(R.id.menu_italian_seriea)).perform(click());
        onView(withId(R.id.menu_spanish)).perform(click());
    }


    public static class MyViewAction {

        public static ViewAction clickChildViewWithId(final int id) {
            return new ViewAction() {
                @Override
                public Matcher<View> getConstraints() {
                    return null;
                }

                @Override
                public String getDescription() {
                    return "Click on a child view with specified id.";
                }

                @Override
                public void perform(UiController uiController, View view) {
                    View v = view.findViewById(id);
                    v.performClick();
                }
            };
        }

    }

    public static class ViewSynchronizer {
        private static final String TAG = "MC_Synchronizer";

        public static boolean viewExists(final Matcher<View> viewMatcher, final long millis) throws InterruptedException {
            final Boolean[] found = new Boolean[1];

            final CountDownLatch latch = new CountDownLatch(1);
            ViewAction action = new ViewAction() {
                @Override
                public Matcher<View> getConstraints() {
                    return isRoot();
                }

                @Override
                public String getDescription() {
                    return "wait for a specific view with id <" + viewMatcher.toString() + "> during " + millis + " millis.";
                }

                @Override
                public void perform(final UiController uiController, final View view) {
                    uiController.loopMainThreadUntilIdle();
                    final long startTime = System.currentTimeMillis();
                    final long endTime = startTime + millis;


                    do {
                        for (View child : TreeIterables.breadthFirstViewTraversal(view)) {

                            if (viewMatcher.matches(child)) {
                                Log.d(TAG, "perform: found match");
                                found[0] = true;
                                latch.countDown();
                                return;
                            }
                        }

                        uiController.loopMainThreadForAtLeast(50);
                    }
                    while (System.currentTimeMillis() < endTime);

                    found[0] = false;
                    latch.countDown();
                }
            };
            onView(isRoot()).perform(action);

            latch.await();
            return found[0];
        }
    }

}