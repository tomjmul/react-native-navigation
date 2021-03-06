package com.reactnativenavigation.params;

import android.support.annotation.ColorInt;

public class StyleParams {
    public static class Color {
        @ColorInt
        private Integer color = null;

        public Color() {
            color = null;
        }

        public Color(Integer color) {
            this.color = color;
        }

        public boolean hasColor() {
            return color != null;
        }

        @ColorInt
        public int getColor() {
            if (!hasColor()) {
                throw new RuntimeException("Color undefined");
            }
            return color;
        }

        public static Color parse(String str) {
            if (str == null) {
                return new Color();
            }
            return new Color(android.graphics.Color.parseColor(str));
        }
    }

    public Color statusBarColor;
    public Color contextualMenuStatusBarColor;
    public Color contextualMenuButtonsColor;
    public Color contextualMenuBackgroundColor;

    public Color topBarColor;
    public CollapsingTopBarParams collapsingTopBarParams;
    public boolean topBarHidden;
    public boolean topTabsHidden;
    public boolean drawScreenBelowTopBar;

    public boolean titleBarHidden;
    public boolean topBarTransparent;
    public Color titleBarTitleColor;
    public Color titleBarSubtitleColor;
    public Color titleBarButtonColor;
    public Color titleBarDisabledButtonColor;
    public boolean backButtonHidden;

    public Color topTabTextColor;
    public Color selectedTopTabTextColor;
    public int selectedTopTabIndicatorHeight;
    public Color selectedTopTabIndicatorColor;

    public boolean drawScreenAboveBottomTabs;

    public Color snackbarButtonColor;

    public boolean bottomTabsHidden;
    public boolean bottomTabsHiddenOnScroll;
    public Color bottomTabsColor;
    public Color selectedBottomTabsButtonColor;
    public Color bottomTabsButtonColor;
    public boolean forceTitlesDisplay;
    public Color bottomTabBadgeTextColor;
    public Color bottomTabBadgeBackgroundColor;

    public Color navigationBarColor;
}
