/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kisoft.easybus.test.handlers;

import me.kisoft.easybus.Handler;
import me.kisoft.easybus.test.events.SyncEvent;

/**
 *
 * @author tareq
 */
public class SyncHandler implements Handler<SyncEvent> {

    @Override
    public void handle(SyncEvent event) {
        SyncEvent.checked = true;
    }
}
