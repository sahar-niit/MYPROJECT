package com.ecom.services;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.validation.ValidationContext;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.webflow.execution.RequestContext;

import com.ecom.dao.CardDetailDAO;
import com.ecom.models.CardDetails;



@Service
public class CardDetailService implements Serializable {
	@Autowired
    private CardDetailDAO cardDetailDao;

    public String addCardDetail (CardDetails cardDetail,RequestContext context) {
    	
    	HttpServletRequest request = (HttpServletRequest )context.getExternalContext().getNativeRequest();  
    	
    	cardDetailDao.addCardDetail(cardDetail, request.getUserPrincipal());
    	
    	return "success";
    }


}
