package com.songzx.zoo.simple;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.Watcher.Event.KeeperState;
import org.apache.zookeeper.ZooDefs.Ids;
import org.apache.zookeeper.ZooKeeper;

public class SimpleZoo implements Watcher {
	private ZooKeeper zk;
	private CountDownLatch connectedSignal = new CountDownLatch(1);
	private static final int SESSION_TIMEOUT = 5000;
	
	public SimpleZoo() {
		
	}
	
	/**
	 * create a ZooKeeper connection
	 * @param host	the host to be connected
	 */
	public void connect(String host){
		try {
			zk = new ZooKeeper(host, SESSION_TIMEOUT, this);
			System.out.println("Open a ZooKeeper connection.");
			connectedSignal.await();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * close the ZooKeeper connection
	 */
	public void close() {
		try {
			zk.close();
			System.out.println("Close the ZooKeeper connection.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void process(WatchedEvent event) {
		if(event.getState() == KeeperState.SyncConnected){
			connectedSignal.countDown();
		}
	}
	
	/**
	 * delete a group with the given name and its children
	 * 
	 * @param groupName	the group to be deleted
	 */
	public void delete(String groupName){
		String path = "/" + groupName;
		try {
			List<String> children = zk.getChildren("/" + groupName, this);
			for(String child : children){
				zk.delete(path + "/" + child, -1);
				System.out.println("Child [" + path + "/" + child + "] has been deleted.");
			}
			zk.delete(path, -1);
			System.out.println("Group [" + path + "] has been deleted.");
		} catch (KeeperException e) {
			e.printStackTrace();
			System.out.println("An error occured while trying to delete the group. " + e.getLocalizedMessage());
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("An error occured while trying to delete the group. " + e.getLocalizedMessage());
		}
	}
	
	/**
	 * create a group with the given name
	 * 
	 * @param groupName
	 */
	public void creat(String groupName) {
		String path = "/" + groupName;
		try {
			String createdPath = zk.create(path, null, Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
			System.out.println("Path [" + createdPath + "] has been created!");
		} catch (KeeperException e) {
			e.printStackTrace();
			System.out.println("An error occured while trying to create the group. " + e.getLocalizedMessage());
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("An error occured while trying to create the group. " + e.getLocalizedMessage());
		}
	}
	
	/**
	 * let a member with given memberName to join the group with given groupName
	 * 
	 * @param groupName	the group to be joined
	 * @param memberName	the member to join the group
	 */
	public void join(String groupName, String memberName){
		String path = "/" + groupName;
		try {
			zk.create(path + "/" + memberName, null, Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
			System.out.println("Member [" + memberName + "] has joined the group [" + groupName + "].");
		} catch (KeeperException e) {
			e.printStackTrace();
			System.out.println("An error occured while trying to join the group. " + e.getLocalizedMessage());
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("An error occured while trying to join the group. " + e.getLocalizedMessage());
		}
	}
	
	/**
	 * list the children of a given group
	 * 
	 * @param groupName	the group to be listed
	 */
	public void list(String groupName) {
		String path = "/" + groupName;
		try {
			List<String> children = zk.getChildren(path, this);
			for(String child : children) {
				System.out.println("Child [" + child +"] under the group [" + groupName + "]");
			}
		} catch (KeeperException e) {
			e.printStackTrace();
			System.out.println("An error occured while trying to list the children." + e.getLocalizedMessage());
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("An error occured while trying to list the children." + e.getLocalizedMessage());
		}
	}
	
	public static void main(String[] args) {
		SimpleZoo sz = new SimpleZoo();
		sz.connect("10.58.50.50:2181");
//		sz.connect("127.0.0.1:2181");
//		sz.delete("hello");
//		sz.creat("hello");
//		sz.join("hello", "child1");
//		sz.join("hello", "child2");
//		sz.join("hello", "child3");
		sz.list("dubbo/com.gome.io.facet.sms.SMSFacet/consumers");
		sz.list("dubbo/com.gome.io.facet.sms.SMSFacet/providers");
		sz.close();
	}

}
