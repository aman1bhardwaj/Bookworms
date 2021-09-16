package com.bookworm.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookworm.entity.Myshelf;
import com.bookworm.repository.MyshelfRepository;


@Component
public class MyshelfDAOImpl implements MyshelfDAO {
	@Autowired
	MyshelfRepository myshelfRepo;

	@Override
	public List<Myshelf> getallMyshelf() {
		return this.myshelfRepo.findAll();
	}

	@Override
	public Myshelf getMyshelfById(Integer id) {
		return this.myshelfRepo.getById(id);
	}

	@Override
	public Myshelf saveMyshelf(Myshelf myshelf) {
		return this.myshelfRepo.save(myshelf);
	}

	@Override
	public Myshelf updateMyshelf(Myshelf myshelf) {
		return this.myshelfRepo.save(myshelf);
	}

	@Override
	public String deleteMyshelfById(Integer id) {
		if(this.myshelfRepo.existsById(id)){
			this.myshelfRepo.deleteById(id);
			return "MyShelf Deleted";
		}
			
		
		return "OBJECT/ ID NOT FOUND TO DELETE";
	}
}
