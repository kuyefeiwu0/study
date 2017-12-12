package com.lcf.demo.utils;

import java.io.IOException;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.Watcher.Event.KeeperState;
import org.apache.zookeeper.ZooKeeper;

public class ZookeeperUtil {
	private static final String hosts = "192.168.204.128:2181,192.168.204.129:2181,192.168.204.131:2181";
	public static ZooKeeper zk;

	public static void hello() throws IOException, InterruptedException {
		zk = new ZooKeeper(hosts, 6000, new ConnetionWatcher());
		
	}

	 

}

class ConnetionWatcher implements Watcher {

	public void process(WatchedEvent event) {
		if (event.getState() == KeeperState.SyncConnected) {
			System.out.println("zk connetion ok");
		}
		System.out.println("l tyep:"+event.getType().name());
		System.out.println("l path:"+event.getPath());
		System.out.println("l state:"+event.getState().name()); 

	}
}
