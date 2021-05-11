package rest;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Game.
 */
public class Game {

	@JsonProperty("released")
	private String released;

	@JsonProperty("background_image")
	private String backgroundImage;

	@JsonProperty("name")
	private String name;

	@JsonProperty("description")
	private String description;

	@JsonProperty("esrb_rating")
	private EsrbRating esrbRating;

	/**
	 * Set released.
	 *
	 * @param released the released
	 */
	public void setReleased(String released){
		this.released = released;
	}

	/**
	 * Get released string.
	 *
	 * @return the string
	 */
	public String getReleased(){
		return released;
	}

	/**
	 * Set background image.
	 *
	 * @param backgroundImage the background image
	 */
	public void setBackgroundImage(String backgroundImage){
		this.backgroundImage = backgroundImage;
	}

	/**
	 * Get background image string.
	 *
	 * @return the string
	 */
	public String getBackgroundImage(){
		return backgroundImage;
	}

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
	 * Set description.
	 *
	 * @param description the description
	 */
	public void setDescription(String description){
		this.description = description;
	}

	/**
	 * Get description string.
	 *
	 * @return the string
	 */
	public String getDescription(){
		return description;
	}

	/**
	 * Set esrb rating.
	 *
	 * @param esrbRating the esrb rating
	 */
	public void setEsrbRating(EsrbRating esrbRating){
		this.esrbRating = esrbRating;
	}

	/**
	 * Get esrb rating esrb rating.
	 *
	 * @return the esrb rating
	 */
	public EsrbRating getEsrbRating(){
		return esrbRating;
	}

	@Override
 	public String toString(){
		return 
			"Response{" +
			",released = '" + released + '\'' +
			",background_image = '" + backgroundImage + '\'' +
			",name = '" + name + '\'' +
			",description = '" + description + '\'' +
			",esrb_rating = '" + esrbRating + '\'' +
			"}";
		}
}