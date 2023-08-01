package com.collectiondi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.collectiondi.beans.ElectionCommission;
import com.collectiondi.beans.Product;
import com.collectiondi.beans.Store;
import com.collectiondi.beans.WishList;

public class Test {

	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(
				new ClassPathResource("com/collectiondi/common/application-context.xml"));
		Product product = beanFactory.getBean("product", Product.class);
		System.out.println(product);
//		o/p
//		Product [productNo=10001, productName=Smart TV 32inch, features=[31 Inch, Dolby Atmos, Full HD]]
				
		Store store = beanFactory.getBean("store", Store.class);
		System.out.println(store);
//		o/p
//		Store [storeNo=1, storeName=Jio Mart, 
//				staff=[Staff [staffNo=1, staffName=michael, age=20, gender=Male], 
//				       Staff [staffNo=2, staffName=scott, age=23, gender=Male], 
//				       Staff [staffNo=3, staffName=nicole, age=26, gender=Male]]]
		
		ElectionCommission commission = beanFactory.getBean("electionCommission", ElectionCommission.class);
		System.out.println(commission);
//		o/p
//		ElectionCommission [electionList=
//		{e001=Person [uid=U001, fullName=Michael, gender=Male, age=20], 
//				e002=Person [uid=U002, fullName=Scott, gender=Male, age=23], 
//				e003=Person [uid=U003, fullName=Nicole, gender=Male, age=25]}]
		
		WishList wishList = beanFactory.getBean("wishList", WishList.class);
		System.out.println(wishList);
//		o/p
//		WishList [personName=Michael, age=20, location=Hyderabad, 
//		wishList={Bike=TVS Jupiter, food=Biryani}]
	}

}
