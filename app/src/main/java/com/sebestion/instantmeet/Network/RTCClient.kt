package com.sebestion.instantmeet.Network

import android.app.Application
import com.sebestion.instantmeet.Observer.PeerConnectionObserver
import org.webrtc.EglBase
import org.webrtc.PeerConnection
import org.webrtc.PeerConnectionFactory

class RTCClient(
    private val peerConnection: PeerConnection,
    private val application: Application,
    private val uName:String,
    private val observer:PeerConnectionObserver
) {
    init {
        initcreatePeerConnectionFactory(application)
    }

    private fun initcreatePeerConnectionFactory(application: Application) {
       val peerConnectionOption=PeerConnectionFactory.InitializationOptions.builder(application)
           .setEnableInternalTracer(true)
           .setFieldTrials("WebRTC-H264HighProfile/Enabled/")
           .createInitializationOptions()

        PeerConnectionFactory.initialize(peerConnectionOption)
    }

    private val iceServer= listOf(
        PeerConnection.IceServer.builder("stun:iphone-stun.strato-iphone.de:3478").createIceServer(),
        PeerConnection.IceServer("stun:stun.l.google.com:19302"),
        PeerConnection.IceServer("stun:stun.services.mozilla.com")
    )
    private val eglContext= EglBase.create()
    private val peerConnectionFactory by lazy { createPeerConnectionFactory() }


    private fun createPeerConnectionFactory() {
        TODO("Not yet implemented")
    }
}
