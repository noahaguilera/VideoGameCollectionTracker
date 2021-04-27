package rest;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Game {

	@JsonProperty("added")
	private int added;

	@JsonProperty("name_original")
	private String nameOriginal;

	@JsonProperty("rating")
	private double rating;

	@JsonProperty("game_series_count")
	private int gameSeriesCount;

	@JsonProperty("playtime")
	private int playtime;


	@JsonProperty("rating_top")
	private int ratingTop;

	@JsonProperty("reviews_text_count")
	private int reviewsTextCount;


	@JsonProperty("achievements_count")
	private int achievementsCount;

	@JsonProperty("id")
	private int id;


	@JsonProperty("reddit_name")
	private String redditName;

	@JsonProperty("ratings_count")
	private int ratingsCount;

	@JsonProperty("slug")
	private String slug;

	@JsonProperty("released")
	private String released;

	@JsonProperty("youtube_count")
	private int youtubeCount;

	@JsonProperty("movies_count")
	private int moviesCount;

	@JsonProperty("description_raw")
	private String descriptionRaw;

	@JsonProperty("background_image")
	private String backgroundImage;

	@JsonProperty("tba")
	private boolean tba;

	@JsonProperty("dominant_color")
	private String dominantColor;

	@JsonProperty("name")
	private String name;

	@JsonProperty("reddit_description")
	private String redditDescription;

	@JsonProperty("reddit_logo")
	private String redditLogo;

	@JsonProperty("updated")
	private String updated;

	@JsonProperty("reviews_count")
	private int reviewsCount;

	@JsonProperty("metacritic")
	private int metacritic;

	@JsonProperty("description")
	private String description;

	@JsonProperty("metacritic_url")
	private String metacriticUrl;

	@JsonProperty("alternative_names")
	private List<Object> alternativeNames;

	@JsonProperty("parents_count")
	private int parentsCount;

	@JsonProperty("user_game")
	private Object userGame;

	@JsonProperty("metacritic_platforms")
	private List<Object> metacriticPlatforms;

	@JsonProperty("creators_count")
	private int creatorsCount;

	@JsonProperty("saturated_color")
	private String saturatedColor;

	@JsonProperty("reddit_url")
	private String redditUrl;

	@JsonProperty("reddit_count")
	private int redditCount;

	@JsonProperty("parent_achievements_count")
	private int parentAchievementsCount;

	@JsonProperty("website")
	private String website;

	@JsonProperty("suggestions_count")
	private int suggestionsCount;

	@JsonProperty("additions_count")
	private int additionsCount;

	@JsonProperty("twitch_count")
	private int twitchCount;

	@JsonProperty("background_image_additional")
	private String backgroundImageAdditional;

	@JsonProperty("esrb_rating")
	private EsrbRating esrbRating;

	@JsonProperty("screenshots_count")
	private int screenshotsCount;

	@JsonProperty("clip")
	private Object clip;

	public void setAdded(int added){
		this.added = added;
	}

	public int getAdded(){
		return added;
	}

	public void setNameOriginal(String nameOriginal){
		this.nameOriginal = nameOriginal;
	}

	public String getNameOriginal(){
		return nameOriginal;
	}

	public void setRating(double rating){
		this.rating = rating;
	}

	public double getRating(){
		return rating;
	}

	public void setGameSeriesCount(int gameSeriesCount){
		this.gameSeriesCount = gameSeriesCount;
	}

	public int getGameSeriesCount(){
		return gameSeriesCount;
	}

	public void setPlaytime(int playtime){
		this.playtime = playtime;
	}

	public int getPlaytime(){
		return playtime;
	}

	public void setRatingTop(int ratingTop){
		this.ratingTop = ratingTop;
	}

	public int getRatingTop(){
		return ratingTop;
	}

	public void setReviewsTextCount(int reviewsTextCount){
		this.reviewsTextCount = reviewsTextCount;
	}

	public int getReviewsTextCount(){
		return reviewsTextCount;
	}

	public void setAchievementsCount(int achievementsCount){
		this.achievementsCount = achievementsCount;
	}

	public int getAchievementsCount(){
		return achievementsCount;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setRedditName(String redditName){
		this.redditName = redditName;
	}

	public String getRedditName(){
		return redditName;
	}

	public void setRatingsCount(int ratingsCount){
		this.ratingsCount = ratingsCount;
	}

	public int getRatingsCount(){
		return ratingsCount;
	}

	public void setSlug(String slug){
		this.slug = slug;
	}

	public String getSlug(){
		return slug;
	}

	public void setReleased(String released){
		this.released = released;
	}

	public String getReleased(){
		return released;
	}

	public void setYoutubeCount(int youtubeCount){
		this.youtubeCount = youtubeCount;
	}

	public int getYoutubeCount(){
		return youtubeCount;
	}

	public void setMoviesCount(int moviesCount){
		this.moviesCount = moviesCount;
	}

	public int getMoviesCount(){
		return moviesCount;
	}

	public void setDescriptionRaw(String descriptionRaw){
		this.descriptionRaw = descriptionRaw;
	}

	public String getDescriptionRaw(){
		return descriptionRaw;
	}


	public void setBackgroundImage(String backgroundImage){
		this.backgroundImage = backgroundImage;
	}

	public String getBackgroundImage(){
		return backgroundImage;
	}

	public void setTba(boolean tba){
		this.tba = tba;
	}

	public boolean isTba(){
		return tba;
	}

	public void setDominantColor(String dominantColor){
		this.dominantColor = dominantColor;
	}

	public String getDominantColor(){
		return dominantColor;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setRedditDescription(String redditDescription){
		this.redditDescription = redditDescription;
	}

	public String getRedditDescription(){
		return redditDescription;
	}

	public void setRedditLogo(String redditLogo){
		this.redditLogo = redditLogo;
	}

	public String getRedditLogo(){
		return redditLogo;
	}

	public void setUpdated(String updated){
		this.updated = updated;
	}

	public String getUpdated(){
		return updated;
	}

	public void setReviewsCount(int reviewsCount){
		this.reviewsCount = reviewsCount;
	}

	public int getReviewsCount(){
		return reviewsCount;
	}

	public void setMetacritic(int metacritic){
		this.metacritic = metacritic;
	}

	public int getMetacritic(){
		return metacritic;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setMetacriticUrl(String metacriticUrl){
		this.metacriticUrl = metacriticUrl;
	}

	public String getMetacriticUrl(){
		return metacriticUrl;
	}

	public void setAlternativeNames(List<Object> alternativeNames){
		this.alternativeNames = alternativeNames;
	}

	public List<Object> getAlternativeNames(){
		return alternativeNames;
	}

	public void setParentsCount(int parentsCount){
		this.parentsCount = parentsCount;
	}

	public int getParentsCount(){
		return parentsCount;
	}

	public void setUserGame(Object userGame){
		this.userGame = userGame;
	}

	public Object getUserGame(){
		return userGame;
	}

	public void setMetacriticPlatforms(List<Object> metacriticPlatforms){
		this.metacriticPlatforms = metacriticPlatforms;
	}

	public List<Object> getMetacriticPlatforms(){
		return metacriticPlatforms;
	}

	public void setCreatorsCount(int creatorsCount){
		this.creatorsCount = creatorsCount;
	}

	public int getCreatorsCount(){
		return creatorsCount;
	}


	public void setSaturatedColor(String saturatedColor){
		this.saturatedColor = saturatedColor;
	}

	public String getSaturatedColor(){
		return saturatedColor;
	}


	public void setRedditUrl(String redditUrl){
		this.redditUrl = redditUrl;
	}

	public String getRedditUrl(){
		return redditUrl;
	}

	public void setRedditCount(int redditCount){
		this.redditCount = redditCount;
	}

	public int getRedditCount(){
		return redditCount;
	}

	public void setParentAchievementsCount(int parentAchievementsCount){
		this.parentAchievementsCount = parentAchievementsCount;
	}

	public int getParentAchievementsCount(){
		return parentAchievementsCount;
	}

	public void setWebsite(String website){
		this.website = website;
	}

	public String getWebsite(){
		return website;
	}

	public void setSuggestionsCount(int suggestionsCount){
		this.suggestionsCount = suggestionsCount;
	}

	public int getSuggestionsCount(){
		return suggestionsCount;
	}


	public void setAdditionsCount(int additionsCount){
		this.additionsCount = additionsCount;
	}

	public int getAdditionsCount(){
		return additionsCount;
	}

	public void setTwitchCount(int twitchCount){
		this.twitchCount = twitchCount;
	}

	public int getTwitchCount(){
		return twitchCount;
	}

	public void setBackgroundImageAdditional(String backgroundImageAdditional){
		this.backgroundImageAdditional = backgroundImageAdditional;
	}

	public String getBackgroundImageAdditional(){
		return backgroundImageAdditional;
	}

	public void setEsrbRating(EsrbRating esrbRating){
		this.esrbRating = esrbRating;
	}

	public EsrbRating getEsrbRating(){
		return esrbRating;
	}

	public void setScreenshotsCount(int screenshotsCount){
		this.screenshotsCount = screenshotsCount;
	}

	public int getScreenshotsCount(){
		return screenshotsCount;
	}

	public void setClip(Object clip){
		this.clip = clip;
	}

	public Object getClip(){
		return clip;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"added = '" + added + '\'' +
			",name_original = '" + nameOriginal + '\'' + 
			",rating = '" + rating + '\'' + 
			",game_series_count = '" + gameSeriesCount + '\'' + 
			",playtime = '" + playtime + '\'' +
			",rating_top = '" + ratingTop + '\'' + 
			",reviews_text_count = '" + reviewsTextCount + '\'' +
			",achievements_count = '" + achievementsCount + '\'' + 
			",id = '" + id + '\'' +
			",reddit_name = '" + redditName + '\'' + 
			",ratings_count = '" + ratingsCount + '\'' + 
			",slug = '" + slug + '\'' + 
			",released = '" + released + '\'' + 
			",youtube_count = '" + youtubeCount + '\'' + 
			",movies_count = '" + moviesCount + '\'' + 
			",description_raw = '" + descriptionRaw + '\'' +
			",background_image = '" + backgroundImage + '\'' + 
			",tba = '" + tba + '\'' + 
			",dominant_color = '" + dominantColor + '\'' + 
			",name = '" + name + '\'' + 
			",reddit_description = '" + redditDescription + '\'' + 
			",reddit_logo = '" + redditLogo + '\'' + 
			",updated = '" + updated + '\'' + 
			",reviews_count = '" + reviewsCount + '\'' + 
			",metacritic = '" + metacritic + '\'' + 
			",description = '" + description + '\'' + 
			",metacritic_url = '" + metacriticUrl + '\'' + 
			",alternative_names = '" + alternativeNames + '\'' + 
			",parents_count = '" + parentsCount + '\'' + 
			",user_game = '" + userGame + '\'' + 
			",metacritic_platforms = '" + metacriticPlatforms + '\'' + 
			",creators_count = '" + creatorsCount + '\'' +
			",saturated_color = '" + saturatedColor + '\'' +
			",reddit_url = '" + redditUrl + '\'' + 
			",reddit_count = '" + redditCount + '\'' + 
			",parent_achievements_count = '" + parentAchievementsCount + '\'' + 
			",website = '" + website + '\'' + 
			",suggestions_count = '" + suggestionsCount + '\'' +
			",additions_count = '" + additionsCount + '\'' + 
			",twitch_count = '" + twitchCount + '\'' + 
			",background_image_additional = '" + backgroundImageAdditional + '\'' + 
			",esrb_rating = '" + esrbRating + '\'' + 
			",screenshots_count = '" + screenshotsCount + '\'' +
			",clip = '" + clip + '\'' + 
			"}";
		}
}