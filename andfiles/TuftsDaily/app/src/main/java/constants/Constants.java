package constants;

/**
 * Created by Benard Ngaruiya on 11/8/2017.
 */

public class Constants {
    public static final String url = "https://tuftsdaily.com/wp-json/wp/v2/posts/?filter[category_name]=DailyCategories&per_page=100&fields=id,date,link,title,better_featured_image";
    public static final String getCategoriesURL = "https://tuftsdaily.com/wp-json/wp/v2/categories?fields=id,description,name";
    public static final String get_category_posts = "https://tuftsdaily.com/wp-json/wp/v2/posts?categories=CATEGORY_ID&fields=id,date,link,title,better_featured_image";
    public static final String get_content_byID = "https://tuftsdaily.com/wp-json/wp/v2/posts/POST_ID?fields=content";
    public static final String dailyPages = "https://tuftsdaily.com/wp-json/wp/v2/pages/PAGE_ID?fields=content";
}
