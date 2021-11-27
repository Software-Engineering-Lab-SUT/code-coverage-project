package com.unittest.codecoverage.services;

public interface CrudService <O, ID> {

	O insert(O object);

	void update(O object);

	O get(ID id);

	void delete(ID id);
}
