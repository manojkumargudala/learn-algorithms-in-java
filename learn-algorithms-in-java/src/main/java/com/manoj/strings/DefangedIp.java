package com.manoj.strings;

public class DefangedIp {
//https://leetcode.com/problems/defanging-an-ip-address/

	public String defangIPaddr(String address) {
		if (address != null) {
			return address.replaceAll("\\.", "[.]");
		}
		return address;
	}

	public static void main(String[] args) {
		DefangedIp defangedIp = new DefangedIp();
		System.out.println(defangedIp.defangIPaddr("201.201.201.201"));

	}
}
