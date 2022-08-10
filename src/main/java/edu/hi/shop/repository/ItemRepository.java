package edu.hi.shop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.hi.shop.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
	List<Item> findByItemNm(String itemNm);
	List<Item> findByItemNmContaining(String itemNm);
	List<Item> findByItemNmLike(String itemNm);
	
	
}