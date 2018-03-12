package com.lc.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lcf.demo.LcfMain;
import com.lcf.demo.entity.TableA;
import com.lcf.demo.transaction.TransactionAInterface;
import com.lcf.demo.transaction.TransactionBInterface;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { LcfMain.class })
public class LcfTest {

	@Autowired
	private TransactionAInterface ta;
	@Autowired
	private TransactionBInterface tb;
	// THIS IS TEST
	@Test
	public void test() {
		TableA tableA = new TableA();
		tableA.setId("2");
		tableA.setName("2");
		try {
			ta.save(tableA);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
