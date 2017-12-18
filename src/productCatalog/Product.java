package productCatalog;

import java.util.List;

import javax.print.attribute.standard.Media;

public class Product {
	private Integer ID;
	private String name;
	private List<String> searchableTags;
	private String shortDescription;
	private String longDestription;
	private Float price;
	private Media media;
	private Category category;
	
	Product() {
		
	}

	 Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getSearchableTags() {
		return searchableTags;
	}

	public void setSearchableTags(List<String> searchableTags) {
		this.searchableTags = searchableTags;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDestription() {
		return longDestription;
	}

	public void setLongDestription(String longDestription) {
		this.longDestription = longDestription;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Media getMedia() {
		return media;
	}

	public void setMedia(Media media) {
		this.media = media;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
}

