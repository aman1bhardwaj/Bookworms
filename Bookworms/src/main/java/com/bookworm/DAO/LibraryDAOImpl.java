package com.bookworm.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookworm.entity.Library;
import com.bookworm.repository.LibraryRepository;


@Component
public class LibraryDAOImpl implements LibraryDAO {

	@Autowired
	LibraryRepository libRepo;
	
	@Override
	public List<Library> getallLibrary() {
		return this.libRepo.findAll();	}

	@Override
	public Library getLibraryById(Integer id) {
		return this.libRepo.getById(id);
	}

	@Override
	public Library saveLibrary(Library lib) {
		return this.libRepo.save(lib);
	}

	@Override
	public Library updateLibrary(Library lib) {
		return this.libRepo.save(lib);
	}

	@Override
	public String deleteLibraryById(Integer id) {
		if(this.libRepo.existsById(id)){
			this.libRepo.deleteById(id);
			return "Package Deleted";
		}
			
		
		return "OBJECT/ ID NOT FOUND TO DELETE";
	}

}
