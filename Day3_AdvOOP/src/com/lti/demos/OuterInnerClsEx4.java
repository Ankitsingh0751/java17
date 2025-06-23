package com.lti.demos;

class MotherBoard {
	private String model;
	public MotherBoard(String model) {
		this.model = model;
	}
	public void showUsbPorts() {
		USB u = new USB(); // can create an instance of inner class
		System.out.println("Ports "+u.usb3);
		int totPorts=u.getTotalPorts();
		System.out.println("total ports are "+totPorts);
	}
	// nested class
	class USB {
		private int usb2 =
				2;
		int usb3 = 1;
		int getTotalPorts() {
			System.out.println("Model "+model);
			// accessing the variable model of the outer classs
			if (MotherBoard.this.model.equals("MSI")) {
				return 4;
			} else {
				return usb2 + usb3;
			}	// return 0;
		}
	}
}

public class OuterInnerClsEx4 {
	public static void main(String[] args) {
		// create an object of the static nested class
		//MotherBoard.USB usb = new MotherBoard.USB();
		//System.out.println("Total Ports = " + usb.getTotalPorts());
		MotherBoard mb = new MotherBoard("MSI");
		mb.showUsbPorts();

	}
}
