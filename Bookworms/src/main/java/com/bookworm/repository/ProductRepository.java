package com.bookworm.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bookworm.entity.Author;
import com.bookworm.entity.Genre;
import com.bookworm.entity.Language;
import com.bookworm.entity.Product;
import com.bookworm.entity.Publisher;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	@Query("select p from Product p where p.category.cate_id=?1")
	public List<Product> GetallProductByCategory(int cate_id);
	
	@Query("select p from Product p where p.genre.gen_id=?1")
	public Optional<Genre> getProductByGenre(int gen_id);

	@Query("select p from Product p where p.language.lang_id=?1")
	public List<Language> GetallProductByLanguage(int lang_id);
	
	@Query("select p from Product p where p.author.auth_id=?1")
	public List<Author> getProductByAuthor(int auth_id);
	
	@Query("select p from Product p where p.publisher.pub_id=?1")
	public Optional<Publisher> getProductByPublisher(int pub_id);
}
