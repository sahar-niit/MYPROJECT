package com.ecom.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.dao.CardDetailDAO;
import com.ecom.models.CardDetails;



@Service
public class CardDetailService {
	@Autowired
    private CardDetailDAO cardDetailDao;

    public void addCardDetail (CardDetails cardDetail) {
    	cardDetailDao.addCardDetail(cardDetail);
    }


}
