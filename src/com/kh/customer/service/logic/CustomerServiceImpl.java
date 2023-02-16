package com.kh.customer.service.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kh.customer.domain.Customer;
import com.kh.customer.service.CustomerService;
import com.kh.customer.store.CustomerStore;

@Component("customerService")
// spring-context.xml에 <bean id="customerStore" class="kr.iei.customer.store.logic.CustomerStoreLogic"></bean>
// 써주는것과 같음. annotation을 이용한 bean등록
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerStore cStore;
	// 3. annotation을 이용한 의존성 주입. cStore 멤버변수에 의존성을 주입한다고 autowired로 표시
	
//	public void setStore(CustomerStore cStore) {
//		this.cStore = cStore;
//	}
	
	public CustomerServiceImpl() {
		// cStore = new CustomerStoreLogic();
	}

//	public CustomerServiceImpl(CustomerStore cStore) {
//		this.cStore = cStore;
//	}
		
	@Override
	public Customer findOneById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> findAllCustomers() {
		List<Customer> cList = cStore.selectAllCustomers();
		return cList;
	}

}
