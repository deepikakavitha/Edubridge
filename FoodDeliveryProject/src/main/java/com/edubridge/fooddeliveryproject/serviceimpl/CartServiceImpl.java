
package com.edubridge.fooddeliveryproject.serviceimpl;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.edubridge.fooddeliveryproject.exception.UserNotFoundException;
import com.edubridge.fooddeliveryproject.model.Cart;
import com.edubridge.fooddeliveryproject.model.Category;
import com.edubridge.fooddeliveryproject.repository.CartRepository;
import com.edubridge.fooddeliveryproject.repository.CategoryRepository;
import com.edubridge.fooddeliveryproject.service.CartService;
import com.edubridge.fooddeliveryproject.service.CategoryService;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartRepository cartRepository;
	
	
	public CartServiceImpl(CartRepository cartRepository) {
		super();
		this.cartRepository = cartRepository;
	}

	@Override
	public Cart saveCart(Cart cart) {
		// TODO Auto-generated method stub
		System.out.println("In service"+ cart);
		return(Cart) cartRepository.save(cart);
	}

	@Override
	public List<Cart> getCart() {
		// TODO Auto-generated method stub
		return cartRepository.findAll()  ;
	}

	@Override
	public Cart getCartById(long cartId) {
		return null;
		// TODO Auto-generated method stub
		//return cartRepository.findById(cartId).orElseThrow(()->new UserNotFoundException("Cart","CartId",cartId)); 
		//return cartRepository.findById(cartId).orElseThrow(()->new UserNotFoundException("Cart","CartId",cartId)); 
		
	}

	@Override
	public void deleteCartById(long cartId) {
		// TODO Auto-generated method stub
		//cartRepository.findById(cartId).orElseThrow(()->new UserNotFoundException("Cart","CartId",cartId)); 
		cartRepository.deleteById(cartId);
	}

	
}




	

	
