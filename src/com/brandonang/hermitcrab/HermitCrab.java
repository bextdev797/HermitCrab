package com.brandonang.hermitcrab;

import android.app.Activity;
import android.content.Context;

import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleProperty;
import com.google.appinventor.components.annotations.DesignerProperty;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;

import com.google.appinventor.components.runtime.AndroidViewComponent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

public class HermitCrab extends AndroidNonvisibleComponent {
  private Activity activity;
  private Context context;
  private int textColor;
  private boolean babyHermitCrab;

  public HermitCrab(ComponentContainer container) {
    super(container.$form());
    this.activity = container.$context();
    this.context = container.$context();
  }

  @SimpleFunction
  public void CreateHermitCrab(AndroidViewComponent layout) {
    View view = layout.getView();
    TextView textView = new TextView(this.context);
    textView.setTextColor(textColor);
    FrameLayout frameLayout = (FrameLayout) view;
    frameLayout.addView(textView);
    if(babyHermitCrab){
      textView.setText("v   v\n" +
                      "/    /\n" +
                      "'~~~~'");
    }
    else{
    textView.setText("             ___\n" +
    "       _    /.-.\\\n" +
    "     .'` `'.|_|_|/\n" +
    "    //       - -\\      _ _ _\n" +
    "   (| .--.  .--.|)    / '_ ` \\\n" +
    "    \\_| |  | |_/    | (_) | |\n" +
    "     \\ | |  | | /     \\__,_|\n" +
    "      `'`-'  `-'`");
  }
}

  @DesignerProperty(editorType = PropertyTypeConstants.PROPERTY_TYPE_COLOR, defaultValue = DEFAULT_VALUE_COLOR_MAGENTA)
  @SimpleProperty
  public void SetTextColor(int color){
    textColor = color;
  }

  @DesignerProperty(editorType = PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN, defaultValue = "True")
  @SimpleProperty
  public void BabyHermitCrabMode(boolean isBabyHermitCrab){
    babyHermitCrab = isBabyHermitCrab;
  }
}