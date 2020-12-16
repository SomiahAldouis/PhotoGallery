package somiah.jad.photogallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class GalleryPhotoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery_photo)

        val isFragmentContainerEmpty = savedInstanceState == null
        if (isFragmentContainerEmpty) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragmentContainer, FragmentPhotoGallery.newInstance())
                .commit()
        }

    }
}