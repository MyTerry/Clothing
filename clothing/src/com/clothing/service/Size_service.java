package com.clothing.service;

import java.util.List;

import com.clothing.dao_mapper.*;
import com.clothing.pojo.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
//�����ǳ���Service
public class Size_service {
  @Autowired
  Goods_details Goods_details;
  public List<Size> selectsizeAll(){
	  System.out.println("���ǲ�ѯSize");
	  return Goods_details.selectsize();
  }
}
