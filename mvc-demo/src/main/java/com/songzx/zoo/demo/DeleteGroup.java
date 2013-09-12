package com.songzx.zoo.demo;

import java.util.List;

import org.apache.zookeeper.KeeperException;

/**
 * delete a group and its members
 * 
 * @author songzhaoxu
 *
 */
public class DeleteGroup extends ConnectionWatcher {
	public void delete(String groupName) throws KeeperException, InterruptedException {
		String path = "/" + groupName;
		try {
			List<String> children = zk.getChildren(path, false);
			for (String child : children) {
				zk.delete(path + "/" + child, -1);
			}
			zk.delete(path, -1);
		} catch (KeeperException.NoNodeException e) {
			System.out.printf("Group %s does not exist\n", groupName);
			System.exit(1);
		}
	}

	public static void main(String[] args) throws Exception {
		DeleteGroup deleteGroup = new DeleteGroup();
		deleteGroup.connect("127.0.0.1:2181");
		deleteGroup.delete("myTest");
		deleteGroup.close();
	}
}
