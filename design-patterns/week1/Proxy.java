import java.util.HashMap;

/* Structural Pattern. An object acts as proxy to a object: process request before send to service
*/


	// allow polymorphism between proxy and service
public interface ThirdPartyYoutubeLib {
	HashMap<String, Video> popularVideos();

	Video getVideo(String videoID);
}


	

public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib {

	// Service which implements interface

    @Override
    public HashMap<String, Video> popularVideos() {
        connectToServer("http://www.youtube.com");
        return getRandomVideos();
    }

    @Override
    public Video getVideo(String videoId) {
        connectToServer("http://www.youtube.com/" + videoId);
        return getSomeVideo(videoId);
    }
}

// cache Proxy


