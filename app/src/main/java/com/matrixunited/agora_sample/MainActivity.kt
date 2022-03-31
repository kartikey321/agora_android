package com.matrixunited.agora_sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import io.agora.agorauikit_android.AgoraConnectionData
import io.agora.agorauikit_android.AgoraVideoViewer
import io.agora.rtc.Constants

class MainActivity : AppCompatActivity() {
    @OptIn(ExperimentalUnsignedTypes::class)
    var agView: AgoraVideoViewer?=null
    var appId:String?=""
    var token:String?="006f9f5237847ae49a29bf1c26af1b71ae2IACrRiDpaoc1SPwNfLhMmwC14UsnYbRlV7MlUJfCRxzkWSIEJbwAAAAAEAAJmhJvqvlGYgEAAQCq+UZi"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        agView = AgoraVideoViewer(this, AgoraConnectionData(appId!!,token))
        this.addContentView(agView,FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,FrameLayout.LayoutParams.MATCH_PARENT))

        agView!!.join("kartikey",role = Constants.CLIENT_ROLE_BROADCASTER)
    }
}