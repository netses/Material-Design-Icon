package com.s1243808733.materialicon.ui.anim;


/**
 * @description:
 * @author: Sorcerer
 * @date: 2016/11/4
 */

import androidx.transition.AutoTransition;
import androidx.transition.Transition;

public class FadeOutTransition extends AutoTransition {
    private static final int FADE_OUT_DURATION = 250;

    private FadeOutTransition() {

    }

    public static Transition withAction(TransitionListener finishingAction) {
        AutoTransition transition = new AutoTransition();
        transition.setDuration(FADE_OUT_DURATION);
        transition.addListener(finishingAction);
        return transition;
    }
}
