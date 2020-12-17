package somiah.jad.photogallery.API

import retrofit2.Call
import retrofit2.http.GET
import somiah.jad.photogallery.FlickrResponse

interface FlickrApi {

    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=yourApiKeyHere" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
    fun fetchPhotos(): Call<FlickrResponse>


//    @GET("/")
//    fun fetchContents(): Call<String>
}
