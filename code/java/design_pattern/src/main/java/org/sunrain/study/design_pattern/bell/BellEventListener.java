package org.sunrain.study.design_pattern.bell;

import java.util.EventListener;

public interface BellEventListener extends EventListener {
    public void heardBell(RingEvent event);
}
