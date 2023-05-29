package OOPS;
import java.util.Scanner;

class Video {
    private String videoName;
    private boolean checkout;
    private int rating;

    public Video(String name) {
        this.videoName = name;
        this.checkout = false;
        this.rating = 0;
    }

    public String getName() {
        return videoName;
    }

    public void doCheckout() {
        checkout = true;
    }

    public void doReturn() {
        checkout = false;
    }

    public void receiveRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public boolean getCheckout() {
        return checkout;
    }
}

class VideoStore {
    private Video[] store;

    public VideoStore() {
        store = new Video[10];
    }

    public void addVideo(String name) {
        for (int i = 0; i < store.length; i++) {
            if (store[i] == null) {
                store[i] = new Video(name);
                System.out.println("Video \"" + name + "\" added successfully.");
                return;
            }
        }
        System.out.println("Video store is full. Cannot add more videos.");
    }

    public void doCheckout(String name) {
        for (Video video : store) {
            if (video != null && video.getName().equals(name)) {
                if (!video.getCheckout()) {
                    video.doCheckout();
                    System.out.println("Video \"" + name + "\" checked out successfully.");
                } else {
                    System.out.println("Video \"" + name + "\" is already checked out.");
                }
                return;
            }
        }
        System.out.println("Video \"" + name + "\" not found in the store.");
    }

    public void doReturn(String name) {
        for (Video video : store) {
            if (video != null && video.getName().equals(name)) {
                if (video.getCheckout()) {
                    video.doReturn();
                    System.out.println("Video \"" + name + "\" returned successfully.");
                } else {
                    System.out.println("Video \"" + name + "\" is not checked out.");
                }
                return;
            }
        }
        System.out.println("Video \"" + name + "\" not found in the store.");
    }

    public void receiveRating(String name, int rating) {
        for (Video video : store) {
            if (video != null && video.getName().equals(name)) {
                video.receiveRating(rating);
                System.out.println("Rating \"" + rating + "\" has been mapped to the Video \"" + name + "\".");
                return;
            }
        }
        System.out.println("Video \"" + name + "\" not found in the store.");
    }

    public void listInventory() {
        System.out.println("--------------------------------------------------------");
        System.out.printf("%-20s | %-20s | %-10s%n", "Video Name", "Checkout Status", "Rating");
        System.out.println("--------------------------------------------------------");
        for (Video video : store) {
            if (video != null) {
                System.out.printf("%-20s | %-20s | %-10s%n", video.getName(), video.getCheckout(), video.getRating());
            }
        }
        System.out.println("--------------------------------------------------------");
    }
}

public class MiniProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VideoStore videoStore = new VideoStore();

        int choice;
        do {
            System.out.println("\nMAIN MENU=========");
            System.out.println("1. Add Videos");
            System.out.println("2. Check Out Video");
            System.out.println("3. Return Video");
            System.out.println("4. Receive Rating");
            System.out.println("5. List Inventory");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1..6): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the video you want to add: ");
                    sc.nextLine(); // Clear the input buffer
                    String videoName = sc.nextLine();
                    videoStore.addVideo(videoName);
                    break;
                case 2:
                    System.out.print("Enter the name of the video you want to check out: ");
                    sc.nextLine(); // Clear the input buffer
                    String checkoutVideo = sc.nextLine();
                    videoStore.doCheckout(checkoutVideo);
                    break;
                case 3:
                    System.out.print("Enter the name of the video you want to return: ");
                    sc.nextLine(); 
                    String returnVideo = sc.nextLine();
                    videoStore.doReturn(returnVideo);
                    break;
                case 4:
                    System.out.print("Enter the name of the video you want to rate: ");
                    sc.nextLine(); // Clear the input buffer
                    String rateVideo = sc.nextLine();
                    System.out.print("Enter the rating for this video: ");
                    int rating = sc.nextInt();
                    videoStore.receiveRating(rateVideo, rating);
                    break;
                case 5:
                    videoStore.listInventory();
                    break;
                case 6:
                    System.out.println("Exiting...!! Thanks for using the application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);
        sc.close();
    }
}
