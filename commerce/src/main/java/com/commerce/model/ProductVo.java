package com.commerce.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductVo {
	private String productId;
	private String name;
	private String desc;
}
