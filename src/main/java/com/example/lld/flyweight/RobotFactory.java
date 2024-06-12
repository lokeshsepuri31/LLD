package com.example.lld.flyweight;

import java.util.HashMap;
import java.util.Map;

/*
 * The main purpose of this design pattern is :
 * 1. When there is limited memory.
 * 2. When Objects shared data.
 * 	> Intrinsic data: Shared among objects and remain same once defined one value
 *  > Extrinsic data: changes based on client input and differs from one object to another
 * 3. Creation of Object is expensive
 */
public class RobotFactory {

	private static Map<String, IRobot> robotCache = new HashMap<String, IRobot>();

	public static IRobot createInstance(String type) {

		if (robotCache.get(type) == null) {
			IRobot irobot = null;
			if (type.equals("Humanoid")) {
				irobot = new HumanoidRobot(type, new Image());
				robotCache.put(type, irobot);
			} else if (type.equals("Dog")) {
				irobot = new DogRobot(type, new Image());
				robotCache.put(type, irobot);
			}
			return irobot;
		} else {
			return robotCache.get(type);
		}
	}
}
