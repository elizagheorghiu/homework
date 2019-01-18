
package tema_12_01;

import java.util.*;

public class VideoStore {
	static Scanner sc = new Scanner(System.in);//era si el neinitializat, insa daca nu il folosesti, 
												//ar fi trebuit sters
	static double avgRating;
	static double likes;
	String title;
	boolean checked;
	static List<Video> videosList = new ArrayList<>();

	static void addVideo(String title) {
		videosList.add(new Video(title));
		System.out.println("You have added video: " + title);
	}

	static void checkOut(String title) {
		for (Video video : videosList) {
			if (title.equals(video.getTitle()) && !video.isChecked()) {
				video.setChecked(true);
				System.out.println("You have checked out the video: " + title);
			}
		}
	}

	static void returnVideo(String title) {
		for (Video video : videosList) {
			if (video.getTitle() == title && video.isChecked()) {
				video.setChecked(false);
				System.out.println("You have returned the video: " + title);
			}
		}
	}

	static void receiveRating(String title, int rating) {

		for (Video video : videosList) {
			if (video.getTitle() == title) {
				video.receiveRating(rating);
				System.out.println("You have rated the video: " + title + rating);
			}
		}
	}

	static void avgRating(String title, double avgRating) {
		for (Video video : videosList) {
			if (video.getTitle() == title) {
				video.AvgRating(avgRating);
				System.out.println("You have rated the video: " + title + avgRating);
			}
		}
	}

	public static double getAvgRating() {
		return avgRating;
	}

	public static void setAvgRating(double avgRating) {
		VideoStore.avgRating = avgRating;
	}

	public static double getLikes() {
		return likes;
	}

	public static void setLikes(double likes) {
		// bravo ca te-ai prins cum elimini conflictul de nume in cazul campurilor statice
		VideoStore.likes = likes;
	}

	static void listInventory() {
		for (Video video : videosList) {
			System.out.println("Video title: " + video.getTitle());
			System.out.println("Video is checked out: " + video.isChecked());
			System.out.println("Video has average rating: " + video.AvgRating(avgRating));
			System.out.println("Video has this % of likes: " + video.Likes(likes));
		}

	}

}
