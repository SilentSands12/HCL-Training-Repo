package com.hcl_training.HCL_Exercise_Project.Java_Day_2;

public class Invoice {

	String partNumber;
	String partDescription;
	int quantityOfItems;
	double pricePerItem;

	public Invoice(String pNum, String pDes, int qItem, double price) {

		setPartNumber(pNum);
		setPartDescription(pDes);
		setQuantityOfItems(qItem);
		setPricePerItem(price);
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantityOfItems() {
		return quantityOfItems;
	}

	public void setQuantityOfItems(int quantityOfItems) {
		this.quantityOfItems = quantityOfItems;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}

	public double getInvoiceAmount() {
		if (this.quantityOfItems > 0) {
			double invoiceAmount = this.quantityOfItems * this.pricePerItem;
			return invoiceAmount;
		} else {
			this.setQuantityOfItems(0);
			return 0;
		}
	}

}
