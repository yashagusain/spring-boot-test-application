package com.boot;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.boot.model.Shipwreck;
import com.boot.repository.ShipwreckRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(App.class)
public class ShipwreckRepositoryIntegratioTest {

	
	@Autowired
	private ShipwreckRepository shipwreckRepository;
	@Test
	public void testFindAll(){
		List<Shipwreck> wreck  = shipwreckRepository.findAll();
		assertThat(wreck.size(),is(greaterThanOrEqualTo(0)));
	}

}
