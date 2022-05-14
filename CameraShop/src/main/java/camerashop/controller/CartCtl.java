package camerashop.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import camerashop.bean.CartBean;
import camerashop.bean.ProductBean;
import camerashop.bean.UserBean;
import camerashop.exception.ApplicationException;
import camerashop.exception.DuplicateRecordException;
import camerashop.model.CartModel;
import camerashop.model.ProductModel;
import camerashop.util.DataUtility;
import camerashop.util.ServletUtility;

/**
 * Servlet implementation class CartCtl
 */
@WebServlet(name="CartCtl",urlPatterns={"/ctl/CartCtl"})
public class CartCtl extends BaseCtl {
	private static final long serialVersionUID = 1L;
       
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Long proId=DataUtility.getLong(request.getParameter("prodId"));
		HttpSession session=request.getSession();
		UserBean uBean=(UserBean)session.getAttribute("user");
		
		ProductModel pModel=new ProductModel();
		ProductBean pBean=null;
		
		CartModel model=new CartModel();
		CartBean bean=new CartBean();
		
		Long id=DataUtility.getLong(request.getParameter("id"));
		long quantity=DataUtility.getLong(request.getParameter("quantity"));
		
		try {
			
			if(id>0) {
				CartBean crBean=model.findByPK(id);
				crBean.setQuantity(quantity);
				model.update(crBean);	
				ServletUtility.redirect(SOTGView.CART_LIST_CTL, request, response);
			}else {
			CartBean cBean= model.findByproIdAndUserId(proId,uBean.getId());
			if(cBean==null) {
			pBean=pModel.findByPK(proId);
			bean.setProductId(proId);
			bean.setUserId(uBean.getId());
			bean.setQuantity(1);
			bean.setFinalAmount(pBean.getPrice()*bean.getQuantity());
			model.add(bean);
			ServletUtility.redirect(SOTGView.CART_LIST_CTL, request, response);
			}else {
				ServletUtility.redirect(SOTGView.CART_LIST_CTL, request, response);
			}
			
			}
		} catch (ApplicationException e) {
			ServletUtility.handleException(e, request, response);
			e.printStackTrace();
		} catch (DuplicateRecordException e) {
			
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	@Override
	protected String getView() {
		// TODO Auto-generated method stub
		return null;
	}

}
