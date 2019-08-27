package com.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	
	private Integer id;		// 商品id
	private String name;	// 商品名称
	private Integer number;	// 商品数量

}
