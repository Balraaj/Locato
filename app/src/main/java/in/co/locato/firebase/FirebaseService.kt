package `in`.co.locato.firebase

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class FirebaseService: FirebaseMessagingService() {
    override fun onNewToken(p0: String?) {
        Log.d("Firebase new token", p0)
    }

    override fun onMessageReceived(p0: RemoteMessage?) {
        Log.d("Firebase notification", p0?.notification.toString())
    }
}