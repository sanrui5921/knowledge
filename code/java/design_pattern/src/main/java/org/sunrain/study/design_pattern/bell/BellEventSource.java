package org.sunrain.study.design_pattern.bell;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BellEventSource {

    private List<BellEventListener> listeners;

    public BellEventSource() {
        listeners = new ArrayList<BellEventListener>();
    }

    //给事件源绑定监听器
    public void addPersonListener(BellEventListener ren) {
        listeners.add(ren);
    }

    //事件触发器：敲钟，当铃声sound的值发生变化时，触发事件。
    public void ring(boolean sound) {
        String type = sound ? "上课铃" : "下课铃";
        System.out.println(type + "响！");
        RingEvent event = new RingEvent(this, sound);
        notifies(event);    //通知注册在该事件源上的所有监听器
    }

    private void notifies(RingEvent event) {
        BellEventListener ren;
        Iterator<BellEventListener> iterator = listeners.iterator();
        while (iterator.hasNext()) {
            ren = iterator.next();
            ren.heardBell(event);
        }
    }
}
