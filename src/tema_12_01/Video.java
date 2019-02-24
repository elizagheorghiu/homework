package tema_12_01;

import java.util.ArrayList;
import java.util.List;

public class Video {

	String title;
	boolean checked;

	List<Integer> ratings = new ArrayList<>();

	public Video(String title) {
		this.title = title;
	}

	void receiveRating(int rating) {
		ratings.add(rating);
	}

	void returnVideo(String title) {

	}

	public String getTitle() {
		return title;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public double avgRating(double avgRating) {
		int allRatings = 0;
		int numberRatings = 0;
		for (Integer rating : ratings) {
			allRatings += rating;
			numberRatings = ratings.size();
		}
		avgRating = allRatings / numberRatings;
		return avgRating;
	}

	public double likes(double likes) {

		int numberRatings = 0;
		int numberLikes = 0;
		for (Integer rating : ratings) {
			if (rating > 4) {

				numberLikes += rating;
				numberRatings = ratings.size();
			}

		}
		if (numberRatings == 0) {
			return 0;
		}

		likes = numberLikes / numberRatings;
		int rating = 0;
		numberLikes += rating;
		numberRatings = ratings.size();

		if (numberRatings == 0) {
			return 0;
		}
		likes = numberLikes / numberRatings;
		return likes;
	}
}
