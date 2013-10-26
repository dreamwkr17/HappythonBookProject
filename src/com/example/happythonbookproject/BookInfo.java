package com.example.happythonbookproject;

public class BookInfo {
	String title;
	String foreign_title;
	String first_category;
	String second_category;
	String authors;
	String main_author;
	String publisher;
	String published_at;
	String language;
	String isbn10;
	String isbn13;
	String price;
	String description;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getForeign_title() {
		return foreign_title;
	}
	public void setForeign_title(String foreign_title) {
		this.foreign_title = foreign_title;
	}
	public String getFirst_category() {
		return first_category;
	}
	public void setFirst_category(String first_category) {
		this.first_category = first_category;
	}
	public String getSecond_category() {
		return second_category;
	}
	public void setSecond_category(String second_category) {
		this.second_category = second_category;
	}
	public String getAuthors() {
		return authors;
	}
	public void setAuthors(String authors) {
		this.authors = authors;
	}
	public String getMain_author() {
		return main_author;
	}
	public void setMain_author(String main_author) {
		this.main_author = main_author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPublished_at() {
		return published_at;
	}
	public void setPublished_at(String published_at) {
		this.published_at = published_at;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getIsbn10() {
		return isbn10;
	}
	public void setIsbn10(String isbn10) {
		this.isbn10 = isbn10;
	}
	public String getIsbn13() {
		return isbn13;
	}
	public void setIsbn13(String isbn13) {
		this.isbn13 = isbn13;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "BookInfo [title=" + title + ", foreign_title=" + foreign_title
				+ ", first_category=" + first_category + ", second_category="
				+ second_category + ", authors=" + authors + ", main_author="
				+ main_author + ", publisher=" + publisher + ", published_at="
				+ published_at + ", language=" + language + ", isbn10="
				+ isbn10 + ", isbn13=" + isbn13 + ", price=" + price
				+ ", description=" + description + "]";
	}
	
	
}
