package io.abdelraouf.learn.cucumber.test;

import android.os.Bundle;
import cucumber.api.CucumberOptions;
import cucumber.api.android.CucumberAndroidJUnitRunner;

@CucumberOptions(glue = "io.abdelraouf.learn.cucumber.steps", features = "features")
public class AndroidCucumberTestRunner extends CucumberAndroidJUnitRunner {
  @Override
  public void onCreate(Bundle bundle) {
    super.onCreate(bundle);
  }
}
