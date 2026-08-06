package com.sist.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sist.web.entity.Recipe;
import java.util.*;
public interface RecipeRepository extends JpaRepository<Recipe, Integer> {
	public List<Recipe> findByTitleContains(String title);
	public List<Recipe> findByChefContains(String chef);
	/*
	 *   findBy 컬럼명 연산자
	 *   		---- ----
	 *   findByName(String name)
	 *   => WHERE name=? ========> equals
	 *   findBytitleStartsWith(String title)
	 *   => WHERE title LIKE 'title%'
	 *   findBytitleEndsWith(String title)
	 *   => WHERE title LIKE '%title'
	 *   findBytitleContains(String title)
	 *   => WHERE title LIKE '%title%'
	 *   findByOrderByTitleDesc()
	 *   
	 *   findAll(Pageable , Sort)
	 *   count()
	 *   save() / delete()
	 */
}
