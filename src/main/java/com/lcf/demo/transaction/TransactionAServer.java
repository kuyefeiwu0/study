package com.lcf.demo.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lcf.demo.entity.TableA;
import com.lcf.demo.mapper.TableAMapper;

@Service
public class TransactionAServer implements TransactionAInterface {
	@Autowired
	private TableAMapper tableAMapper;
	@Autowired
	private TransactionBInterface tb;

	@Override
	@Transactional(propagation=Propagation.NEVER)
	public void save(TableA a) {
		tableAMapper.save(a);
		
	 
			tableAMapper.save(a);
		 
		
//		try {
//			TransactionAInterface ta = (TransactionAInterface) AopContext.currentProxy();
//			ta.save2(a);
//		} catch (Throwable e) {
//			e.printStackTrace();
//		}
		
	}

	@Override
	@Transactional
	public void save2(TableA a) {
		tableAMapper.save(a);
		// try {
		// TransactionAInterface ta = (TransactionAInterface)
		// AopContext.currentProxy();
		// ta.save2(a);
		// } catch (Throwable e) {
		// e.printStackTrace();
		// }
	}

}
