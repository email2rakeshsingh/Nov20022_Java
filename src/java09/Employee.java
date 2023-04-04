package java09;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Employee {
	public ArrayList<String> getEmpDevice(String name) {
		ArrayList<String> deviceList = new ArrayList<String>();
		System.out.println("emp name :" + name);
		if (name.equals("Rakesh")) {
			deviceList.add("iphone11");
			deviceList.add("iphone12");
			deviceList.add("iphone13");

		} else if (name.equals("Aarush")) {
			deviceList.add("Sum12");
			deviceList.add("sum13");
			deviceList.add("sum14");

		}else {
			System.out.println("comp name :" +name);
		}
		return deviceList;

	}

	public String[] getCompInfo(String compName) {

		String dept[] = new String[5];
		System.out.println("Comp name :" + compName);

		if (compName.equals("ibm")) {
			dept[0] = "HR";
			dept[1] = "QA";
			dept[2] = "ACCOUNT";
			dept[3] = "FINCE";

		} else if (compName.equals("TCS")) {
			dept[0] = "QA";
			dept[1] = "DEV";
			dept[2] = "UAT";
			dept[3] = "BETA";

		}else {
			System.out.println("Comp is not found :" +compName);
		}
		return dept;

	}

	public static void main(String[] args) {

		Employee list = new Employee();
		ArrayList<String> ibm = list.getEmpDevice("Rakesh");
		System.out.println(ibm);

		Employee tcs = new Employee();
		ArrayList<String> tcs1 = tcs.getEmpDevice("Aarush");
		System.out.println(tcs1);

		String   departm[]  = list.getCompInfo("ibm");
		System.out.println(Arrays.toString(departm));

	}

}
