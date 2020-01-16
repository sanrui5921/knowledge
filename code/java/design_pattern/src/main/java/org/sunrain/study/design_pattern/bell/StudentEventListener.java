package org.sunrain.study.design_pattern.bell;

public class StudentEventListener implements BellEventListener {
    @Override
    public void heardBell(RingEvent event) {
        if (event.getSound()) {
            System.out.println("同学们，上课了...");
        } else {
            System.out.println("同学们，下课了...");
        }
    }
}
