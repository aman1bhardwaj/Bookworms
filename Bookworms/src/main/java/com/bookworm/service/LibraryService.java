package com.bookworm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookworm.DAO.LibraryDAO;
import com.bookworm.entity.Library;


@Service
public class LibraryService {
	@Autowired
	LibraryDAO libDao;
	
	public List<Library> getallLibrary() {
		return this.libDao.getallLibrary();
	}


	public Library getLibraryById(Integer id) {

		return this.libDao.getLibraryById(id);
	}


	public Library saveLibrary(Library lib) {
		return this.libDao.saveLibrary(lib);
	}


	public Library updateLibrary(Library lib) {
		return this.libDao.updateLibrary(lib);
	}


	public String deleteLibraryById(Integer id) {
	
		return this.libDao.deleteLibraryById(id);
	}
}
