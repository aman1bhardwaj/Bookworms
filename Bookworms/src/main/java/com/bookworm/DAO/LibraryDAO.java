package com.bookworm.DAO;

import java.util.List;

import com.bookworm.entity.Library;


public interface LibraryDAO {

	public List<Library>  getallLibrary();
	public Library getLibraryById(Integer id);
	public Library saveLibrary(Library lib);
	public Library updateLibrary(Library lib);
	public String deleteLibraryById(Integer id);
}
