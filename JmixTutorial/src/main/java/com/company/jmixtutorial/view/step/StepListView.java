package com.company.jmixtutorial.view.step;

import com.company.jmixtutorial.entity.Step;
import com.company.jmixtutorial.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "steps", layout = MainView.class)
@ViewController(id = "Step.list")
@ViewDescriptor(path = "step-list-view.xml")
@LookupComponent("stepsDataGrid")
@DialogMode(width = "64em")
public class StepListView extends StandardListView<Step> {
}