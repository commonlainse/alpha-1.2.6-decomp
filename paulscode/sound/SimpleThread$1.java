/*
 * Decompiled with CFR 0.152.
 */
package paulscode.sound;

import paulscode.sound.SimpleThread;

class SimpleThread$1
extends Thread {
    final SimpleThread this$0;

    SimpleThread$1(SimpleThread simpleThread) {
        this.this$0 = simpleThread;
    }

    @Override
    public void run() {
        SimpleThread.access$000(this.this$0);
    }
}

