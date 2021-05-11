package rest;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Esrb rating.
 */
public class EsrbRating{

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private int id;

	@JsonProperty("slug")
	private String slug;

	/**
	 * Set name.
	 *
	 * @param name the name
	 */
	public void setName(String name){
		this.name = name;
	}

	/**
	 * Get name string.
	 *
	 * @return the string
	 */
	public String getName(){
		return name;
	}

	/**
	 * Set id.
	 *
	 * @param id the id
	 */
	public void setId(int id){
		this.id = id;
	}

	/**
	 * Get id int.
	 *
	 * @return the int
	 */
	public int getId(){
		return id;
	}

	/**
	 * Set slug.
	 *
	 * @param slug the slug
	 */
	public void setSlug(String slug){
		this.slug = slug;
	}

	/**
	 * Get slug string.
	 *
	 * @return the string
	 */
	public String getSlug(){
		return slug;
	}

	@Override
 	public String toString(){
		return 
			"EsrbRating{" + 
			"name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",slug = '" + slug + '\'' + 
			"}";
		}
}