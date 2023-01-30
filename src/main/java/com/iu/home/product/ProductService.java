package com.iu.home.product;

public class ProductService {

	public static void main(String[] args) {
		ProductDAO productDAO = new ProductDAO();
		
		
		// PK로 사용하는 키중에 SEQ로 사용하는지 안하는지 확인해야함  ProductDTO = PRODUCTNUM / OptionDTO = OPTIONNUM 
		ProductDTO productDTO = new ProductDTO();
		productDTO.setProductName("product1");
		productDTO.setProductDetail("detail1");
		
		//DTO : 데이터를 운반
		OptionDTO optionDTO = new OptionDTO();
		optionDTO.setOptionName("optionName1");
		optionDTO.setOptionPrice(100L);
		optionDTO.setOptionStock(10L);
		optionDTO.setProductNum(null);
		
		OptionDTO optionDTO2 = new OptionDTO();
		optionDTO2.setOptionName("optionName1");
		optionDTO2.setOptionPrice(200L);
		optionDTO2.setOptionStock(20L);
		optionDTO2.setProductNum(null);
		
		try {
			Long num = productDAO.getProductNum();
			productDTO.setProductNum(num);
			
			int result= productDAO.setAddProduct(productDTO);
						
			optionDTO.setProductNum(num);
			
			if(result>0) {
				productDAO.setAddOption(optionDTO);
			
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
