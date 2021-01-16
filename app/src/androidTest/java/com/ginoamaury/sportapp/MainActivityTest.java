package com.ginoamaury.sportapp;

import androidx.test.core.app.ActivityScenario;

import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class MainActivityTest {

    @Test
    public void test_activity_inView() {
        ActivityScenario activityScenario = ActivityScenario.launch(MainActivity.class);
        onView(withId(R.id.mainActivty)).check(matches(isDisplayed()));
    }

    @Test
    public void test_visibility_icon() {
        ActivityScenario activityScenario = ActivityScenario.launch(MainActivity.class);
        onView(withId(R.id.expandedImage2)).check(matches(isDisplayed()));
    }


}