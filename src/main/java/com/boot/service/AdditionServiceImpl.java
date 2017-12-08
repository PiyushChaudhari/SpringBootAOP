package com.boot.service;

import org.springframework.stereotype.Service;

import com.boot.model.Addition;

@Service
public class AdditionServiceImpl implements AdditionService{

	@Override
	public Integer processAddition(Addition addition) {
		Integer sum = (addition.getFirstValue()!=null ? addition.getFirstValue() :0) + (addition.getSecondValue()!=null ? addition.getSecondValue() :0);
		if(sum == 5)
			throw new RuntimeException("Addition exception:>> "+sum);
		return sum;
	}

}
