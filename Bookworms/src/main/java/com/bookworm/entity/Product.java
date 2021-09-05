package com.bookworm.entity;




import javax.persistence.*;

/**
 * @author user
 *
 */
@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int prod_id;
	int isbn;
	String title;
	String title_in_english;
	@ManyToOne(cascade=CascadeType.ALL)
	Category cate_id;
	/*@ManyToOne(cascade=CascadeType.ALL)
	Language lang_id;
	@ManyToOne(cascade=CascadeType.ALL)
	Genre gen_id;
	@ManyToOne(cascade=CascadeType.ALL)
	Author auth_id;
	@ManyToOne(cascade=CascadeType.ALL)
	Publisher pub_id;*/
	int base_price;
	int sale_price;
	int offer_price;
	int avl_date;
	String Short_desc;
	String long_desc;
	String front_image_link;
	String product_link;
	boolean is_rentable;
	boolean is_library;
	int length;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	


	













	public Product(int prod_id, int isbn, String title, String title_in_english, Category cate_id, int base_price,
			int sale_price, int offer_price, int avl_date, String short_desc, String long_desc, String front_image_link,
			String product_link, boolean is_rentable, boolean is_library, int length) {
		this.prod_id = prod_id;
		this.isbn = isbn;
		this.title = title;
		this.title_in_english = title_in_english;
		this.cate_id = cate_id;
		this.base_price = base_price;
		this.sale_price = sale_price;
		this.offer_price = offer_price;
		this.avl_date = avl_date;
		Short_desc = short_desc;
		this.long_desc = long_desc;
		this.front_image_link = front_image_link;
		this.product_link = product_link;
		this.is_rentable = is_rentable;
		this.is_library = is_library;
		this.length = length;
	}



















	public int getProd_id() {
		return prod_id;
	}


	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}


	public int getIsbn() {
		return isbn;
	}


	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getTitle_in_english() {
		return title_in_english;
	}


	public void setTitle_in_english(String title_in_english) {
		this.title_in_english = title_in_english;
	}


	public Category getCate_id() {
		return cate_id;
	}


	public void setCate_id(Category cate_id) {
		this.cate_id = cate_id;
	}


	/*public Language getLang_id() {
		return lang_id;
	}


	public void setLang_id(Language lang_id) {
		this.lang_id = lang_id;
	}


	public Genre getGen_id() {
		return gen_id;
	}


	public void setGen_id(Genre gen_id) {
		this.gen_id = gen_id;
	}


	public Author getAuth_id() {
		return auth_id;
	}


	public void setAuth_id(Author auth_id) {
		this.auth_id = auth_id;
	}


	public Publisher getPub_id() {
		return pub_id;
	}


	public void setPub_id(Publisher pub_id) {
		this.pub_id = pub_id;
	}*/


	public int getBase_price() {
		return base_price;
	}


	public void setBase_price(int base_price) {
		this.base_price = base_price;
	}


	public int getSale_price() {
		return sale_price;
	}


	public void setSale_price(int sale_price) {
		this.sale_price = sale_price;
	}


	public int getOffer_price() {
		return offer_price;
	}


	public void setOffer_price(int offer_price) {
		this.offer_price = offer_price;
	}


	public int getAvl_date() {
		return avl_date;
	}


	public void setAvl_date(int avl_date) {
		this.avl_date = avl_date;
	}


	public String getShort_desc() {
		return Short_desc;
	}


	public void setShort_desc(String short_desc) {
		Short_desc = short_desc;
	}


	public String getLong_desc() {
		return long_desc;
	}


	public void setLong_desc(String long_desc) {
		this.long_desc = long_desc;
	}


	public String getFront_image_link() {
		return front_image_link;
	}


	public void setFront_image_link(String front_image_link) {
		this.front_image_link = front_image_link;
	}


	public String getProduct_link() {
		return product_link;
	}


	public void setProduct_link(String product_link) {
		this.product_link = product_link;
	}


	public boolean isIs_rentable() {
		return is_rentable;
	}


	public void setIs_rentable(boolean is_rentable) {
		this.is_rentable = is_rentable;
	}


	public boolean isIs_library() {
		return is_library;
	}


	public void setIs_library(boolean is_library) {
		this.is_library = is_library;
	}


	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}



















	@Override
	public String toString() {
		return "Product [prod_id=" + prod_id + ", isbn=" + isbn + ", title=" + title + ", title_in_english="
				+ title_in_english + ", cate_id=" + cate_id + ", base_price=" + base_price + ", sale_price="
				+ sale_price + ", offer_price=" + offer_price + ", avl_date=" + avl_date + ", Short_desc=" + Short_desc
				+ ", long_desc=" + long_desc + ", front_image_link=" + front_image_link + ", product_link="
				+ product_link + ", is_rentable=" + is_rentable + ", is_library=" + is_library + ", length=" + length
				+ "]";
	}





	


	
	
	
	
	
}	
	