package jp.techacademy.ayumi.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class TimezoneBrodcastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.


        TODO("TimezoneBrodcastReceiver.onReceive() is not implemented")


        Toast.makeText(context, "タイムゾーンが変化しました",
            Toast.LENGTH_LONG).show()
    }
}
