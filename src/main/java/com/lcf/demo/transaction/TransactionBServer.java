package com.lcf.demo.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lcf.demo.entity.TableB;
import com.lcf.demo.mapper.TableBMapper;

@Service
public class TransactionBServer implements TransactionBInterface {
	@Autowired
	private TableBMapper tb;
	@Autowired
	private TransactionAInterface ta;

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void save(TableB b) {

		tb.save(b);

	}

}
