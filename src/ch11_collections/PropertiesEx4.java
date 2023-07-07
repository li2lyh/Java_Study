package ch11_collections;

import java.io.*;
import java.util.*;

public class PropertiesEx4 {
	public static void main(String[] args) {
		Properties sysProperties = System.getProperties();
		System.out.println("java.version : " + sysProperties.getProperty("java.version"));

		System.out.println("user.language : " + sysProperties.getProperty("user.language"));

		sysProperties.list(System.out);
	}
}
