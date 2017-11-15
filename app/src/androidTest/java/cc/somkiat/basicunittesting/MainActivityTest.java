package cc.somkiat.basicunittesting;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;




@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void saveEmptyNameAndEmail() {
        onView(withId(R.id.userNameInput)).perform(scrollTo(),
                replaceText(""), closeSoftKeyboard());
        onView(withId(R.id.emailInput)).perform(scrollTo(),
                replaceText(""), closeSoftKeyboard());
        onView(withId(R.id.saveButton)).perform(scrollTo(), click());
    }

    @Test
    public void saveNameAndEmptyEmail() {
        onView(withId(R.id.userNameInput)).perform(scrollTo(),
                replaceText("Montita Wichianchai"), closeSoftKeyboard());
        onView(withId(R.id.emailInput)).perform(scrollTo(),
                replaceText(""), closeSoftKeyboard());
        onView(withId(R.id.saveButton)).perform(scrollTo(), click());
    }

    @Test
    public void saveInCorrectNamePatternAndEmptyEmail() {
        onView(withId(R.id.userNameInput)).perform(scrollTo(),
                replaceText("M O N T I T A"), closeSoftKeyboard());
        onView(withId(R.id.emailInput)).perform(scrollTo(),
                replaceText(""), closeSoftKeyboard());
        onView(withId(R.id.saveButton)).perform(scrollTo(), click());
    }

    @Test
    public void saveLongNameEmptyEmail() {
        onView(withId(R.id.userNameInput)).perform(scrollTo(),
                replaceText("Montitawichianchai MontitaWichianchai"), closeSoftKeyboard());
        onView(withId(R.id.emailInput)).perform(scrollTo(),
                replaceText(""), closeSoftKeyboard());
        onView(withId(R.id.saveButton)).perform(scrollTo(), click());
    }


    @Test
    public void saveNameAndInCorrectEmailPattern() {
        onView(withId(R.id.userNameInput)).perform(scrollTo(),
                replaceText("Montita Wichianchai"), closeSoftKeyboard());
        onView(withId(R.id.emailInput)).perform(scrollTo(),
                replaceText("montita.mail.com"), closeSoftKeyboard());
        onView(withId(R.id.saveButton)).perform(scrollTo(), click());
    }

    @Test
    public void saveValidNameAndValiEmail() {
        onView(withId(R.id.userNameInput)).perform(scrollTo(),
                replaceText("Montita Wichainchai"), closeSoftKeyboard());
        onView(withId(R.id.emailInput)).perform(scrollTo(),
                replaceText("montita@mail.com"), closeSoftKeyboard());
        onView(withId(R.id.saveButton)).perform(scrollTo(), click());
    }

    @Test
    public void revertButtonTest() {
        onView(withId(R.id.revertButton)).perform(scrollTo(), click());
        onView(withId(R.id.userNameInput)).check(matches(withText("")));
        onView(withId(R.id.emailInput)).check(matches(withText("")));
    }

}